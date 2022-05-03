package com.dobraccoonsoft.wordlearnerback.words;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WordInfoService {

    private final WordInfoRepository wordInfoRepository;

    public WordInfoService(WordInfoRepository wordInfoRepository) {
        this.wordInfoRepository = wordInfoRepository;
    }

    public WordInfo create(final WordInfo wordInfo) {
        return wordInfoRepository.save(wordInfo);
    }

    public List<WordInfo> findAll() {
        return wordInfoRepository.findAll();
    }

    public List<WordInfo> findByCurrentDate() {
        return wordInfoRepository.findByCurrentDate();
    }
}
