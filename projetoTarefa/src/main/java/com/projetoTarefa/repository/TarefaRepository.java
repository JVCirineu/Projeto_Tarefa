package com.projetoTarefa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoTarefa.entities.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {

}
