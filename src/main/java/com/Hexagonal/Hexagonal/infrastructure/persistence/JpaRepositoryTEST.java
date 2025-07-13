package com.Hexagonal.Hexagonal.infrastructure.persistence;

import com.Hexagonal.Hexagonal.domain.model.TEST;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaRepositoryTEST extends JpaRepository<TEST, Long> {
}