package com.br.unionsystems.java_spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.unionsystems.java_spring.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
