package GoogleGuiceDemo;

import com.google.inject.AbstractModule;

class Binding extends AbstractModule {

@Override
protected void configure()
{
	bind(SendMsg.class).to(MsgImpliments.class);
}
	
}
