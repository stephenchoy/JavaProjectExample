package scrum.cisco.com.scrum2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@Controller
public class App 
{
	@RequestMapping("/")
	@ResponseBody
	String ping() {
	    return "Welcome to Hello application";
	}
	
	@RequestMapping("/message")
	@ResponseBody
	String message() {
	    return "hello message";
	}
	
	@RequestMapping("/version")
	@ResponseBody
	String version() {
	    return "1.3";
	}
	
    public static void main( String[] args )
    {
    		SpringApplication.run(App.class, args);
        System.out.println( "Hello World!" );
    }
}
