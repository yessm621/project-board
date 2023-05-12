package com.fastcampus.projectboard.controller;

import com.fastcampus.projectboard.config.SecurityConfig;
<<<<<<< Updated upstream
import org.junit.jupiter.api.DisplayName;
=======
>>>>>>> Stashed changes
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.web.servlet.MockMvc;
<<<<<<< Updated upstream

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
=======
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
>>>>>>> Stashed changes

@Import(SecurityConfig.class)
@WebMvcTest(MainController.class)
class MainControllerTest {

    private final MockMvc mvc;

    public MainControllerTest(@Autowired MockMvc mvc) {
        this.mvc = mvc;
    }

    @Test
    void givenNothing_whenRequestingRootPage_thenRedirectsToArticlesPage() throws Exception {
<<<<<<< Updated upstream
        mvc.perform(get("/"))
                .andExpect(status().is3xxRedirection());
    }
}
=======
        // Given

        // When & Then
        mvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(view().name("forward:/articles"))
                .andExpect(forwardedUrl("/articles"))
                .andDo(MockMvcResultHandlers.print());
    }
}
>>>>>>> Stashed changes
