package com.Practical;

import com.google.inject.AbstractModule;




public class CalcModul extends AbstractModule {

	@Override
	protected void configure() {
		// TODO Auto-generated method stub
		bind(Calculator.class);
	}

	
}
