package h1.josia.poja.endpoint.rest.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import h1.josia.poja.endpoint.rest.controller.health.BigSumController;
import h1.josia.poja.conf.FacadeIT;
import java.math.BigInteger;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class BigSumControllerIT extends FacadeIT {
    @Autowired
    BigSumController bigSumController;

    @Test
    void can_do_addition() {
        BigInteger a = BigInteger.valueOf(7);
        BigInteger b =BigInteger.valueOf(3);

        BigInteger actual = bigSumController.add(a, b);

        assertEquals(BigInteger.valueOf(10), actual);
    }
}

