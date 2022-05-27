package com.samsung.repository;

import com.samsung.domain.Message;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MessageRepository extends JpaRepository<Message, Integer> {
    @Override
    @EntityGraph(attributePaths = {"author"})
    List<Message> findAll();

    List<Message> findByName(String text);
}
