package com.rickythemaniac.AEPL;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Interpreter {

	File file;
	
	public Interpreter(File file) {
		this.file = file;
		parseFile();
	}

	private void parseFile() {
		String line;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			br = new BufferedReader(new FileReader(file));
			fw = new FileWriter(new File("meh.java"));
			bw = new BufferedWriter(fw);
			
			while((line = br.readLine()) != null) {
				bw.write(parseLine(line)+"\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(br != null) br.close();
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

	private String parseLine(String line) {
		return line;
	}
	
	
}
