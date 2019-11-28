package com.ecommerce;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.ecommerce.entity.Product;
import com.ecommerce.service.ProductService;

/*@RunWith(SpringRunner.class)
@WebMvcTest
public class ProductAPITest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ProductService productService;

    @Test
    public void findAll() throws Exception {
        Product product = new Product();

        List<Product> products = Arrays.asList(product);
        given(productService.findAll()).willReturn(products);

        this.mockMvc.perform(get("/api/products/filter/size/M"))
                .andExpect(status().isOk())
                .andExpect(content().json("[{'id': 1,'name': 'Stock 1';'quantity': 1;'size'}]"));
    }
}*/