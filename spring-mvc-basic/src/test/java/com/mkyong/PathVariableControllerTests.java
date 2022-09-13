package com.mkyong;

import com.mkyong.config.SpringWebConfig;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebAppConfiguration
@ContextConfiguration(classes = {SpringWebConfig.class})
/*@TestInstance(TestInstance.Lifecycle.PER_CLASS)*/
public class PathVariableControllerTests {

    @Autowired
    private WebApplicationContext wac;

    private MockMvc mockMvc;

    @BeforeEach
    void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }

    @Test
    public void testGetPageById() throws Exception {

        MvcResult result = this.mockMvc.perform(get("/path//api/page/1"))
                /*.andDo(print())*/
                .andExpect(status().isOk())
                .andExpect(content().string("1"))
                .andReturn();

    }

    @Test
    public void getPageByName() throws Exception {

        MvcResult result = this.mockMvc.perform(get("/path/api/title/hello-world"))
                .andExpect(status().isOk())
                .andExpect(content().string("hello-world"))
                .andReturn();

    }

    @Test
    public void getPageByTagAndName() throws Exception {

        MvcResult result = this.mockMvc.perform(get("/path/api/multi/spring-mvc/hello-world"))
                .andExpect(status().isOk())
                .andExpect(content().string("spring-mvc:hello-world"))
                .andReturn();

    }

    @Test
    public void getPageByTagAndNameMapVersion() throws Exception {

        MvcResult result = this.mockMvc.perform(get("/path/api/multi/spring-mvc/and/hello-world"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string("spring-mvc:hello-world"))
                .andReturn();

    }

    @Test
    public void getJarFile() throws Exception {

        String jar = "spring-webmvc-5.3.22.jar";

        MvcResult result = this.mockMvc.perform(get("/path/api/get/" + jar))
                .andExpect(status().isOk())
                .andExpect(content().string(jar))
                .andReturn();

        String jar2 = "spring-webmvc-5.2.22.RELEASE.jar";

        MvcResult result2 = this.mockMvc.perform(get("/path/api/get/" + jar2))
                /*.andDo(print())*/
                .andExpect(status().isOk())
                .andExpect(content().string(jar2))
                .andReturn();


    }

    @Test
    public void getPageByApi3() throws Exception {

        this.mockMvc.perform(get("/path/api3/page/"))
                .andExpect(status().isOk())
                .andExpect(content().string("id is required!"))
                .andReturn();

        this.mockMvc.perform(get("/path/api3/page/1"))
                .andExpect(status().isOk())
                .andExpect(content().string("1"))
                .andReturn();

    }

    @Test
    public void getPageByApi4() throws Exception {

        this.mockMvc.perform(get("/path/api4/page/"))
                .andExpect(status().isOk())
                .andExpect(content().string("id is required!"))
                .andReturn();

        this.mockMvc.perform(get("/path/api4/page/1"))
                .andExpect(status().isOk())
                .andExpect(content().string("1"))
                .andReturn();


    }

    @Test
    public void getPagePath2() throws Exception {

        this.mockMvc.perform(get("/path2/api/99/page/hello-world/"))
                /*.andDo(print())*/
                .andExpect(status().isOk())
                .andExpect(content().string("99hello-world"))
                .andReturn();

    }

}