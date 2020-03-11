package com.dboi.dws.mathquiz.dao;


import com.dboi.dws.mathquiz.model.GameUser;
import com.dboi.dws.mathquiz.repository.GameUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
public class GameUserDao {

    @Autowired
    GameUserRepository gameUserRepository;

    public GameUser save(GameUser gameUser)
    {
        return gameUserRepository.save(gameUser);
    }

    public List<GameUser> findall(){
        return gameUserRepository.findAll();

    }


}
