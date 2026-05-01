package com.example.todo_api.repository.tasks;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TaskRepository {

    @Select("SELECT id, title FROM tasks WHERE id = #{taskId}")
    Optional<TaskRecord> select(Long taskId);

    @Select("SELECT id, title FROM tasks")
    List<TaskRecord> selectList();

    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("INSERT INTO tasks (title) VALUES (#{title})")
    void insert(TaskRecord record);


}
