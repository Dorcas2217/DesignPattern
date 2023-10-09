import java.io.*;
import java.util.*;

public class ListerMots2 implements  Strategy{ // mal foutu
	private int longeur;

	public ListerMots2(int longeur) {
		this.longeur = longeur;
	}

	@Override
	public boolean imprimerMot(String s) {
		return s.length() == longeur;
	}
}
