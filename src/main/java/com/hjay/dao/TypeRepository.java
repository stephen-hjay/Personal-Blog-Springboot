package com.hjay.dao;

import com.hjay.po.Type;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @Author: HJAY
 * @Description: com.hjay.dao;
 * @version: 1.0
 */
public interface TypeRepository extends JpaRepository<Type,Long>{

    Type findByName(String name);


    /**
     * 查询type按照分页的方式
     * @param pageable
     * @return
     */
    @Query("select t from Type t")
    List<Type> findTop(Pageable pageable);

}
