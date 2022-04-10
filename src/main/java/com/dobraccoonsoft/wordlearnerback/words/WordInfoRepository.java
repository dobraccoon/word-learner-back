package com.dobraccoonsoft.wordlearnerback.words;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class WordInfoRepository {
    private static final String sqlLoadCurrentDateRepeatWords = "SELECT * FROM word_info;";
    private static final String sqlInsertWithReturning =
            "INSERT INTO word_info(WORD, WORD_TRANSLATE) VALUES (?, ?) RETURNING id";

    private final JdbcTemplate jdbcTemplate;

    public WordInfoRepository(final DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    List<WordInfoDto> loadCurrentDateRepeatWords() {
        return jdbcTemplate.query(sqlLoadCurrentDateRepeatWords, new WordInfoRowMapper());
    }

    public long create(final WordInfoInput wordInfoInput) {
        return jdbcTemplate.update(
                sqlInsertWithReturning,
                        wordInfoInput.getWord(),
                wordInfoInput.getWordTranslate()
        );
    }
}
