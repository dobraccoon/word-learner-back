package com.dobraccoonsoft.wordlearnerback.words;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class WordInfoRowMapper implements RowMapper<WordInfoDto> {

    @Override
    public WordInfoDto mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new WordInfoDto(
                rs.getLong("ID"),
                rs.getString("WORD"),
                rs.getString("WORD_TRANSLATE"),
                rs.getTimestamp("CREATE_DT"),
                rs.getInt("REPEAT_AFTER_DAYS_COUNT"),
                rs.getInt("REPEAT_AFTER_HOURS_COUNT"),
                rs.getTimestamp("LAST_REPEAT_DT"),
                rs.getTimestamp("NEXT_REPEAT_DT")
        );
    }
}
