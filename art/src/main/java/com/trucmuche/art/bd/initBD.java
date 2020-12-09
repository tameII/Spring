package com.trucmuche.art.bd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;

@Component
public class initBD implements CommandLineRunner {
    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public void run(String... args) throws Exception {
        System.out.println("Création et initialisation de la base de donnée");

        String sqlStatements[]= {
                "drop table painting if exists",
                "create table painting(id serial, title varchar(255), author varchar(255), type varchar(255))",
                "INSERT INTO painting (title, author, type) VALUES('Plafond de la Chapelle Sixtine', 'Michelangelo', 'painting');",
                "INSERT INTO painting (title, author, type) VALUES('Crayonné sur drap de satin blanc','Un enfant de 4 ans', 'painting');",
                "INSERT INTO painting (title, author, type) VALUES('La Cène', 'Léonard de Vinci', 'painting');",
                "INSERT INTO painting (title, author, type) VALUES('Peinturluré sur mur', 'un enfant de 5 ans', 'painting');"

        };

        Arrays.asList(sqlStatements).stream().forEach(sql ->{
            System.out.println(sql);
            jdbcTemplate.execute(sql);
        });

        System.out.println("Affichage de toutes les peintures----------------");
        jdbcTemplate.query("select * from painting",
                new RowMapper<Object>(){
                    @Override
                    public Object mapRow(ResultSet paintings, int i) throws SQLException {
                        System.out.println(
                                "id:"+paintings.getString("id") +
                                        " title : "+paintings.getString("title") +
                                        "author : "+paintings.getString("author")
                        );

                        return null;
                    }
                }
        );
    }
}
