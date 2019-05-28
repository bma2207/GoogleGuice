package ClgDemo.com;

import com.google.inject.Inject;

public class CallerMethod {

	protected University university;
	@Inject
	public CallerMethod(University university) {
		super();
		this.university = university;
	} 
	
	public void callMethod()
	{
		university.exam();
	}
	
	
}
