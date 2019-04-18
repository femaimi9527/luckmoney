package com.imooc.luckmoney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

/**
 * @author xxm
 * @version 1.0
 * @date 2019/4/18 0:50
 *
 * 1.set和get用于private变量的封装，一般只用在封装里，当然它也可以用2所说的。
 * 2.get和set起源于它的中文翻译，获取和设置。主要是便于理解。比如获取XX值和设置XX值。这样不仅方便自己看，别人也很容易理解的。所以也不仅仅用于封装的。
 * 3.javabean就是一个简单的java类，里面只有变量和set/get方法之类的，不需要安装jar包及组件。
 */
@RestController
public class LuckmoneyController {

    @Autowired
    private LuckmoneyRepository repository;

    @Autowired
    private LuckmoneyService service;

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
    @PostMapping("/luckmoneys")
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
    @GetMapping("/luckmoneys/{id}")
    public Luckmoney findById(@PathVariable("id") Integer id){
        return repository.findById(id).orElse(null);
    }

    /**
     * 更新红包（领红包）
     * */
    @PutMapping("/luckmoneys/{id}")
    public Luckmoney update(@PathVariable("id") Integer id,@RequestParam("consumer") String consumer){

        Optional<Luckmoney> optional = repository.findById(id);
        if (optional.isPresent()) {
            Luckmoney luckmoney = optional.get();
            luckmoney.setId(id);
            luckmoney.setConsumer(consumer);
            return repository.save(luckmoney);
        }

        return null;
    }

    @PostMapping("/luckmoneys/two")
    public void createTwo(){
        service.createTwo();
    }
}
