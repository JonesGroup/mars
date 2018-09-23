package com.jones.mars.repository;

import com.jones.mars.model.Block;
import com.jones.mars.model.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlockMapper extends BaseMapper<Block> {
    List<Object> findAllName(Query query);
}
