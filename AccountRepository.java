package com.aexp.esi.esiapi.dao;

import com.aexp.esi.esiapi.OracleMapping;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends CrudRepository<OracleMapping, Integer> {

    @Query(value = "SELECT o FROM OracleMapping o WHERE dbStatusCD = '68'")
    List<OracleMapping> findAllByDbStatusCD(String dbStatusCD, Pageable pageable);

    //attempt to query account numbers
//    public static final String TESTING_Q = "SELECT dbAccounts FROM OracleMapping";
//    @Query(value = TESTING_Q, nativeQuery = true)
//    public List<Object[]> findAllByDbStatusCD(String dbStatusCD, Pageable pageable);
}


//    public static final String FIND_PROJECTS = "SELECT projectId, projectName FROM projects";
//
//    @Query(value = FIND_PROJECTS, nativeQuery = true)
//    public List<Object[]> findProjects();