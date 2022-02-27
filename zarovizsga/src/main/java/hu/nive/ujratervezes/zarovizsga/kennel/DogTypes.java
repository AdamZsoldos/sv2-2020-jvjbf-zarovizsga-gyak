package hu.nive.ujratervezes.zarovizsga.kennel;

import org.flywaydb.core.internal.jdbc.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class DogTypes {

    private final  JdbcTemplate jdbcTemplate;

    public DogTypes(DataSource dataSource) {
        try (Connection connection = dataSource.getConnection()) {
            jdbcTemplate = new JdbcTemplate(connection);
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect to database", e);
        }
    }

    public List<String> getDogsByCountry(String hungary) {
        return null;
    }
}
