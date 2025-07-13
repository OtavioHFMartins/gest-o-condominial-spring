package com.gestao_condominial.gestao_condominial.repository;


import com.gestao_condominial.gestao_condominial.domain.Despesa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// SpringData
@Repository
public interface DespesaRepository extends JpaRepository<Despesa, Long> {



}
