package com.imooc.luckmoney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author xxm
 * @version 1.0
 * @date 2019/4/18 0:50
 */
@RestController
public class LuckmoneyController {

    @Autowired
    private LuckmoneyRepository repository;

    /**
     * 获取红包列表
     */
    @GetMapping("/luckmoneys")
    public List<Luckmoney> list(){
        return repository.findAll();
    }
}
