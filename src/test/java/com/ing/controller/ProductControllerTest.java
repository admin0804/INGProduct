package com.ing.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.ing.AbstractTest;
import com.ing.dto.ProductGroupDto;
import com.ing.model.ProductGroup;

@RunWith(SpringRunner.class)
@SpringBootTest

public class ProductControllerTest extends AbstractTest{
	
	@Override
	   @Before
	   public void setUp() {
	      super.setUp();
	   }
	
	@Test
	public void getAllProductsTest() throws Exception {
		
		String uri = "/api/v1/overview";
	      MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
	         .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
	      
	      int status = mvcResult.getResponse().getStatus();
	      assertEquals(200, status);
	      String content = mvcResult.getResponse().getContentAsString();
	      ProductGroup[] products = super.mapFromJson(content, ProductGroup[].class);
	      assertNotNull(products);
	      assertEquals(4, products.length);
	   }
	
	@Test
	public void productSubGroupTest() throws Exception {
		
		String uri = "/api/v1/overview";
	      MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
	         .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
	      
	      int status = mvcResult.getResponse().getStatus();
	      assertEquals(200, status);
	      String content = mvcResult.getResponse().getContentAsString();
	      ProductGroup[] products = super.mapFromJson(content, ProductGroup[].class);
	      assertNotNull(products);
	      
	      
	     // products.
	     // List<ProductGroup> prodGroups = Arrays.asList<ProductGroup>(products);
	     // assertEqua
	      assertEquals(4, products.length);
	   }
	
	public void getProductGroupsTest()throws Exception{
		String uri = "/api/v1/productGroups";
	      MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
	         .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
	      
	      int status = mvcResult.getResponse().getStatus();
	      assertEquals(200, status);
	      String content = mvcResult.getResponse().getContentAsString();
	      ProductGroupDto[] productDetails = super.mapFromJson(content, ProductGroupDto[].class);
	      assertNotNull(productDetails);
	      for(ProductGroupDto productDetail : productDetails) {
	    	  if(productDetail.getProductGroupId() == 10) {
	    		  
	    	  }
	      }
	      assertEquals(4, productDetails.length);
		
	} 

}
