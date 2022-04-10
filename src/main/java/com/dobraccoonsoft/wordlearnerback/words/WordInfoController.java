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

    @GetMapping("/current-to-learn")
    public List<WordInfoDto> loadCurrentDateRepeatWords() {
        return wordInfoService.loadCurrentDateRepeatWords();
    }

    @PostMapping
    public long create(@RequestBody final WordInfoInput wordInfoInput) {
        return wordInfoService.create(wordInfoInput);
    }
}
