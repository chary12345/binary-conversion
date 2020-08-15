package com.conversion;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//url is http://localhost:8090/convert?n=12
@RestController
public class IntToBinary{

	@SuppressWarnings("resource")
	@RequestMapping(value = "/convert",method = RequestMethod.GET)
	public  String convertIntoBinary(@PathParam("n") int n) {
		int  m;
		String  x = "";
		
		 
		  while(n > 0)
	        {
	            int a = n % 2;
	            x = a + x;
	            n = n / 2;
	        }
		  System.out.println("binary code of given ineger is :"+x );
		return "binary code of given ineger is :"+x;
	}

}
