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

/**
 * 1.set和get用于private变量的封装，一般只用在封装里，当然它也可以用2所说的。
 * 2.get和set起源于它的中文翻译，获取和设置。主要是便于理解。比如获取XX值和设置XX值。这样不仅方便自己看，别人也很容易理解的。所以也不仅仅用于封装的。
 * 3.javabean就是一个简单的java类，里面只有变量和set/get方法之类的，不需要安装jar包及组件。
 */