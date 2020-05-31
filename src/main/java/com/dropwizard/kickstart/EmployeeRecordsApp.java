package com.dropwizard.kickstart;

import com.dropwizard.kickstart.config.EmployeeConfiguration;
import com.dropwizard.kickstart.healthcheck.EmployeeHealthCheck;
import com.dropwizard.kickstart.restapi.EmployeeResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class EmployeeRecordsApp extends Application<EmployeeConfiguration> {
    @Override
    public void run(EmployeeConfiguration configuration, Environment environment) throws Exception {

        //register the rest end point
        environment.jersey().register(new EmployeeResource());

        //register the health check. not mandatory
        environment.healthChecks().register("Employee-Health-Check", new EmployeeHealthCheck());
    }

    public static void main(String[] args) throws Exception {
        EmployeeRecordsApp app = new EmployeeRecordsApp();
        app.run(args);
    }
}
