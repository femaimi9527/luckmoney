package com.imooc.luckmoney;

import org.springframework.data.jpa.repository.JpaRepository;


/**
 * 设计一个继承JPA的接口，处理数据库事务
 */
public interface LuckmoneyRepository extends JpaRepository<Luckmoney,Integer> {
}
