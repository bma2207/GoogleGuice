package ClgDemo.com;

//import com.google.inject.ProvidedBy;

import com.google.inject.ImplementedBy;



@ImplementedBy(MitClg.class)
//@ProvidedBy(ServiceProvider.class)
public interface University {

	 void exam();
	 void result();
}
