package com.sparta.springauth;

import com.sparta.springauth.food.Food;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BeanTest {

    // 같은 빈이 2개 이상일 때

    // 1. 따로 써준다.
    @Autowired
    Food pizza;

    @Autowired
    Food chicken;

    // 2. @Primary 을 붙여서 해당 클래스가 기본값으로 나타나게 한다.

    // 3. @Qualifier("별칭") 을 붙여서 해당 클래스가 나타나게 한다.

    // 우선순위는 @Primary > @Qualifier
    // 많이 사용(범용적)인건/ @Primary 사용하는 것이 좋다

        @Autowired
        @Qualifier("pizza")
    Food food;

    @Test
    @DisplayName("테스트")
    public void test() {
        food.eat();
    }
}
