package br.com.mlu.Menor.lance.unico.repositorio;

import br.com.mlu.Menor.lance.unico.entidade.Lance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LanceRepository extends JpaRepository<Lance, Long> {
}
