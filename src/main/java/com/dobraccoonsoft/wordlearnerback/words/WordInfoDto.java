package com.dobraccoonsoft.wordlearnerback.words;

import lombok.Value;

import java.sql.Timestamp;

@Value
public class WordInfoDto {
    long id;
    String word;
    String wordTranslate;
    Timestamp createDt;
    int repeatAfterDaysCount;
    int repeatAfterHoursCount;
    Timestamp lastRepeatDt;
    Timestamp nextRepeatDt;
}
