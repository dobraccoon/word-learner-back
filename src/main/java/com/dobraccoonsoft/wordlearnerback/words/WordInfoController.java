package com.dobraccoonsoft.wordlearnerback.words;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/words")
public class WordInfoController {

    private final WordInfoService wordInfoService;

    public WordInfoController(WordInfoService wordInfoService) {
        this.wordInfoService = wordInfoService;
    }

    @GetMapping
    public List<WordInfo> findAllWords() {
        return wordInfoService.findAll();
    }

    @GetMapping("/get-by-current-date")
    public List<WordInfo> findByCurrentDate() {
        return wordInfoService.findByCurrentDate();
    }

    @PostMapping
    public WordInfo create(@RequestBody final WordInfo wordInfo) {
        return wordInfoService.create(wordInfo);
    }

}
