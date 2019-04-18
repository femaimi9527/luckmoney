package com.imooc.luckmoney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

/**
 * @author: xxm
 * @date: Create in 16:51 2019/4/18
 */
@Service
public class LuckmoneyService {

    @Autowired
    private LuckmoneyRepository repository;
/**
 * 事务 ，指的是数据库事务，不是java程序的
 * 发的红包要么两个都成功，要么两个都失败
 * 扣库存 >> 创建订单 （需同时满足才能成功）
 * */
    @Transactional(rollbackFor = Exception.class)
    public void createTwo(){
        Luckmoney luckmoney1 = new Luckmoney();
        luckmoney1.setProducer("大帅哥");
        luckmoney1.setMoney(new BigDecimal("520"));
        repository.save(luckmoney1);

        Luckmoney luckmoney2 = new Luckmoney();
        luckmoney2.setProducer("大帅哥");
        luckmoney2.setMoney(new BigDecimal("999"));
        repository.save(luckmoney2);
    }
}
