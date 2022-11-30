package com.vincent.designPattern;

import com.vincent.designPattern.entity.store.ALittle;
import com.vincent.designPattern.entity.store.ChaBaiDao;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DesignPatternApplicationTests {
    /**
     * 工厂方法是原本将工厂方法做的事情由具体的类来做
     * 这样每个具体的奶茶店都有自己的特色奶茶
     * 更加符合实际情况
     * 抽象的奶茶店和抽象的奶茶在一个层面,具体的奶茶店和具体的奶茶在一个层面
     * new奶茶的过程交给了具体的奶茶类的createMilkTea方法来做,这个方法是具体奶茶必须实现的抽象类
     *
     * 1. 工厂方法就是一个方法
     * 2. 工厂方法必须是抽象的
     * 3. 工厂方法就是用来处理生成一个对象用的
     */
    @Test
    void factory_method_test() {
        ALittle aLittle = new ALittle();
        aLittle.orderMilkTea("茉莉春茶");
        aLittle.orderMilkTea("乌龙奶茶");

        ChaBaiDao chaBaiDao = new ChaBaiDao();
        chaBaiDao.orderMilkTea("淤泥波波");
    }

}
