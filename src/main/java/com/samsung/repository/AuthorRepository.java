package com.samsung.repository;

import com.samsung.domain.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer>{
    Author findByName(String name);
}
