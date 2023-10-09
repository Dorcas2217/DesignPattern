import java.io.*;
import java.util.*;

public class ListerMots1 implements  Strategy {


	@Override
	public boolean imprimerMot(String s) {
		return s.charAt(0) == 't';
	} // mal foutu


}
