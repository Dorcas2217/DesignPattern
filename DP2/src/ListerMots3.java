import java.io.*;
import java.util.StringTokenizer;

public class ListerMots3 implements  Strategy{ // mal foutu



	public boolean estPalindrome(String mot) {
		if (mot == null)
			return false;
		StringBuffer stringbuffer = new StringBuffer(mot);
		return mot.equals(stringbuffer.reverse().toString());
	}


	@Override
	public boolean imprimerMot(String s) {

		return estPalindrome(s);
	}
}
