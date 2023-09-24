package com.tencerspencer.app;

import java.util.Set;

import org.apache.logging.log4j.Logger;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

// this might need to be request scoped? not sure
@ApplicationScoped
@Transactional
public class PolygonReducerService implements IPolygonReducerService {

    @Inject
    private Logger logger;
    
    public void addShape(Set<Point> points) {
        logger.info("points sent to add to shape: {}", points);
    }

}
