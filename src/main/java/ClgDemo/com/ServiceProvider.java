package ClgDemo.com;

import com.google.inject.Provider;
import com.google.inject.Provides;

public class ServiceProvider  implements Provider<University>{

	  @Provides
	   public University get() {
	      String name = "Bhushan";
	      String result = "Pass";
	     
	      University university = new DyPatil(name, result);
	      return university;
	
	}
	
}
