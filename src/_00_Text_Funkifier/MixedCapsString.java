package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String bs="";
		char add;
		for (int i = 0; i < s.length(); i++) {
			if(i%2==0) {
				add = Character.toLowerCase(s.charAt(i));
			}else {
				add = Character.toUpperCase(s.charAt(i));
			}
			bs += add;
		}
		return bs;
	}

}
