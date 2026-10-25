package mx.edu.jhcue.crm.custmr_srvc;

import org.springframework.boot.SpringApplication;

public class TestCustmrSrvcApplication {

    public static void main(String[] args) {
        SpringApplication.from(CustmrSrvcApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
