package com.jones.mars.repository;


import com.jones.mars.model.query.Query;

import java.util.List;

public interface BaseMapper<T> {
    List<T> findList(Query paramQuery);

    T findOne(Integer id);

    Integer findCount(Query paramQuery);

    List<T> findAll(Query paramQuery);

    void insert(Object param);

    void update(T param);

    void delete(Integer id);
}

