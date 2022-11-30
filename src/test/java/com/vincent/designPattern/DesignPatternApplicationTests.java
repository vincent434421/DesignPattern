package com.vincent.designPattern;

import com.vincent.designPattern.factory.SimpleMilkTeaFactory;
import com.vincent.designPattern.store.MilkTeaStore;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DesignPatternApplicationTests {

    @Test
    void simple_factory_test() {
        MilkTeaStore milkTeaStore = new MilkTeaStore(new SimpleMilkTeaFactory());
        milkTeaStore.createMilkTea("ChaBaiDao","淤泥波波");
    }

}
