package thiago.teste.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;
import thiago.teste.demo.repository.PessoaRepository;
import thiago.teste.demo.model.Pessoa;

@RequestMapping("v1/buscar")
@RestController

public class ThiagoController {
    @Autowired
    private PessoaRepository repository;

    @GetMapping()
    public ResponseEntity<Void> buscar() {

        return ResponseEntity.status(HttpStatus.ACCEPTED).header("Autorizo","Thiago").build();
    }

    @PostMapping()
    public ResponseEntity<Pessoa> salvar(@RequestBody Pessoa pessoa) {
        Pessoa pessoaSalva = repository.save(pessoa);
        return ResponseEntity.status(HttpStatus.CREATED).body(pessoaSalva);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Pessoa> buscarporid(@PathVariable Long id) {
        Pessoa pessoa = repository.findById(id).orElse(new Pessoa());
        return ResponseEntity.status(HttpStatus.OK).body(pessoa);
    }

}



