package com.dropwizard.kickstart.healthcheck;

import com.codahale.metrics.health.HealthCheck;
import com.dropwizard.kickstart.dao.EmployeeDao;

public class EmployeeHealthCheck extends HealthCheck {
    @Override
    protected Result check() throws Exception {
        if(EmployeeDao.getListOfEmployee().size() ==0){
            return Result.unhealthy("no employee in the records");
        }
        return Result.healthy("number of emp: " + EmployeeDao.getListOfEmployee().size());
    }
}
