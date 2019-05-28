package CollageService;

import com.google.inject.ImplementedBy;

@ImplementedBy(MitClg.class)
public interface University {

	 void exam();
	 void result();
}
