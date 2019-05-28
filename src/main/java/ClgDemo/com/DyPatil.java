package ClgDemo.com;

public class DyPatil implements University {
	String name;
	String result;
	public DyPatil(String name, String result) {
		super();
		this.name = name;
		this.result = result;
	}
	@Override
	public void exam()
	{
		System.out.println("DyPatil Use  the exam servce provide by pune university !!!!!" );
	}
	@Override
	public void result()
	{
		System.out.println("DyPatil Use  the result servce provide by pune university !!!!!" );
	}
	
}
