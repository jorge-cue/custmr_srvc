package mx.edu.jhcue.crm.custmr_srvc;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class CustmrSrvcApplicationTests {

    @Test
    void contextLoads() {
    }

}
