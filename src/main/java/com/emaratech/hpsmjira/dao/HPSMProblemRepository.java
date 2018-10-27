package com.emaratech.hpsmjira.dao;

import com.emaratech.hpsmjira.model.HPSMProblem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Santosh.Sharma on 10/27/2018.
 */

@Repository
public interface HPSMProblemRepository extends CrudRepository<HPSMProblem, Long> {

}
