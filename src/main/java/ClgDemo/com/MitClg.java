package ClgDemo.com;

import javax.inject.Named;

import com.google.inject.Inject;

public class MitClg implements University {

	String name;
	String result;

	public MitClg(String name, String result) {

		this.name = name;
		this.result = result;
	}

	@Inject 
	@Named("JDBC")
	private String call;
	/*
	 * public void Demo(@Named("Call") String call) { this.call=call;
	 * 
	 * }
	 */

	@Override
	public void exam() {
		System.out.println("Mit Use  the exam servce provide by pune university  Name of Student ::::--->" + name);
		System.out.println("Mit Use  the exam servce provide by pune university  Result of Student ::::--->" + result);
		System.out.println(call);
	}

	@Override
	public void result() {
		System.out.println("Mit Use  the result servce provide by pune university !!!!!");
	}

}
