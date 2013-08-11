package com.rickythemaniac.AEPL;

import java.io.File;

/**
 * @author Rickard Ahlstedt
 * @version 0.01
 * @since 2013-08-06
 */

public class AEPL {

	public static void main(String[] args) {
		if(args.length <= 0) {
			System.err.println("Please specify a file to convert!");
			System.exit(1);
		}
		File file = new File(args[0]);
		new Interpreter(file);
	}
	
}
