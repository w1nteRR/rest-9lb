package com.company.persistence.dao;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.Dependent;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.company.Performance;

@Named
@Dependent
public class PerformanceDaoImplementation extends AbstractDao<Performance> implements PerformanceDao, Serializable {

    private static final long serialVersionUID = 1L;

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    protected Class<Performance> getEntityClass() {
        return Performance.class;
    }
}