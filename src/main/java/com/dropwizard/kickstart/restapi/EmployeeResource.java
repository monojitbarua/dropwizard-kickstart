package com.dropwizard.kickstart.restapi;

import com.dropwizard.kickstart.dao.EmployeeDao;
import com.dropwizard.kickstart.vo.Employee;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/employeeRecord")
public class EmployeeResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getEmployeeRecords() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();

        if (EmployeeDao.getListOfEmployee().size() == 0){
            return "Employee db is empty. " +
                    "Please insert data by calling POST method with {\"name\":\"\", \"no\":\"\"} format";
        } else {
            return objectMapper.writeValueAsString(EmployeeDao.getListOfEmployee()) ;
        }
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String addEmployeeRecords(Employee emp) throws JsonProcessingException {
        EmployeeDao.addEmployeeInDb(emp);
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(emp);
    }

}
