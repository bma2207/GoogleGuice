package CollageService;



import com.google.inject.Inject;

public class CallerMethod {
	@Inject  
	protected University university;
	
	public CallerMethod(University university) {
		super();
		this.university = university;
	}
	
	public void callMethod()
	{
		university.exam();
	}
	
	
}
