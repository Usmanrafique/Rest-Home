package com.ejb;

import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;

@Stateless(name = "Mr", mappedName= "Mr")
@Remote (GetProductBean.class)
public class GetProductBeanImpl implements GetProductBean {

	@Override
	public String hello() {
		// TODO Auto-generated method stub
		return "Hay I am good";
	}

}
