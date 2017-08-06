package com.example.ContactDeatils;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cloudant.client.api.CloudantClient;
import com.cloudant.client.api.Database;
import com.cloudant.client.api.model.DbInfo;
import com.cloudant.client.api.model.Response;
import com.cloudant.client.api.views.AllDocsRequest;
import com.google.gson.GsonBuilder;

import ch.qos.logback.core.net.server.Client;

@RestController
public class ContactDetailsController {

	public Database createDB() {
		EnvironmentConfig config = new EnvironmentConfig();
		return config.cloudantclient();
	}

	private static CloudantClient client = null;
	private static Database db = null;
	@Value("${server.port}")
	private String port;
	
	@CrossOrigin
	@RequestMapping("/contact/{msisdn}")
	public ContactDetailsReview checkInfo(@PathVariable("msisdn") String msisdn) {
		boolean flag = false;

		Database db = createDB(); // client.database(SocialReviewDB.class.getSimpleName().toLowerCase(),
									// true);
		ContactDetailsReview returnValue =null;
		
		
		// String MSISDN ="966561732435";
		List<ContactDetailsReview> requests = db.findByIndex("\"selector\": {\"MSISDN\": {\"$gt\":" + msisdn + "}}",
				ContactDetailsReview.class);

		System.out.println("checkBusInfo db req " + requests);
		for (ContactDetailsReview r : requests) {
			System.out.println("MSISDN :" + r.getMSISDN() + " CITY :  " + r.getCity() + "Email Adrress : "
					+ r.getEmailAddress() + "Name :" + r.getName());
			flag = true;
			r.setPort(port);
			r.setText("Hi message");
			returnValue = r;
			
		}

		return returnValue;
	}

}
