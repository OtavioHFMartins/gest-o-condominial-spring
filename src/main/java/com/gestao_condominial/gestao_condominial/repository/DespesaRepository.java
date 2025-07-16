package com.gestao_condominial.gestao_condominial.repository;


import com.gestao_condominial.gestao_condominial.domain.Despesa;
import com.gestao_condominial.gestao_condominial.domain.enums.StatusDespesa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

// SpringData
@Repository
public interface DespesaRepository extends JpaRepository<Despesa, Long> {

    @Query(value = "SELECT * FROM despesas d WHERE d.status = :status", nativeQuery = true)
   List<Despesa> lista(@Param("status") String status);

    @Query(value = "SELECT d FROM Despesa d WHERE d.status = :banana")
    List<Despesa> listav2(@Param("banana") StatusDespesa status);

    List<Despesa> findAllByStatus(StatusDespesa statusDespesa);
}
