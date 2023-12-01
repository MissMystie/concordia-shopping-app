package test.service;

import static org.junit.Assert.*;

import com.github.xiaoymin.knife4j.annotations.Ignore;
import com.shashi.beans.ProductBean;
import com.shashi.beans.ProductInterest;
import com.shashi.service.impl.ProductServiceImpl;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
@Ignore
public class ProductServiceTest {

    @InjectMocks
    private ProductServiceImpl productService;

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testAddProductWithStringParameters() {
        String prodName = "Product 1";
        String prodType = "Type A";
        String prodInfo = "Product information";
        double prodPrice = 50.0;
        int prodQuantity = 100;
        InputStream prodImage = new ByteArrayInputStream(new byte[0]);
        Boolean productUsed = false;
        HashSet<ProductInterest> relatedInterests = new HashSet<>();


        String result = productService.addProduct(prodName, prodType, prodInfo, prodPrice, prodQuantity, prodImage,
                productUsed, relatedInterests);

        assertEquals("Product added successfully", result);
    }

    @Test
    public void testAddProductWithProductBean() {
        ProductBean product = new ProductBean(/* your product details */);


        String result = productService.addProduct(product);

        assertEquals("Product added successfully", result);
    }

    @Test
    public void testRemoveProduct() {
        String prodId = "prod123";


        String result = productService.removeProduct(prodId);

        assertEquals("Product removed successfully", result);
    }

    @Test
    public void testUpdateProduct() {
        ProductBean prevProduct = new ProductBean(/* previous product details */);
        ProductBean updatedProduct = new ProductBean(/* updated product details */);


        String result = productService.updateProduct(prevProduct, updatedProduct);

        assertEquals("Product updated successfully", result);
    }

    @Test
    public void testUpdateProductPrice() {
        String prodId = "prod123";
        double updatedPrice = 60.0;

        String result = productService.updateProductPrice(prodId, updatedPrice);

        assertEquals("Product price updated successfully", result);
    }

    @Test
    public void testGetAllProducts() {
        List<ProductBean> products = new ArrayList<>();
        products.add(new ProductBean(/* product details */));
        products.add(new ProductBean(/* product details */));


        List<ProductBean> result = productService.getAllProducts();

        assertEquals(products, result);
    }

    @Test
    public void testGetAllProductsByType() {
        String type = "Type A";

        List<ProductBean> products = new ArrayList<>();
        products.add(new ProductBean(/* product details with Type A */));
        products.add(new ProductBean(/* product details with Type A */));


        List<ProductBean> result = productService.getAllProductsByType(type);

        assertEquals(products, result);
    }

    @Test
    public void testSearchAllProducts() {
        String search = "Product";

        List<ProductBean> products = new ArrayList<>();
        products.add(new ProductBean(/* product details with matching search */));
        products.add(new ProductBean(/* product details with matching search */));


        List<ProductBean> result = productService.searchAllProducts(search);

        assertEquals(products, result);
    }

    

    @Test
    public void testGetProductDetails() {
        String prodId = "prod123";

        ProductBean product = new ProductBean(/* product details */);


        ProductBean result = productService.getProductDetails(prodId);

        assertEquals(product, result);
    }

    @Test
    public void testUpdateProductWithoutImage() {
        String prevProductId = "prevProd123";
        ProductBean updatedProduct = new ProductBean(/* updated product details */);

        String result = productService.updateProductWithoutImage(prevProductId, updatedProduct);

        assertEquals("Product updated successfully without image", result);
    }

    @Test
    public void testGetProductPrice() {
        String prodId = "prod123";

        double result = productService.getProductPrice(prodId);

        assertEquals(50.0, result, 0.01); // 0.01 is the delta for double comparison
    }

    @Test
    public void testSellNProduct() {
        String prodId = "prod123";
        int n = 5;

        boolean result = productService.sellNProduct(prodId, n);

        assertTrue(result);
    }

    @Test
    public void testGetProductQuantity() {
        String prodId = "prod123";


        int result = productService.getProductQuantity(prodId);

        assertEquals(10, result);
    }
}

