package eSportsReporterBot;





import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.xml.sax.InputSource;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import com.sun.syndication.feed.synd.SyndEntry;
import com.sun.syndication.feed.synd.SyndFeed;
import com.sun.syndication.io.FeedException;
import com.sun.syndication.io.SyndFeedInput;
import com.sun.syndication.io.XmlReader;


public class RetrieveRSSFeed {

    public static void main(String[] args) throws IOException, IllegalArgumentException, FeedException {
    	RetrieveRSSFeed feed = new RetrieveRSSFeed();
    	feed.retrieveRSSFeed();
    	
    }
    
    public void retrieveRSSFeed() throws IllegalArgumentException, FeedException, IOException {
    	
    	URL url = new URL("http://www.repeatserver.com/Users/ayang64/eSportsScores1.xml");
		HttpURLConnection httpcon = (HttpURLConnection)url.openConnection();
		// Reading the feed
		SyndFeedInput input = new SyndFeedInput();
		SyndFeed feed = input.build(new XmlReader(httpcon));
		List entries = (List) feed.getEntries();
		Iterator itEntries = ((java.util.List) entries).iterator();
		
		ArrayList<String> week1day1result = new ArrayList<String>();
		ArrayList<String> week1day2result = new ArrayList<String>();
		ArrayList<String> week2day1result = new ArrayList<String>();
		ArrayList<String> week2day2result = new ArrayList<String>();
		ArrayList<String> week3day1result = new ArrayList<String>();
		ArrayList<String> week3day2result = new ArrayList<String>();
		ArrayList<String> week4day1result = new ArrayList<String>();
		ArrayList<String> week4day2result = new ArrayList<String>();
		ArrayList<String> week5day1result = new ArrayList<String>();
		ArrayList<String> week5day2result = new ArrayList<String>();
		ArrayList<String> week6day1result = new ArrayList<String>();
		ArrayList<String> week6day2result = new ArrayList<String>();
		ArrayList<String> week7day1result = new ArrayList<String>();
		ArrayList<String> week7day2result = new ArrayList<String>();
		ArrayList<String> week8day1result = new ArrayList<String>();
		ArrayList<String> week8day2result = new ArrayList<String>();
		ArrayList<String> week9day1result = new ArrayList<String>();
		ArrayList<String> week9day2result = new ArrayList<String>();
 
		try {

			String content = "This is the content to write into file";

			File file = new File("./src/eSportsReporterBot/rssfeed.txt");

			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			int count = 0;
			int count2 = 0;
			
			while (itEntries.hasNext()) {
				SyndEntry entry = (SyndEntry) itEntries.next();
				//System.out.println("Title: " + entry.getTitle());
				//System.out.println("Link: " + entry.getLink());
				//System.out.println("Author: " + entry.getAuthor());
				//System.out.println("Publish Date: " + entry.getPublishedDate());
				//System.out.println("Description: " + entry.getDescription().getValue());
				count2++;
				String desc = entry.getDescription().getValue();
				//System.out.println();
				//bw.write(entry.getDescription().getValue());
				//bw.newLine();
				String[] fields = desc.split(",");
				
				if (fields.length == 11 && fields[10].trim().equalsIgnoreCase("WEEK 1") && fields[9].trim().equalsIgnoreCase("DAY 1")) {
					//System.out.println(fields[10] + " " + fields[9]);
					week1day1result.add(desc);
					count++;
				}
				
				if (fields.length == 11 && fields[10].trim().equalsIgnoreCase("WEEK 1") && fields[9].trim().equalsIgnoreCase("DAY 2")) {
					week1day2result.add(desc);
					count++;
				}
				
				if (fields.length == 11 && fields[10].trim().equalsIgnoreCase("WEEK 2") && fields[9].trim().equalsIgnoreCase("DAY 1")) {
					week2day1result.add(desc);
					count++;
				}
				
				if (fields.length == 11 && fields[10].trim().equalsIgnoreCase("WEEK 2") && fields[9].trim().equalsIgnoreCase("DAY 2")) {
					week2day2result.add(desc);
					count++;
				}
				
				if (fields.length == 11 && fields[10].trim().equalsIgnoreCase("WEEK 3") && fields[9].trim().equalsIgnoreCase("DAY 1")) {
					week3day1result.add(desc);
					count++;
				}
				
				if (fields.length == 11 && fields[10].trim().equalsIgnoreCase("WEEK 3") && fields[9].trim().equalsIgnoreCase("DAY 2")) {
					week3day2result.add(desc);
					count++;
				}
				
				if (fields.length == 11 && fields[10].trim().equalsIgnoreCase("WEEK 4") && fields[9].trim().equalsIgnoreCase("DAY 1")) {
					week4day1result.add(desc);
					count++;
				}
				
				if (fields.length == 11 && fields[10].trim().equalsIgnoreCase("WEEK 4") && fields[9].trim().equalsIgnoreCase("DAY 2")) {
					week4day2result.add(desc);
					count++;
				}
				
				if (fields.length == 11 && fields[10].trim().equalsIgnoreCase("WEEK 5") && fields[9].trim().equalsIgnoreCase("DAY 1")) {
					week5day1result.add(desc);
					count++;
				}
				
				if (fields.length == 11 && fields[10].trim().equalsIgnoreCase("WEEK 5") && fields[9].trim().equalsIgnoreCase("DAY 2")) {
					week5day2result.add(desc);
					count++;
				}
				
				if (fields.length == 11 && fields[10].trim().equalsIgnoreCase("WEEK 6") && fields[9].trim().equalsIgnoreCase("DAY 1")) {
					week6day1result.add(desc);
					count++;
				}
				
				if (fields.length == 11 && fields[10].trim().equalsIgnoreCase("WEEK 6") && fields[9].trim().equalsIgnoreCase("DAY 2")) {
					week6day2result.add(desc);
					count++;
				}
				
				if (fields.length == 11 && fields[10].trim().equalsIgnoreCase("WEEK 7") && fields[9].trim().equalsIgnoreCase("DAY 1")) {
					week7day1result.add(desc);
					count++;
				}
				
				if (fields.length == 11 && fields[10].trim().equalsIgnoreCase("WEEK 7") && fields[9].trim().equalsIgnoreCase("DAY 2")) {
					week7day2result.add(desc);
					count++;
				}
				
				if (fields.length == 11 && fields[10].trim().equalsIgnoreCase("WEEK 8") && fields[9].trim().equalsIgnoreCase("DAY 1")) {
					week8day1result.add(desc);
					count++;
				}
				
				if (fields.length == 11 && fields[10].trim().equalsIgnoreCase("WEEK 8") && fields[9].trim().equalsIgnoreCase("DAY 2")) {
					week8day2result.add(desc);
					count++;
				}
				
				if (fields.length == 11 && fields[10].trim().equalsIgnoreCase("WEEK 9") && fields[9].trim().equalsIgnoreCase("DAY 1")) {
					week9day1result.add(desc);
					count++;
				}
				
				if (fields.length == 11 && fields[10].trim().equalsIgnoreCase("WEEK 9") && fields[9].trim().equalsIgnoreCase("DAY 2")) {
					week9day2result.add(desc);
					count++;
				}
				
				
				
						
			}
			
			for(String text : week1day1result) {
				
				bw.write(text);
				bw.newLine();
			}
			
			for(String text : week1day2result) {
				
				bw.write(text);
				bw.newLine();
			}
			
			for(String text : week2day1result) {
				
				bw.write(text);
				bw.newLine();
			}

			for(String text : week2day2result) {
				
				bw.write(text);
				bw.newLine();
			}
			
			for(String text : week3day1result) {
				
				bw.write(text);
				bw.newLine();
			}
			
			for(String text : week3day2result) {
				
				bw.write(text);
				bw.newLine();
			}
			
			for(String text : week4day1result) {
				
				bw.write(text);
				bw.newLine();
			}
			
			for(String text : week4day2result) {
				
				bw.write(text);
				bw.newLine();
			}
			
			for(String text : week5day1result) {
				
				bw.write(text);
				bw.newLine();
			}
			
			for(String text : week5day2result) {
				
				bw.write(text);
				bw.newLine();
			}
			
			for(String text : week6day1result) {
				
				bw.write(text);
				bw.newLine();
			}
			
			for(String text : week6day2result) {
				
				bw.write(text);
				bw.newLine();
			}
			
			for(String text : week7day1result) {
				
				bw.write(text);
				bw.newLine();
			}
			
			for(String text : week7day2result) {
				
				bw.write(text);
				bw.newLine();
			}
			
			for(String text : week8day1result) {
				
				bw.write(text);
				bw.newLine();
			}
			
			for(String text : week8day2result) {
				
				bw.write(text);
				bw.newLine();
			}
			
			for(String text : week9day1result) {
				
				bw.write(text);
				bw.newLine();
			}
			
			for(String text : week9day2result) {
				
				bw.write(text);
				bw.newLine();
			}
			
			bw.flush();

			bw.close();
			System.out.println("");
			System.out.println("Total records retrived: " + count2);
			System.out.println("Total records processed: " + count);
			System.out.println("");
			System.out.println("Retrieving RSS Feed is Done");

		} catch (IOException e) {
			System.out.println("Exception: " + e.getMessage());
			e.printStackTrace();
		}
		
		
    }

}



