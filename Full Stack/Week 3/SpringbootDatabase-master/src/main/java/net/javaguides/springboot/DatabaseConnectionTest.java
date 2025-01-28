package net.javaguides.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@Configuration
public class DatabaseConnectionTest {

    @Autowired
    private DataSource dataSource;

    @Bean
    public CommandLineRunner testConnection() {
        return args -> {
            try (Connection connection = dataSource.getConnection()) {
                System.out.println("Connection Established: " + connection.getCatalog());
            } catch (SQLException e) {
                System.err.println("Failed to establish connection: " + e.getMessage());
            }
        };
    }
}
