package ClgDemo.com;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Tester {
 
	public static void main(String[] args) {
		Injector injector =Guice.createInjector(new UniversityModul());
		CallerMethod call=injector.getInstance(CallerMethod.class);
		call.callMethod();
	}

}
