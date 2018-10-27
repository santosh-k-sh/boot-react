package com.emaratech.hpsmjira.dao;

import com.emaratech.hpsmjira.model.HPSMProblem;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

/**
 * Created by Santosh.Sharma on 10/27/2018.
 */

@Repository
public class HPSMProblemDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void saveHPSMProblem(HPSMProblem hpsmProblem) {
        entityManager.persist(hpsmProblem);
    }
}
