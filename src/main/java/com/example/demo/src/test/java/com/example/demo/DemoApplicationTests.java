// src/test/java/com/example/demo/DemoApplicationTests.java
package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class DemoApplicationTests {
    @Test
    void contextLoads() {
        assertThat(1 + 1).isEqualTo(2); // placeholder — real tests aage add karenge
    }
}
