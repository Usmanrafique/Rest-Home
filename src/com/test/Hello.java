package com.test;

import java.util.Properties;

import javax.ejb.EJB;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.ejb.GetProductBean;

@Path("/hello")
public class Hello {
	
	
/* public Hello() {
	Properties p=new Properties();

	p.put(Context.PROVIDER_URL, "t3://localhost:7001");
	p.put(Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory");

	try {
		System.out.println("sdsad");
		Context ctx=new InitialContext(p);
		GetProductBean bean=(GetProductBean)ctx.lookup("MrBean");
		System.out.println("Main.main(): " + bean.hello());
		
	} catch (NamingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	// TODO Auto-generated constructor stub
}	*/
	
	
@GET
@Produces(MediaType.TEXT_PLAIN)
public String helloworld(){

	Properties p=new Properties();

	p.put(Context.PROVIDER_URL, "t3://localhost:7001");
	p.put(Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory");

	try {
		System.out.println("Hassan");
		Context ctx=new InitialContext(p);
		GetProductBean bean=(GetProductBean)ctx.lookup("Mr#com.ejb.GetProductBean");
		System.out.println("Main.main(): " + bean.hello());
		
	} catch (NamingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	

return "Usman sahab";

}
}