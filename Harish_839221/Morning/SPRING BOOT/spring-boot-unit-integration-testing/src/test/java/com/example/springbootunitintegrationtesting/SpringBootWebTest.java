package com.example.springbootunitintegrationtesting;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(controllers = HelloController.class)
public class SpringBootWebTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void statusShouldBe202() throws Exception {
		this.mockMvc.perform(get("/hello")).andExpect(status().isAccepted());
	}
	@Test
	public void contentShouldHaveSomeMessage() throws Exception {
		this.mockMvc.perform(get("/hello")).andExpect(content().string(containsString("Welcome user")));
	}

}
