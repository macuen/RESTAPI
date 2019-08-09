package com.aexp.esi.esiapi.controller;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DummyTestMapper implements RowMapper<DummyTest> {

    @Override
    public DummyTest mapRow(final ResultSet resultSet, final int rowNum) throws SQLException {

        return DummyTest.builder()
                .col1(resultSet.getString("COL1"))
                .col2(resultSet.getString("COL2"))
                .build();
    }
}
