package com.rohan.quizAPI.dao;

import com.rohan.quizAPI.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository<Quiz,Integer> {
}
