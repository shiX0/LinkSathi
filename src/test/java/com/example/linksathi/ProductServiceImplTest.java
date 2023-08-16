package com.example.linksathi;

import com.example.linksathi.Entity.Product;
import com.example.linksathi.Pojo.ProductPojo;
import com.example.linksathi.Repo.ProductRepo;
import com.example.linksathi.Services.Impl.ProductServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import java.io.IOException;
import java.util.List;

@DataJpaTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ProductServiceImplTest {

    @Autowired
    private ProductRepo productRepo;

    private ProductServiceImpl productService;

    @BeforeEach
    void setUp() {
        productService = new ProductServiceImpl(productRepo);
    }

    @Test
    @Order(1)
    public void testSaveProduct() throws IOException {
        // Prepare test data
        ProductPojo productPojo = new ProductPojo();
        productPojo.setProductname("Test Product");
        productPojo.setPrice(String.valueOf(100.0));
        // Set other properties as needed

        ProductPojo savedProductPojo = productService.save(productPojo);

        Assertions.assertThat(savedProductPojo.getId()).isNotNull();
    }

    @Test
    @Order(2)
    public void testFindAll() {
        // Mock repository behavior
        List<Product> products = productService.findAll();

        Assertions.assertThat(products.size()).isEqualTo(0);
    }

    @Test
    @Order(3)
    public void testUpdateProduct() throws IOException {
        // Save a product
        ProductPojo productPojo = new ProductPojo();
        productPojo.setProductname("Initial Product");
        productPojo.setPrice(String.valueOf(200.0));
        ProductPojo savedProductPojo = productService.save(productPojo);

        // Update the product
        savedProductPojo.setProductname("Updated Product");
        ProductPojo updatedProductPojo = productService.save(savedProductPojo);

        Assertions.assertThat(updatedProductPojo.getProductname()).isEqualTo("Updated Product");
    }

    @Test
    @Order(4)
    public void testGetThreeRandomData() {
        // Mock repository behavior
        List<Product> randomProducts = productService.getThreeRandomData();

        Assertions.assertThat(randomProducts).isEmpty();
    }

    @Test
    @Order(5)
    public void testDeleteProduct() throws IOException {
        // Save a product
        ProductPojo productPojo = new ProductPojo();
        productPojo.setProductname("Product to Delete");
        productPojo.setPrice(String.valueOf(300.0));
        ProductPojo savedProductPojo = productService.save(productPojo);

        // Delete the product
        productService.deleteById(savedProductPojo.getId());

    }


}