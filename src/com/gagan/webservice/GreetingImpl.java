package com.gagan.webservice;

import javax.jws.WebService;

/*
 * To generate Web Services classes go to project home and run 
 * wsgen -s src -d build/classes -cp build/classes com.gagan.webservice.GreetingImpl
 * where 	-s option to specify where to place generated source file
 * 			-d option to specify where to place generated output file
 * 
 * To generate client sub go to client project home and run wsimport –s src -d build/classes http://localhost:8080/JAX-WS-Web/greeting?wsdl
 * (Java client: wsimport –s src -d bin http://localhost:8080/JAX-WS-Web/greeting?wsdl)
 * where 	-s option to specify where to place generated source file
 * 			-d option to specify where to place generated output file
 */

@WebService(endpointInterface = "com.gagan.webservice.Greeting")
public class GreetingImpl implements Greeting {

	@Override
	public String sayHello(String name){
		return "Hello, Welcome to jax-ws " + name;
	}
}
