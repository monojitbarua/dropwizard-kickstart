package com.dropwizard.kickstart.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Employee {

    private String name;
    private int no;

    @JsonProperty
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty
    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }
}
