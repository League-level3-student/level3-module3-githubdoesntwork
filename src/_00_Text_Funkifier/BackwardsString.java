package _00_Text_Funkifier;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String bs="";
		for (int i = s.length()-1; i > -1; i--) {
			bs = bs+s.charAt(i);
		}
		return bs;
	}

}
