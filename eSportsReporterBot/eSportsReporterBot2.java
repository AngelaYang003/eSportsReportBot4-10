package eSportsReporterBot;

import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.sun.syndication.io.FeedException;

public class eSportsReporterBot2 {
 
	
	eSportsScore sc;
	eSportsTemlate tp;
	
	public eSportsReporterBot2() {
	
		//eSportsScore sc = new eSportsScore();
	}
	
	public static void  main(String[] args) throws IOException, IllegalArgumentException, FeedException {
		
		eSportsReporterBot2 bot = new eSportsReporterBot2();
		
		//Call RSSFeed module to retrieve game scores
		System.out.println("------- Retriving game scores from RSS feed -------");
		System.out.println("");
		RetrieveRSSFeed feed = new RetrieveRSSFeed();
    	//feed.retrieveRSSFeed();
    	System.out.println("");
    	System.out.println("------- Completed retriving game scores from RSS feed -------");
    	System.out.println("");
    	System.out.println("");
    	
		//Call Score module to process scores
		eSportsScore sc = new eSportsScore();
		bot.sc = sc;
		//bot.parseScoresWeek("8b");
		sc.parseScoresWeek("8b");
		
		//Call template module to read in templates
		eSportsTemlate tp = new eSportsTemlate();
		bot.tp = tp;
		tp.readInTemplates();
		
		//Call report module to generate news reports
		eSportsReportGenerator rp = new eSportsReportGenerator(sc, tp);
	    rp.writeNewReport();
	
	}
	
}

