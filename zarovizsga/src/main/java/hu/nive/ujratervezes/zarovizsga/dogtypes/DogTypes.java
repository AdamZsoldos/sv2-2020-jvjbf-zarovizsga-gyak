package hu.nive.ujratervezes.zarovizsga.dogtypes;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class DogTypes {

    private final JdbcTemplate jdbcTemplate;

    public DogTypes(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<String> getDogsByCountry(String country) {
        return jdbcTemplate.query("SELECT `name` FROM `dog_types` WHERE `country` = ?",
                this::getDogName, country);
    }

    private String getDogName(ResultSet resultSet, int rowNum) throws SQLException {
        return resultSet.getString("name").toLowerCase();
    }
}
