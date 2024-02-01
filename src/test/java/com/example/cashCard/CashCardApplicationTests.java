package com.example.cashCard;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

//@SpringBootTest
@JsonTest
class CashCardApplicationTests {

	@Test
	void contextLoads() {
		assertThat(42).isEqualTo(42);
	}

}
