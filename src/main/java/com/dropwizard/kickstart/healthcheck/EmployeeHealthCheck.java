package com.dropwizard.kickstart.healthcheck;

import com.codahale.metrics.health.HealthCheck;
import com.dropwizard.kickstart.dao.EmployeeDao;

/**
 * A health check is basically a small self-test which your application performs to verify that a specific component or responsibility is performing
 * correctly. You can write your own custom logic there to verify specific module’s health.
 * Dropwizard has a HTTP resource endpoint on /healthcheck on the admin port (default 8081)
 *
 * DropWizard health check is implemented by extending the HealthCheck class and
 * returning Result.healthy() if everything is alright and Result.unhealthy() if something is not working – as expected.
 * */

public class EmployeeHealthCheck extends HealthCheck {
    @Override
    protected Result check() throws Exception {
        if(EmployeeDao.getListOfEmployee().size() ==0){
            return Result.unhealthy("no employee in the records");
        }
        return Result.healthy("number of emp: " + EmployeeDao.getListOfEmployee().size());
    }
}
