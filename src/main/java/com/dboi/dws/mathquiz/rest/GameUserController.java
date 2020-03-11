package com.dboi.dws.mathquiz.rest;

import com.dboi.dws.mathquiz.dao.GameUserDao;
import com.dboi.dws.mathquiz.model.GameUser;
import com.dboi.dws.mathquiz.service.GameUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class SampleController {

    @Autowired
    GameUserService gameUserService;

     GameUserDao gameUserDao;

    @RequestMapping("/info")
    public String info_msg()
    {
        return "Just Check ";
    }
//
//    @PostMapping("/create")
//    public GameUser createGameuser(@Valid @RequestBody GameUser gameUser)
//    {
//        return gameUserDao.save(gameUser);
//    }


    @PostMapping("/createnew")
    public GameUser createnewGameUSer(@Valid @RequestBody GameUser gameUser)
    {
        return gameUserService.savedata(gameUser);
    }


//    @GetMapping("/alldetails")
//    public List<GameUser> getalldata()
//    {
//        return gameUserDao.findall();
//    }

}
