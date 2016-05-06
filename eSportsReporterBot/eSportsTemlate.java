package eSportsReporterBot;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class eSportsTemlate {
	
	String baseTemplate1 = "";
	String baseTemplate2 = "";
	StringBuilder base1 = new StringBuilder();

	
	public void readInTemplates() throws IOException {
		
		//read in BaseTemplate1.txt
		File dir = new File("./src/eSportsReporterBot");
		File fin = new File(dir.getCanonicalPath() + File.separator + "BaseTemplate1.txt");
		
		FileInputStream fis = new FileInputStream(fin);
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
	   
		String line = null;
		int count = 0;
		StringBuilder sb1 = new StringBuilder();
		
		while ((line = br.readLine()) != null) {
			
			sb1.append(line);
			
		}
		
		baseTemplate1 = sb1.toString();
		base1 = sb1;
		
		
		System.out.println(sb1.toString());
		
		//read in BaseTemplate2.txt
		dir = new File("./src/eSportsReporterBot");
		fin = new File(dir.getCanonicalPath() + File.separator + "BaseTemplate2.txt");
		
		fis = new FileInputStream(fin);
		br = new BufferedReader(new InputStreamReader(fis));
	   
		line = null;
		count = 0;
		sb1 = new StringBuilder();
		
		while ((line = br.readLine()) != null) {
			
			sb1.append(line);
			
		}
			
		System.out.println(sb1.toString());
		baseTemplate2 = sb1.toString();
		
	}

}
