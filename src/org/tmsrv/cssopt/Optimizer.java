package org.tmsrv.cssopt;

import java.io.*;
import java.util.*;


public class Optimizer {
	public static String beautify(String source) throws Exception {
		CSS css = CSS.parse(source);

		return css.getSource(false);
	}

	public static String beautify(InputStream is) throws Exception {
		CSS css = CSS.parse(is);

		return css.getSource(false);
	}

	public static String beautify(Reader r) throws Exception {
		CSS css = CSS.parse(r);

		return css.getSource(false);
	}


	public static String shrink(String source) throws Exception {
		CSS css = CSS.parse(source);

		return css.getSource(true);
	}

	public static String shrink(InputStream is) throws Exception {
		CSS css = CSS.parse(is);

		return css.getSource(true);
	}

	public static String shrink(Reader r) throws Exception {
		CSS css = CSS.parse(r);

		return css.getSource(true);
	}


	public static void main(String [] args) throws Exception {
		// parse css document
		CSS css = CSS.parse(new FileReader(args[0]));

		// TODO
		System.out.println(css.getSource(true));
	}
}
