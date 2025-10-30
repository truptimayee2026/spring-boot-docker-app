package in.ashokit.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	private Logger logger = LoggerFactory.getLogger(WelcomeRestController.class);

	public WelcomeRestController() {
		logger.info("***** WelcomeRestController :: Constructor *****");
	}

	@GetMapping
	public String welcomeMsg() {
		logger.info("***** welcomeMsg() execution start *****");
		String msg = "Welcome to Ashok IT - Software Training Institute (HYD) ..!!";
		logger.info("***** welcomeMsg() execution end *****");
		String slf = "Hellow there is:";
		String s1 = "Hello there";
		String s = "hello";
		logger.info("******************************************************************");
		return msg;
	}
	
	@GetMapping("/greetings")
	public String greetMsg() {
		logger.info("***** greetMsg() execution start *****");
		String msg = "Good Morning, Welcome to Ashok IT";
		int x = 50;
		System.out.println("testing git collaboration");
		System.out.println("New code added here");
		logger.info("***** greetMsg() execution end *****");
		int i = 10;
		int i1 = 30;
		logger.info("***** greetMsg() execution successfull *****");
		boolean status = false;
		logger.info("***** ***************************** *****");
		return msg;
	}
	
	
}
