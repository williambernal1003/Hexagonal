package com.Hexagonal.Hexagonal.domain.ports;

import com.Hexagonal.Hexagonal.domain.model.TEST;

import java.util.List;
import java.util.Optional;

public interface RepositoryTESTPort {
    List<TEST> findAll();
    Optional<TEST> findById(Long id);
    TEST save(TEST entity);
    void deleteById(Long id);
}