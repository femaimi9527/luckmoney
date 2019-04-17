package com.imooc.luckmoney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
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

    /**
     * 创建红包（发红包）
     * */
    @GetMapping("/luckmoneys")
    public Luckmoney create(@RequestParam("producer") String producer,
                            @RequestParam("money") BigDecimal money){
        Luckmoney luckmoney = new Luckmoney();
        luckmoney.setProducer(producer);
        luckmoney.setMoney(money);
        return repository.save(luckmoney);
    }
    /**
     * 通过id查询红包
     * */

    /**
     * 更新红包（领红包）
     * */
}
