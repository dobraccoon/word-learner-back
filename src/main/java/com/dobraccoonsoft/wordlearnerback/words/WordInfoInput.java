package com.dobraccoonsoft.wordlearnerback.words;

import lombok.Value;

import java.sql.Timestamp;

@Value
public class WordInfoInput {
    String word;
    String wordTranslate;
}
