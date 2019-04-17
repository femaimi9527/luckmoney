package com.imooc.luckmoney;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @author: xxm
 * @date: Create in 16:02 2019/4/17
 *
 * 启动后对应的数据库操作如下：
 * Hibernate: drop table if exists hibernate_sequence
 * Hibernate: drop table if exists luckmoney
 * Hibernate: create table hibernate_sequence (next_val bigint) engine=MyISAM
 * Hibernate: insert into hibernate_sequence values ( 1 )
 * Hibernate: create table luckmoney (id integer not null, consumer varchar(255), money decimal(19,2), producer varchar(255), primary key (id)) engine=MyISAM
 */
@Entity
public class Luckmoney {

    @Id
    @GeneratedValue
    private Integer id;

    private BigDecimal money;

    /**
     * 发送方
     * */
    private String producer;

    /**
     * 接收方
     * */
    private String consumer;

    public Luckmoney() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getConsumer() {
        return consumer;
    }

    public void setConsumer(String consumer) {
        this.consumer = consumer;
    }
}
