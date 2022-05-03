package com.dobraccoonsoft.wordlearnerback.words;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.sql.Timestamp;


@Entity
@Data
//@AllArgsConstructor
//@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class WordInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    Long id;
    @NotBlank
    @Column(nullable = false)
    String word;
    @NotBlank
    @Column(nullable = false)
    String wordTranslate;
    @Column(nullable = false, updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @CreationTimestamp
    Timestamp createDt;
    @Column(nullable = false, columnDefinition = "NUMERIC DEFAULT 0")
    int lastRepeatDaysPeriod;
    //TODO: columnDefinition doesn't works
    @Column(nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP + (60 ||' minutes')::interval")
    Timestamp nextRepeatDt;
}
