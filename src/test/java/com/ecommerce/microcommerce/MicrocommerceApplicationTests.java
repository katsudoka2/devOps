package com.ecommerce.microcommerce;

import com.ecommerce.microcommerce.dao.ProductDao;
import com.ecommerce.microcommerce.model.Product;
import com.ecommerce.microcommerce.web.controller.ProductController;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;


@SpringBootTest

class MicrocommerceApplicationTests {

	@InjectMocks
	ProductController productController;

	@Mock
	ProductDao productDAO;


	@Test
	void contextLoads()  throws Exception  {
// given

//when

// then

	}

	@Test
	public void testAddProduct()
	{
		//given

		Product product = new Product(1, "Narjess", 540);

		when(productDAO.save(any(Product.class))).thenReturn(product);

	//when
		Product productResponse = productController.ajouterProduit(product);

		//then
		assertThat(productResponse.getId()).isEqualTo(1);
		assertThat(productResponse.getName()).isEqualTo("Narjess");
		assertThat(productResponse.getPrice()).isEqualTo("540");
	}



}