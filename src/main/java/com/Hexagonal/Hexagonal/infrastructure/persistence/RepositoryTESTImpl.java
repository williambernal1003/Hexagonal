package com.Hexagonal.Hexagonal.infrastructure.persistence;

import com.Hexagonal.Hexagonal.domain.model.TEST;
import com.Hexagonal.Hexagonal.domain.ports.RepositoryTESTPort;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class RepositoryTESTImpl implements RepositoryTESTPort {

    private final JpaRepositoryTEST jpaRepository;

    public RepositoryTESTImpl(JpaRepositoryTEST jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    @Override
    public List<TEST> findAll() {
        return jpaRepository.findAll();
    }

    @Override
    public Optional<TEST> findById(Long id) {
        return jpaRepository.findById(id);
    }

    @Override
    public TEST save(TEST entity) {
        return jpaRepository.save(entity);
    }

    @Override
    public void deleteById(Long id) {
        jpaRepository.deleteById(id);
    }
}
