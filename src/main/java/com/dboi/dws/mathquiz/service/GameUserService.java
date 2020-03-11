package com.dboi.dws.mathquiz.service;

import com.dboi.dws.mathquiz.dao.GameUserDao;
import com.dboi.dws.mathquiz.model.GameUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.List;

@Service
public class GameUserService {

    @Autowired
    GameUserDao gameUserDao;

    public GameUser savedata(GameUser gameUser) {
        String password=gameUser.getPassword();


        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String hashedPassword = passwordEncoder.encode(password);
        System.out.println(hashedPassword);

        gameUser.setPassword(hashedPassword);
        boolean result = validatePassword(password,hashedPassword);
       System.out.print("Result:"+result);

        return gameUserDao.save(gameUser);

    }


    public boolean validatePassword(String password,String hashedpassword) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.matches(password, hashedpassword);
    }

    public List<GameUser> allGameUsers()
    {
        return gameUserDao.findall();

    }
}
