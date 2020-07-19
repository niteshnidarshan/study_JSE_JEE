package com.jersey.rest.hibernate.jersey_rest;

import java.util.List;

import com.jersey.rest.hibernate.jersey_rest.dao.EmployeeDao;
import com.jersey.rest.hibernate.jersey_rest.model.Employee;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.Response;

@Path("/employees")
public class EmployeeResource {

	@GET
	@Path("/name")
	@Consumes("application/json")
	public String getEmployeeName(){
		return "Jai Ram G ki ...";
	}
	
	@GET
	@Consumes("application/json")
	public List<Employee> getEmployees(){
		EmployeeDao dao = new EmployeeDao();
		List employees = dao.getEmployees();
		return employees;
	}
	
	@POST
    @Path("/create")
    @Consumes("application/json")
    public Response addEmployee(Employee emp){
        emp.setName(emp.getName());
        emp.setAge(emp.getAge());
                
        EmployeeDao dao = new EmployeeDao();
        dao.addEmployee(emp);
        
        return Response.ok().build();
    }
    
    @PUT
    @Path("/update/{id}")
    @Consumes("application/json")
    public Response updateEmployee(@PathParam("id") int id, Employee emp){
        EmployeeDao dao = new EmployeeDao();
        int count = dao.updateEmployee(id, emp);
        if(count==0){
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
        return Response.ok().build();
    }
    
    @DELETE
    @Path("/delete/{id}")
    @Consumes("application/json")
    public Response deleteEmployee(@PathParam("id") int id){
        EmployeeDao dao = new EmployeeDao();
        int count = dao.deleteEmployee(id);
        if(count==0){
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
        return Response.ok().build();
    }
}
