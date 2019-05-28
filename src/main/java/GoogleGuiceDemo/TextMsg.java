package GoogleGuiceDemo;

import com.google.inject.Inject;

public class TextMsg {
	 private SendMsg sendmsgs;
	   
	   @Inject
	   public TextMsg(SendMsg sendmsgs) {
	      this.sendmsgs = sendmsgs;
	   }
	   public void makeSpellCheck() {
		   sendmsgs.msgService();
	   }
}
