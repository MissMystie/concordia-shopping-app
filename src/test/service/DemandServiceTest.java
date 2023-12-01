package test.service;

import static org.junit.Assert.*;
import com.shashi.beans.DemandBean;
import com.shashi.service.impl.DemandServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

public class DemandServiceTest {

    @InjectMocks
    private DemandServiceImpl demandService;


    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testAddProduct() {
        String userId = "user123";
        String prodId = "prod456";
        int demandQty = 5;

        boolean result = demandService.addProduct(userId, prodId, demandQty);

        assertTrue(result);
    }

    @Test
    public void testAddProductWithDemandBean() {
        DemandBean demandBean = new DemandBean("user123", "prod456", 5);


        boolean result = demandService.addProduct(demandBean);

        assertTrue(result);
    }

    @Test
    public void testRemoveProduct() {
        String userId = "user123";
        String prodId = "prod456";


        boolean result = demandService.removeProduct(userId, prodId);

        assertTrue(result);
    }

    @Test
    public void testHaveDemanded() {
        String prodId = "prod456";

        List<DemandBean> demandList = new ArrayList<>();
        demandList.add(new DemandBean("user123", "prod456", 3));
        demandList.add(new DemandBean("user456", "prod456", 2));


        List<DemandBean> result = demandService.haveDemanded(prodId);

        assertEquals(demandList, result);
    }
}

