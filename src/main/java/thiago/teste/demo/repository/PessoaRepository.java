package thiago.teste.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import thiago.teste.demo.model.Pessoa;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa,Long> {
}
