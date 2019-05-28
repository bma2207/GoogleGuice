package ClgDemo.com;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.name.Names;


public class UniversityModul extends AbstractModule {

	@Override
	protected void configure() {
		// TODO Auto-generated method stub
		// bind(University.class).to(MitClg.class);
		bind(String.class)
        .annotatedWith(Names.named("Call"))
        .toInstance("jdbc:mysql://localhost:5326/emp");
	}

	@Provides
	public University provideSpellChecker() {
		String name = "Bhushan";
		String result = "Pass";
		University university = new MitClg(name, result);
		return university;

		
	}

}
