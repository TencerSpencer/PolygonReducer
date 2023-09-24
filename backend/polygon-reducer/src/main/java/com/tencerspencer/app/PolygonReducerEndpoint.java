package com.tencerspencer.app;

import java.util.Set;

import jakarta.enterprise.context.RequestScoped;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.UriInfo;

@Path("")
@RequestScoped
@Transactional
public class PolygonReducerEndpoint {

    @Context
    private UriInfo uriInfo;

    @POST
    public void addShape(Set<Point> points) {

    }
}