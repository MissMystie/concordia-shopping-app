package test.service;
import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.shashi.service.CartService;
import com.shashi.service.impl.CartServiceImpl;
import com.shashi.utility.DBUtil;

public class CartServiceTest {

    @InjectMocks
    private CartService cartService = new CartServiceImpl(); // Using actual implementation for simplicity

    @Mock
    private DBUtil dbUtil; // Mocking DBUtil for providing connection

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testAddProductToCart() {
   

        String result = cartService.addProductToCart("user123", "prod123", 3);

        assertEquals("Product Successfully Updated to Cart!", result);
    }

    @Test
    public void testUpdateProductToCart() {     

        String result = cartService.updateProductToCart("user123", "prod123", 3);

        assertEquals("Product Successfully Updated to Cart!", result);
    }

 
}
