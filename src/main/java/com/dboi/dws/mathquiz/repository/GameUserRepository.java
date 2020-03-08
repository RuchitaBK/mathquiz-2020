package com.dboi.dws.mathquiz.repository;

import com.dboi.dws.mathquiz.model.GameUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameUserRepository extends JpaRepository<GameUser, Long> {
}
