package com.example.ContactDeatils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ContactDeatilsApplicationTests {

	@Test
	public void connection(){
		String  msisdn = "966561732435";
		ContactDetailsController test= new ContactDetailsController();
		test.checkInfo(msisdn);

	}

}
