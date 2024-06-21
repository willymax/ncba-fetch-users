package com.kitivi.users.controllers;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


/**
 * @author : william makau
 * @created : 6/21/2024, Friday
 **/
@SpringBootTest(
        webEnvironment = SpringBootTest.WebEnvironment.MOCK,
        properties = {}
)
@AutoConfigureMockMvc
@Slf4j
class UserControllerTest {
    @Autowired
    private MockMvc mvc;

    @Test
    void getAllUsers() throws Exception {
        mvc.perform(
                        get("/api/v1/users")
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(content().json("[\n" +
                        "    {\n" +
                        "        \"name\": \"William Makau\",\n" +
                        "        \"email\": \"william.k.makau@gmail.com\",\n" +
                        "        \"role\": \"admin\"\n" +
                        "    },\n" +
                        "    {\n" +
                        "        \"name\": \"Joash Sasita\",\n" +
                        "        \"email\": \"john@gmail.com\",\n" +
                        "        \"role\": \"user\"\n" +
                        "    }\n" +
                        "]"))
        ;
    }
}