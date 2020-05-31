package com.dropwizard.kickstart.config;

import io.dropwizard.Configuration;

public class EmployeeConfiguration extends Configuration {

    private String dbName;

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }
}
