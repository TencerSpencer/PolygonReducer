package com.tencerspencer.app;

import java.util.Set;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
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

    @Inject
    private IPolygonReducerService polygonReducerService;

    @POST
    public void addShape(Set<Point> points) {
        polygonReducerService.addShape(points);
    }
}