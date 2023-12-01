package test.service;


import com.shashi.beans.ProductBean;
import com.shashi.beans.ProductInterest;
import com.shashi.service.impl.DiscountServiceImpl;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

import java.util.HashSet;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

public class DiscountServiceTest {

    @InjectMocks
    private DiscountServiceImpl discountService;

 
    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetBestSellingByInterest() {
        // Assuming no return value or void method
        discountService.getBestSellingByInterest();
    }

    @Test
    public void testCheckInStock() {
        String prodId = "PROD123";
        String prodName = "Random Product";
        String prodType = "Electronics";
        String prodInfo = "Lorem Ipsum";
        double prodPrice = 49.99;
        int prodQuantity = 100;
        InputStream prodImage = new ByteArrayInputStream(new byte[0]);
        Boolean prodUsed = false;
        HashSet<ProductInterest> prodInterests = new HashSet<>(); // You may populate this set as needed

        // Create the ProductBean object
        ProductBean randomProduct = new ProductBean(prodId, prodName, prodType, prodInfo, prodPrice, prodQuantity,
                prodImage, prodUsed, prodInterests);

        // Assuming no return value or void method
        discountService.checkInStock(randomProduct);
    }


    @Test
    public void testDisplayAdminSuggestions() {
        // Assuming no return value or void method
        discountService.displayAdminSuggestions();
    }
}

