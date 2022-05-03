package com.dobraccoonsoft.wordlearnerback.words;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface WordInfoRepository extends CrudRepository<WordInfo, Long> {

    @Override
    List<WordInfo> findAll();

    //TODO: Fix current date problem
    @Query(value = "SELECT * FROM word_info WHERE create_dt > CURRENT_DATE", nativeQuery = true)
    List<WordInfo> findByCurrentDate();
}
