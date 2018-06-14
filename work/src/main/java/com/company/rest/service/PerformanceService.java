package com.company.rest.service;

import com.company.Performance;
import com.company.persistence.dao.PerformanceDao;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/performances")
@SessionScoped
public class PerformanceService implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private PerformanceDao dao;

    @GET
    @Path("{id}/")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Performance getId(@PathParam("id") Integer id) {
        return dao.findById(id);
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response updatePerformance(Performance performance) {
        dao.persist(performance);
        return Response.status(200).entity("Good").build();
    }

    @PUT
    public Response createPerformance(Performance performance) {
        dao.persist(performance);
        return Response.ok().build();
    }
    @GET
    @Path("/size")
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,MediaType.TEXT_XML})
    public String getPrice() {
        return "Yes";
    }
}