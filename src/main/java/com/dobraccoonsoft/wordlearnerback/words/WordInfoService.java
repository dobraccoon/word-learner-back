package com.dobraccoonsoft.wordlearnerback.words;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WordInfoService {

    private final WordInfoRepository wordInfoRepository;

    public WordInfoService(WordInfoRepository wordInfoRepository) {
        this.wordInfoRepository = wordInfoRepository;
    }

    public long create(final WordInfoInput wordInfoInput) {
        return wordInfoRepository.create(wordInfoInput);
    }

    public List<WordInfoDto> loadCurrentDateRepeatWords() {
        return wordInfoRepository.loadCurrentDateRepeatWords();
    }
}
