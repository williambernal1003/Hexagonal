package com.Hexagonal.Hexagonal.infrastructure.web;

import com.Hexagonal.Hexagonal.domain.model.TEST;
import com.Hexagonal.Hexagonal.domain.ports.RepositoryTESTPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    private final RepositoryTESTPort repo;

    @Autowired
    public Controller(RepositoryTESTPort repo) {
        this.repo = repo;
    }

    @GetMapping()
    public String index() {
        return "Conectado";
    }

    @GetMapping("/getAll")
    public List<TEST> getAll() {
        return repo.findAll();
    }

    @PostMapping("/save")
    public String save(@RequestBody TEST test) {
        repo.save(test);
        return "Guardado correctamente";
    }

    @PutMapping("/update/{id}")
    public String update(@PathVariable Long id, @RequestBody TEST test) {
        return repo.findById(id).map(actual -> {
            actual.setNombre(test.getNombre());
            actual.setApellido(test.getApellido());
            actual.setTelefono(test.getTelefono());
            repo.save(actual);
            return "UPDATE SUCCESS";
        }).orElse("Entidad no encontrada");
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        repo.deleteById(id);
        return "Deleted";
    }
}