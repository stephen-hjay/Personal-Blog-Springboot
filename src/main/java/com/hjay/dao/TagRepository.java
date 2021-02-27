package com.hjay.dao;

import com.hjay.po.Tag;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @Author: HJAY
 * @Description: com.hjay.dao;
 * @version: 1.0
 */
public interface TagRepository extends JpaRepository<Tag,Long>{
    Tag findByName(String name);


    @Query("select t from Tag t")
    List<Tag> findTop(Pageable pageable);

}
