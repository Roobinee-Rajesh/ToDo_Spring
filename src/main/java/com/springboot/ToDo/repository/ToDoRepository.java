package com.springboot.ToDo.repository;

import com.springboot.ToDo.model.ToDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
@Repository
public class ToDoRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;



    class ToDoRowMapper implements RowMapper<ToDo>{

        @Override
        public ToDo mapRow(ResultSet rs, int rowNum) throws SQLException {
            return new ToDo(rs.getInt("id"),rs.getString("todo"));
        }
    }

    public List<ToDo> findAll(){
        return jdbcTemplate.query("SELECT * FROM todo",new ToDoRowMapper());
    }

    public List<ToDo> findById(int id) {
        jdbcTemplate.query("SELECT * FROM todo WHERE id=?",
                new Object[]{id},new BeanPropertyRowMapper<>(ToDo.class));
        return findAll();
    }

    public List<ToDo> insert(ToDo toDo){
        jdbcTemplate.update("INSERT INTO todo(todo) VALUES(?)",
                new Object[]{toDo.getTodo()});
        return findAll();
    }
    public List<ToDo> update(ToDo toDo){
        jdbcTemplate.update("UPDATE todo SET todo=? WHERE id=?",
                new Object[]{toDo.getTodo(),toDo.getId()});
        return findAll();
    }
    public List<ToDo> deletById(int id) {
        jdbcTemplate.update("DELETE FROM todo WHERE id=?", new Object[]{id});
        return findAll();
    }
}
