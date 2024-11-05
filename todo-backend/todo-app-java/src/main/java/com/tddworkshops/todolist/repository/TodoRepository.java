package com.tddworkshops.todolist.repository;

import com.tddworkshops.todolist.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {

  @Transactional
  void deleteByCompletedTrue();

  void deleteByCompleted(boolean completed);

}
