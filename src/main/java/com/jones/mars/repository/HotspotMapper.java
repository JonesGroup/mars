package com.jones.mars.repository;

import com.jones.mars.model.Hotspot;
import com.jones.mars.model.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HotspotMapper extends BaseMapper<Hotspot> {
    List<Object> findAllName(Query query);
}

