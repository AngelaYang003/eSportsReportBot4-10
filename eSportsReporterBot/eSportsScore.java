package eSportsReporterBot;

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
import java.util.Set;
import java.util.Map.Entry;

public class eSportsScore {
	public enum TEAMS {
		TSM,CLG,C9,IMT,DIG,NRG,REN,TL,FOX,TIP,
		;
	}
	
	public final String SEASON = "2016 Spring Split";
	
	public final int TSMpos = 1;
	public final int CLGpos = 2;
	public final int C9pos  = 3;
	public final int IMTpos = 4;
	public final int DIGpos = 5;
	public final int NRGpos = 6;
	public final int RENpos = 7;
	public final int TLpos  = 8;
	public final int FOXpos = 9;
	public final int TIPpos = 10;
	
	public StringBuilder TSMscoreStr = new StringBuilder();
	public StringBuilder CLGscoreStr = new StringBuilder();
	public StringBuilder C9scoreStr  = new StringBuilder();
	public StringBuilder IMTscoreStr = new StringBuilder();
	public StringBuilder DIGscoreStr = new StringBuilder();
	public StringBuilder NRGscoreStr = new StringBuilder();
	public StringBuilder RENscoreStr = new StringBuilder();
	public StringBuilder TLscoreStr = new StringBuilder();
	public StringBuilder FOXscoreStr = new StringBuilder();
	public StringBuilder TIPscoreStr = new StringBuilder();
	

	public int TSMranking = 0;
	public int CLGranking = 0;
	public int C9ranking  = 0;
	public int IMTranking = 0;
	public int DIGranking = 0;
	public int NRGranking = 0;
	public int RENranking = 0;
	public int TLranking  = 0;
	public int FOXranking = 0;
	public int TIPranking = 0;
	
	public ArrayList<StringBuilder> teamRecordList = new ArrayList<StringBuilder>();
	
	public int TSMwins  = 0;
	public int CLGwins  = 0;
	public int C9wins   = 0;
	public int IMTwins  = 0;
	public int DIGwins  = 0;
	public int NRGwins  = 0;
	public int RENwins  = 0;
	public int TLwins   = 0;
	public int FOXwins  = 0;
	public int TIPwins  = 0;
	
	public int TSMdefeats  = 0;
	public int CLGdefeats  = 0;
	public int C9defeats   = 0;
	public int IMTdefeats  = 0;
	public int DIGdefeats  = 0;
	public int NRGdefeats  = 0;
	public int RENdefeats  = 0;
	public int TLdefeats   = 0;
	public int FOXdefeats  = 0;
	public int TIPdefeats  = 0;
	
	
	public int firstLine = 2;
	
	public String weeklyReport1 = "";
	public String weeklyReport2 = "";
	public String weeklyReport3 = "";
	public String weeklyReport4 = "";
	public String weeklyReport5 = "";
	public String weeklyReport6 = "";
	public String weeklyReport7 = "";
	public String weeklyReport8 = "";
	public String weeklyReport9 = "";
	public String weeklyReport10 = "";
	
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
	
	Map<String, Integer> week1aRanking = new HashMap<String, Integer>();
	Map<String, Integer> week1bRanking = new HashMap<String, Integer>();
	Map<String, Integer> week2aRanking = new HashMap<String, Integer>();
	Map<String, Integer> week2bRanking = new HashMap<String, Integer>();
	Map<String, Integer> week3aRanking = new HashMap<String, Integer>();
	Map<String, Integer> week3bRanking = new HashMap<String, Integer>();
	Map<String, Integer> week4aRanking = new HashMap<String, Integer>();
	Map<String, Integer> week4bRanking = new HashMap<String, Integer>();
	Map<String, Integer> week5aRanking = new HashMap<String, Integer>();
	Map<String, Integer> week5bRanking = new HashMap<String, Integer>();
	Map<String, Integer> week6aRanking = new HashMap<String, Integer>();
	Map<String, Integer> week6bRanking = new HashMap<String, Integer>();
	Map<String, Integer> week7aRanking = new HashMap<String, Integer>();
	Map<String, Integer> week7bRanking = new HashMap<String, Integer>();
	Map<String, Integer> week8aRanking = new HashMap<String, Integer>();
	Map<String, Integer> week8bRanking = new HashMap<String, Integer>();
	Map<String, Integer> week9aRanking = new HashMap<String, Integer>();
	Map<String, Integer> week9bRanking = new HashMap<String, Integer>();
	
	ArrayList<Entry<String, Integer>> week1aRankingList;
	ArrayList<Entry<String, Integer>> week1bRankingList;
	ArrayList<Entry<String, Integer>> week2aRankingList;
	ArrayList<Entry<String, Integer>> week2bRankingList;
	ArrayList<Entry<String, Integer>> week3aRankingList;
	ArrayList<Entry<String, Integer>> week3bRankingList;
	ArrayList<Entry<String, Integer>> week4aRankingList;
	ArrayList<Entry<String, Integer>> week4bRankingList;
	ArrayList<Entry<String, Integer>> week5aRankingList;
	ArrayList<Entry<String, Integer>> week5bRankingList;
	ArrayList<Entry<String, Integer>> week6aRankingList;
	ArrayList<Entry<String, Integer>> week6bRankingList;
	ArrayList<Entry<String, Integer>> week7aRankingList;
	ArrayList<Entry<String, Integer>> week7bRankingList;
	ArrayList<Entry<String, Integer>> week8aRankingList;
	ArrayList<Entry<String, Integer>> week8bRankingList;
	ArrayList<Entry<String, Integer>> week9aRankingList;
	ArrayList<Entry<String, Integer>> week9bRankingList;
	
	String baseTemplate1 = "";
	String baseTemplate2 = "";
	StringBuilder base1 = new StringBuilder();
	
	public eSportsScore() {
		teamRecordList.add(TSMscoreStr);
		teamRecordList.add(CLGscoreStr);
		teamRecordList.add(C9scoreStr);
		teamRecordList.add(IMTscoreStr);
		teamRecordList.add(DIGscoreStr);
		teamRecordList.add(NRGscoreStr);
		teamRecordList.add(RENscoreStr);
		teamRecordList.add(TLscoreStr);
		teamRecordList.add(FOXscoreStr);
		teamRecordList.add(TIPscoreStr);
	}
	
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
	
    public void parseScoresWeek(String week) throws IOException {
		
		/* parse from score board spreadsheet (.csv) file
		 * file name : scoreboard - 9 weeks - season.csv
		 * file location: same folder where the eSport  
		 *
		 */
    	
    	System.out.println("reading score file");
		File dir = new File("./src/eSportsReporterBot");
		File fin = new File(dir.getCanonicalPath() + File.separator + "rssfeed.txt");
		
		FileInputStream fis = new FileInputStream(fin);
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
	   
		String line = null;
		int count = 0;
		
		while ((line = br.readLine()) != null) {
			
			String[] fields = line.split(","); 
			
			/* parse all scores into weekly groups */
			if (fields.length == 11 && fields[10].trim().equalsIgnoreCase("WEEK 1") && fields[9].trim().equalsIgnoreCase("DAY 1")) {
				//System.out.println(fields[10] + " " + fields[9] + " " + line);
				week1day1result.add(line);
				count++;
			}
			
			if (fields.length == 11 && fields[10].trim().equalsIgnoreCase("WEEK 1") && fields[9].trim().equalsIgnoreCase("DAY 2")) {
				System.out.println(fields[10] + " " + fields[9] + " " + line);
				week1day2result.add(line);
				count++;
			}
			
			if (fields.length == 11 && fields[10].trim().equalsIgnoreCase("WEEK 2") && fields[9].trim().equalsIgnoreCase("DAY 1")) {
				week2day1result.add(line);
				count++;
			}
			
			if (fields.length == 11 && fields[10].trim().equalsIgnoreCase("WEEK 2") && fields[9].trim().equalsIgnoreCase("DAY 2")) {
				week2day2result.add(line);
				count++;
			}
			
			if (fields.length == 11 && fields[10].trim().equalsIgnoreCase("WEEK 3") && fields[9].trim().equalsIgnoreCase("DAY 1")) {
				week3day1result.add(line);
				count++;
			}
			
			if (fields.length == 11 && fields[10].trim().equalsIgnoreCase("WEEK 3") && fields[9].trim().equalsIgnoreCase("DAY 2")) {
				week3day2result.add(line);
				count++;
			}
			
			if (fields.length == 11 && fields[10].trim().equalsIgnoreCase("WEEK 4") && fields[9].trim().equalsIgnoreCase("DAY 1")) {
				week4day1result.add(line);
				count++;
			}
			
			if (fields.length == 11 && fields[10].trim().equalsIgnoreCase("WEEK 4") && fields[9].trim().equalsIgnoreCase("DAY 2")) {
				week4day2result.add(line);
				count++;
			}
			
			if (fields.length == 11 && fields[10].trim().equalsIgnoreCase("WEEK 5") && fields[9].trim().equalsIgnoreCase("DAY 1")) {
				week5day1result.add(line);
				count++;
			}
			
			if (fields.length == 11 && fields[10].trim().equalsIgnoreCase("WEEK 5") && fields[9].trim().equalsIgnoreCase("DAY 2")) {
				week5day2result.add(line);
				count++;
			}
			
			if (fields.length == 11 && fields[10].trim().equalsIgnoreCase("WEEK 6") && fields[9].trim().equalsIgnoreCase("DAY 1")) {
				week6day1result.add(line);
				count++;
			}
			
			if (fields.length == 11 && fields[10].trim().equalsIgnoreCase("WEEK 6") && fields[9].trim().equalsIgnoreCase("DAY 2")) {
				week6day2result.add(line);
				count++;
			}
			
			if (fields.length == 11 && fields[10].trim().equalsIgnoreCase("WEEK 7") && fields[9].trim().equalsIgnoreCase("DAY 1")) {
				week7day1result.add(line);
				count++;
			}
			
			if (fields.length == 11 && fields[10].trim().equalsIgnoreCase("WEEK 7") && fields[9].trim().equalsIgnoreCase("DAY 2")) {
				week7day2result.add(line);
				count++;
			}
			
			if (fields.length == 11 && fields[10].trim().equalsIgnoreCase("WEEK 8") && fields[9].trim().equalsIgnoreCase("DAY 1")) {
				week8day1result.add(line);
				count++;
			}
			
			if (fields.length == 11 && fields[10].trim().equalsIgnoreCase("WEEK 8") && fields[9].trim().equalsIgnoreCase("DAY 2")) {
				week8day2result.add(line);
				count++;
			}
			
			if (fields.length == 11 && fields[10].trim().equalsIgnoreCase("WEEK 9") && fields[9].trim().equalsIgnoreCase("DAY 1")) {
				week9day1result.add(line);
				count++;
			}
			
			if (fields.length == 11 && fields[10].trim().equalsIgnoreCase("WEEK 9") && fields[9].trim().equalsIgnoreCase("DAY 2")) {
				week9day2result.add(line);
				count++;
			}
		}
		
		br.close();
		
		//System.out.println(week1day1result.size());
		
		/* generate weekly reports */
		
		//System.out.println("---- week1 ---");
		parseWeeklyScore(week1day1result);
		//printWeeklyScore();
		calculateTeamTotalWin();
		//printWeeklyWin();
		//weeklyTeamRanking("1a");
		//System.out.println("Top 3 teams are: " + printTop3Teams(week1aRankingList));
		//System.out.println("");
		
		parseWeeklyScore(week1day2result);
		//printWeeklyScore();
		calculateTeamTotalWin();
		//printWeeklyWin();
		//weeklyTeamRanking("1b");
		//System.out.println("Top 3 teams are: " + printTop3Teams(week1bRankingList));
		//System.out.println("");
		
		//System.out.println("---- week2 ---");
		parseWeeklyScore(week2day1result);
		//printWeeklyScore();
		calculateTeamTotalWin();
		//printWeeklyWin();
		//weeklyTeamRanking("2a");
		//System.out.println("Top 3 teams are: " + printTop3Teams(week2aRankingList));
		//System.out.println("");
		
		parseWeeklyScore(week2day2result);
		//printWeeklyScore();
		calculateTeamTotalWin();
		//printWeeklyWin();
		//weeklyTeamRanking("2b");
		//System.out.println("Top 3 teams are: " + printTop3Teams(week2bRankingList));
		//System.out.println("");
		
		//System.out.println("---- week3 ---");
		parseWeeklyScore(week3day1result);
		//printWeeklyScore();
		calculateTeamTotalWin();
		//printWeeklyWin();
		//weeklyTeamRanking("3a");
		//System.out.println("Top 3 teams are: " + printTop3Teams(week3aRankingList));
		//System.out.println("");
		
		parseWeeklyScore(week3day2result);
		//printWeeklyScore();
		calculateTeamTotalWin();
		//printWeeklyWin();
		//weeklyTeamRanking("3b");
		//System.out.println("Top 3 teams are: " + printTop3Teams(week3bRankingList));
		//System.out.println("");
		
		//System.out.println("---- week4 ---");
		parseWeeklyScore(week4day1result);
		//printWeeklyScore();
		calculateTeamTotalWin();
		//printWeeklyWin();
		//weeklyTeamRanking("4a");
		//System.out.println("Top 3 teams are: " + printTop3Teams(week4aRankingList));
		//System.out.println("");
		
		parseWeeklyScore(week4day2result);
		//printWeeklyScore();
		calculateTeamTotalWin();
		//printWeeklyWin();
		//weeklyTeamRanking("4b");
		//System.out.println("Top 3 teams are: " + printTop3Teams(week4bRankingList));
		//System.out.println("");
		
		//System.out.println("---- week5 ---");
		parseWeeklyScore(week5day1result);
		//printWeeklyScore();
		calculateTeamTotalWin();
		//printWeeklyWin();
		//weeklyTeamRanking("5a");
		//System.out.println("Top 3 teams are: " + printTop3Teams(week5aRankingList));
		//System.out.println("");
		
		parseWeeklyScore(week5day2result);
		//printWeeklyScore();
		calculateTeamTotalWin();
		//printWeeklyWin();
		//weeklyTeamRanking("5b");
		//System.out.println("Top 3 teams are: " + printTop3Teams(week5bRankingList));
		//System.out.println("");
		
		//System.out.println("---- week6 ---");
		parseWeeklyScore(week6day1result);
		//printWeeklyScore();
		calculateTeamTotalWin();
		//printWeeklyWin();
		//weeklyTeamRanking("6a");
		//System.out.println("Top 3 teams are: " + printTop3Teams(week6aRankingList));
		//System.out.println("");
		
		parseWeeklyScore(week6day2result);
		//printWeeklyScore();
		calculateTeamTotalWin();
		//printWeeklyWin();
		//weeklyTeamRanking("6b");
		//System.out.println("Top 3 teams are: " + printTop3Teams(week6bRankingList));
		//System.out.println("");
		
		//System.out.println("---- week7 ---");
		parseWeeklyScore(week7day1result);
		//printWeeklyScore();
		calculateTeamTotalWin();
		//printWeeklyWin();
		//weeklyTeamRanking("7a");
		//System.out.println("Top 3 teams are: " + printTop3Teams(week7aRankingList));
		//System.out.println("");
	
		parseWeeklyScore(week7day2result);
		//printWeeklyScore();
		calculateTeamTotalWin();
		//printWeeklyWin();
		//weeklyTeamRanking("7b");
		//System.out.println("Top 3 teams are: " + printTop3Teams(week7bRankingList));
		//System.out.println("");
		
		System.out.println("");
		System.out.println("---- week8 ---");
		System.out.println("");
		parseWeeklyScore(week8day1result);
		//printWeeklyScore();
		calculateTeamTotalWin();
		//printWeeklyWin();
		//weeklyTeamRanking("8a");
		//System.out.println("Top 3 teams are: " + printTop3Teams(week8aRankingList));
		//System.out.println("");
	    
		parseWeeklyScore(week8day2result);
		printWeeklyScore();
		calculateTeamTotalWin();
		printWeeklyWin();
		weeklyTeamRanking("8b");
		//System.out.println("Top 3 teams are: " + printTop3Teams(week8bRankingList));
		//System.out.println("");
		
		
		//System.out.println("---- week9 ---");
		parseWeeklyScore(week9day1result);
		//printWeeklyScore();
		calculateTeamTotalWin();
		//writeNewReport();
		//printWeeklyWin();
		//weeklyTeamRanking("9a");
		//System.out.println("Top 3 teams are: " + printTop3Teams(week9aRankingList));
		//System.out.println("");
		
		parseWeeklyScore(week9day2result);
		//printWeeklyScore();
		calculateTeamTotalWin();
		//printWeeklyWin();
		//weeklyTeamRanking("9b");
		//System.out.println("Top 3 teams are: " + printTop3Teams(week9bRankingList));
		//System.out.println("");
		
	
	}
    
    
    	
    	
		
   
    
    
    
    public void parseWeeklyScore( ArrayList<String> week1day1result) {
		for(String text : week1day1result) {
			
			String[] field1 = text.split(",");
			
			//System.out.println(field1.length);
			
			//TSM, 9W - 9L, DEFEAT, CLG, VICTORY, 13W - 5L, SATURDAY, JANUARY 16, 2016 , DAY 1, WEEK 1
			
			if (field1.length > 0 && field1[0] != null  && field1[2] != null && field1[3] != null ) {
				//System.out.println(field1[0] + " " + field1[2] + " " + field1[3]);
				
				String team1 = field1[0].trim();
				String team2 = field1[3].trim();
				String verb  = field1[2].trim();
				String verb2 = "";
				if (verb.equalsIgnoreCase("DEFEAT")) 
				    verb2 = "VICTORY";
				else
					verb2 = "DEFEAT";
				if (getTeamScoreTeam(team1) != null && getTeamScoreTeam(team2) != null) {
				  //getTeamScoreTeam(team1).append("(" + team1 + "-" + verb + "-" + field1[1]+ ")%").append("(" + team2 + "-" + verb2 + field1[5]+ ")").append(",");
				  //getTeamScoreTeam(team2).append("(" + team2 + "-" + verb2 + "-" + field1[5]+")%").append("(" + team1 + "-" + verb + "-" + field1[1]+")").append(",");
				    getTeamScoreTeam(team1).append("(" + team1 + "-" + verb + "-" + field1[1]+ ")%").append("(" + team2 + "-" + verb2 + field1[5]+ ")" + "%" + field1[6] + "%" + field1[7] + "%" + field1[8] + "%" + field1[9] + "%" + field1[10]).append(",");
					getTeamScoreTeam(team2).append("(" + team2 + "-" + verb2 + "-" + field1[5]+")%").append("(" + team1 + "-" + verb + "-" + field1[1]+ ")" + "%" + field1[6] + "%" + field1[7] + "%" + field1[8] + "%" + field1[9] + "%" + field1[10]).append(",");
				  
				}	
			}			
		}	
	}
	
    public StringBuilder getTeamScoreTeam(String team) {
    	
    	if (team.equalsIgnoreCase("TSM"))
    		return TSMscoreStr;
    	
    	if (team.equalsIgnoreCase("CLG"))
    		return CLGscoreStr;
    	
    	if (team.equalsIgnoreCase("C9"))
    		return C9scoreStr;
    	
    	if (team.equalsIgnoreCase("IMT"))
    		return IMTscoreStr;
    	
    	if (team.equalsIgnoreCase("DIG"))
    		return DIGscoreStr;
    	
    	if (team.equalsIgnoreCase("NRG"))
    		return NRGscoreStr;
    	
    	if (team.equalsIgnoreCase("REN"))
    		return RENscoreStr;
    	
    	if (team.equalsIgnoreCase("TL"))
    		return TLscoreStr;
    	
    	if (team.equalsIgnoreCase("FOX"))
    		return FOXscoreStr;
    	
    	if (team.equalsIgnoreCase("TIP"))
    		return TIPscoreStr;
    	
    	
    	
    	return null;
    }
    
	public void parseScores() throws IOException {
		
		/* parse from score board spreadsheet (.csv) file
		 * file name : scoreboard - 9 weeks - season.csv
		 * file location: same folder where the eSport  
		 *
		 */
		File dir = new File("./src/eSportsReporterBot");
		File fin = new File(dir.getCanonicalPath() + File.separator + "scoreboard - 9 weeks - season.csv");
		
		FileInputStream fis = new FileInputStream(fin);
		 
		//Construct BufferedReader from InputStreamReader
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
	 
		String line = null;
		int lineCount = 1;
		
		clearTeamScores();
		
		while ((line = br.readLine()) != null) {
			//System.out.println(line);
			/*
			  parse out scores from each week
			  TSM,CLG,C9,IMT,DIG,NRG,REN,TL,FOX,TIP,
			
			*/
			
			
			
			//TSM
			String[] field1 = line.split(",");
			if (field1.length > 0 && field1[0] != null && field1[0].length() > 0 && field1[0].equalsIgnoreCase("TSM")) {
				for(int i = 1; i < field1.length; i++) {
					if (field1[i].length() > 0 && field1[i].equalsIgnoreCase("1")) {
						if (TSMscoreStr.length() == 0) {
							TSMscoreStr.append("won(" + getTeamNameByPos(i) + ")");
						} else {
							TSMscoreStr.append(",won(" + getTeamNameByPos(i) + ")");
						}
						
					} else if (field1[i].length() > 0 && field1[i].equalsIgnoreCase("0")) {
						if (TSMscoreStr.length() == 0) {
							TSMscoreStr.append("lost(" + getTeamNameByPos(i) + ")");
						} else {
							TSMscoreStr.append(",lost(" + getTeamNameByPos(i) + ")");
						}
					}
				}
			}
			//CLG
			if (field1.length > 0 && field1[0] != null && field1[0].length() > 0 && field1[0].equalsIgnoreCase("CLG")) {
				for(int i = 1; i < field1.length; i++) {
					if (field1[i].length() > 0 && field1[i].equalsIgnoreCase("1")) {
						if (CLGscoreStr.length() == 0) {
							CLGscoreStr.append("won(" + getTeamNameByPos(i) + ")");
						} else {
							CLGscoreStr.append(",won(" + getTeamNameByPos(i) + ")");
						}
						
					} else if (field1[i].length() > 0 && field1[i].equalsIgnoreCase("0")) {
						if (CLGscoreStr.length() == 0) {
							CLGscoreStr.append("lost(" + getTeamNameByPos(i) + ")");
						} else {
							CLGscoreStr.append(",lost(" + getTeamNameByPos(i) + ")");
						}
					}
				}
			}
			//C9
			if (field1.length > 0 && field1[0] != null && field1[0].length() > 0 && field1[0].equalsIgnoreCase("C9")) {
				for(int i = 1; i < field1.length; i++) {
					if (field1[i].length() > 0 && field1[i].equalsIgnoreCase("1")) {
						if (C9scoreStr.length() == 0) {
							C9scoreStr.append("won(" + getTeamNameByPos(i) + ")");
						} else {
							C9scoreStr.append(",won(" + getTeamNameByPos(i) + ")");
						}
						
					} else if (field1[i].length() > 0 && field1[i].equalsIgnoreCase("0")) {
						if (C9scoreStr.length() == 0) {
							C9scoreStr.append("lost(" + getTeamNameByPos(i) + ")");
						} else {
							C9scoreStr.append(",lost(" + getTeamNameByPos(i) + ")");
						}
					}
				}
			}
			//IMT
			if (field1.length > 0 && field1[0] != null && field1[0].length() > 0 && field1[0].equalsIgnoreCase("IMT")) {
				for(int i = 1; i < field1.length; i++) {
					if (field1[i].length() > 0 && field1[i].equalsIgnoreCase("1")) {
						if (IMTscoreStr.length() == 0) {
							IMTscoreStr.append("won(" + getTeamNameByPos(i) + ")");
						} else {
							IMTscoreStr.append(",won(" + getTeamNameByPos(i) + ")");
						}
						
					} else if (field1[i].length() > 0 && field1[i].equalsIgnoreCase("0")) {
						if (IMTscoreStr.length() == 0) {
							IMTscoreStr.append("lost(" + getTeamNameByPos(i) + ")");
						} else {
							IMTscoreStr.append(",lost");
						}
					}
				}
			}
			//DIG
			if (field1.length > 0 && field1[0] != null && field1[0].length() > 0 && field1[0].equalsIgnoreCase("DIG")) {
				for(int i = 1; i < field1.length; i++) {
					if (field1[i].length() > 0 && field1[i].equalsIgnoreCase("1")) {
						if (DIGscoreStr.length() == 0) {
							DIGscoreStr.append("won(" + getTeamNameByPos(i) + ")"); 
						} else {
							DIGscoreStr.append(",won(" + getTeamNameByPos(i) + ")");
						}
						
					} else if (field1[i].length() > 0 && field1[i].equalsIgnoreCase("0")) {
						if (DIGscoreStr.length() == 0) {
							DIGscoreStr.append("lost(" + getTeamNameByPos(i) + ")");
						} else {
							DIGscoreStr.append(",lost(" + getTeamNameByPos(i) + ")");
						}
					}
				}
			}
			//NRG
			if (field1.length > 0 && field1[0] != null && field1[0].length() > 0 && field1[0].equalsIgnoreCase("NRG")) {
				for(int i = 1; i < field1.length; i++) {
					if (field1[i].length() > 0 && field1[i].equalsIgnoreCase("1")) {
						if (NRGscoreStr.length() == 0) {
							NRGscoreStr.append("won(" + getTeamNameByPos(i) + ")");
						} else {
							NRGscoreStr.append(",won(" + getTeamNameByPos(i) + ")");
						}
						
					} else if (field1[i].length() > 0 && field1[i].equalsIgnoreCase("0")) {
						if (NRGscoreStr.length() == 0) {
							NRGscoreStr.append("lost(" + getTeamNameByPos(i) + ")");
						} else {
							NRGscoreStr.append(",lost(" + getTeamNameByPos(i) + ")");
						}
					}
				}
			}
			//REN
			if (field1.length > 0 && field1[0] != null && field1[0].length() > 0 && field1[0].equalsIgnoreCase("REN")) {
				for(int i = 1; i < field1.length; i++) {
					if (field1[i].length() > 0 && field1[i].equalsIgnoreCase("1")) {
						if (RENscoreStr.length() == 0){
							RENscoreStr.append("won(" + getTeamNameByPos(i) + ")");
						} else {
							RENscoreStr.append(",won(" + getTeamNameByPos(i) + ")");
						}
						
					} else if (field1[i].length() > 0 && field1[i].equalsIgnoreCase("0")) {
						if (RENscoreStr.length() == 0) {
							RENscoreStr.append("lost(" + getTeamNameByPos(i) + ")");
						} else {
							RENscoreStr.append(",lost(" + getTeamNameByPos(i) + ")");
						}
					}
				}
			}
			//TL
			if (field1.length > 0 && field1[0] != null && field1[0].length() > 0 && field1[0].equalsIgnoreCase("TL")) {
				for(int i = 1; i < field1.length; i++) {
					if (field1[i].length() > 0 && field1[i].equalsIgnoreCase("1")) {
						if (TLscoreStr.length() == 0) {
							TLscoreStr.append("won(" + getTeamNameByPos(i) + ")");
						} else {
							TLscoreStr.append(",won(" + getTeamNameByPos(i) + ")");
						}
						
					} else if (field1[i].length() > 0 && field1[i].equalsIgnoreCase("0")) {
						if (TLscoreStr.length() == 0) {
							TLscoreStr.append("lost(" + getTeamNameByPos(i) + ")");
						} else {
							TLscoreStr.append(",lost(" + getTeamNameByPos(i) + ")");
						}
					}
				}
			}
			//FOX
			if (field1.length > 0 && field1[0] != null && field1[0].length() > 0 && field1[0].equalsIgnoreCase("FOX")) {
				for(int i = 1; i < field1.length; i++) {
					if (field1[i].length() > 0 && field1[i].equalsIgnoreCase("1")) {
						if (FOXscoreStr.length() == 0) {
							FOXscoreStr.append("won(" + getTeamNameByPos(i) + ")");
						} else {
							FOXscoreStr.append(",won(" + getTeamNameByPos(i) + ")");
						}
						
					} else if (field1[i].length() > 0 && field1[i].equalsIgnoreCase("0")) {
						if (FOXscoreStr.length() == 0) {
							FOXscoreStr.append("lost(" + getTeamNameByPos(i) + ")");
						} else {
							FOXscoreStr.append(",lost(" + getTeamNameByPos(i) + ")");
						}
					}
				}
			}
			//TIP
			if (field1.length > 0 && field1[0] != null && field1[0].length() > 0 && field1[0].equalsIgnoreCase("TIP")) {
				for(int i = 1; i < field1.length; i++) {
					if (field1[i].length() > 0 && field1[i].equalsIgnoreCase("1")) {
						if (TIPscoreStr.length() == 0) {
							TIPscoreStr.append("won(" + getTeamNameByPos(i) + ")");
						} else {
							TIPscoreStr.append(",won(" + getTeamNameByPos(i) + ")");
						}
						
					} else if (field1[i].length() > 0 && field1[i].equalsIgnoreCase("0")) {
						if (TIPscoreStr.length() == 0) {
							TIPscoreStr.append("lost(" + getTeamNameByPos(i) + ")");
						} else {
							TIPscoreStr.append(",lost(" + getTeamNameByPos(i) + ")");
						}
					}
				}
			}
			
			
		}
	 
		br.close();
		
		System.out.println("");
		System.out.println("------------ Season End Scores -----------");
		System.out.println("");
		
		System.out.println("TSM game records : " + TSMscoreStr.toString());
		System.out.println("CLG game records : " + CLGscoreStr.toString());
		System.out.println("C9  game records : " + C9scoreStr.toString());
		System.out.println("IMT game records : " + IMTscoreStr.toString());
		System.out.println("DIG game records : " + DIGscoreStr.toString());
		System.out.println("NRG game records : " + NRGscoreStr.toString());
		System.out.println("REN game records : " + RENscoreStr.toString());
		System.out.println("FOX game records : " + FOXscoreStr.toString());
		System.out.println("TIP game records : " + TIPscoreStr.toString());
		
		
	
	}
	
	public void generateWeeklyReports(String week) {
		
		//String sentence = "";
		//System.out.println("check weekly report : " + week);
	
		
		/*
		
		if (week.equals("1a")) {
			pos1 = fields[size - 1].indexOf("(");
		}
			    
		if (week.equals("1b")) {
			pos1 = fields[size - 9].indexOf("(");
		}
			
		    
		if (week.equals("2a")) {
			pos1 = fields[size - 1].indexOf("(");
		}
			
			    
		if (week.equals("2b")) {
			
		}
			 
			
		if (week.equals("3a")) {
			
		}
			
		    
	    if (week.equals("3b")) {
	    	
	    }
		     
	    
	    if (week.equals("4a")) {
	    	
	    }
			
		    
	    if (week.equals("4b")) {
	    	
	    }
		     	
		
	    if (week.equals("5a")) {
	    	
	    }
			
		    
	    if (week.equals("5b")) {
	    	
	    }
		     
	    
	    if (week.equals("6a")) { 
			
	    }
	    
	    if (week.equals("6b")) { 
		     
	    }
	    
	    if (week.equals("7a")) {
	    	
	    }
			
		    
	    if (week.equals("7b")) {
	    	
	    }
		    
		
	    if (week.equals("8a")) {
	    	
	    }
			
		    
	    if (week.equals("8b")) {
	    	
	    	
	    }
		    
	    
	    if (week.equals("9a")) { 
			
	    }
	    
	    if (week.equals("9b"))  {
		    
	    }
	    
			*/
		
		    int pos1 = 0;
		    int size = 0;
		    String team1 = "";
		    
		    String TSMScoreStr1a = TSMscoreStr.toString();
			String[] fields = TSMScoreStr1a.split(",");
			size =  fields.length;	
		    pos1 = fields[size - 1].indexOf("(");
			team1 = "TSM";
			String verb  = fields[size - 1].substring(0, pos1);
			String team2 = fields[size - 1].substring(pos1).replace(")", "").replace("(", "");
			
			weeklyReport1 = team1 + " " + verb + " " + team2;
			//System.out.println("weeklyReport1 " + weeklyReport1);
			
			String CLGScoreStr1a = CLGscoreStr.toString();
			fields = CLGScoreStr1a.split(",");
			size =  fields.length;
			team1 = "CLG";
			pos1 = fields[size - 1].indexOf("(");
			verb  = fields[size - 1].substring(0, pos1);
			team2 = fields[size - 1].substring(pos1).replace(")", "").replace("(", "");
			
			weeklyReport2 = team1 + " " + verb + " " + team2;
			//System.out.println("weeklyReport2 " + weeklyReport2);
			
			String C9ScoreStr1a = C9scoreStr.toString();
			fields = C9ScoreStr1a.split(",");
			size =  fields.length;
			team1 = "C9";
			pos1 = fields[size - 1].indexOf("(");
			verb  = fields[size - 1].substring(0, pos1);
			team2 = fields[size - 1].substring(pos1).replace(")", "").replace("(", "");
			
			weeklyReport3 = team1 + " " + verb + " " + team2;
			//System.out.println("weeklyReport3 " + weeklyReport3);
			
			String IMTScoreStr1a = IMTscoreStr.toString();
			fields = IMTScoreStr1a.split(",");
			size =  fields.length;
			team1 = "IMT";
			pos1 = fields[size - 1].indexOf("(");
			verb  = fields[size - 1].substring(0, pos1);
			team2 = fields[size - 1].substring(pos1).replace(")", "").replace("(", "");
			
			weeklyReport4 = team1 + " " + verb + " " + team2;
			//System.out.println("weeklyReport4 " + weeklyReport4);
			
			String DIGScoreStr1a = DIGscoreStr.toString();
			fields = DIGScoreStr1a.split(",");
			size =  fields.length;
			team1 = "DIG";
			pos1 = fields[size - 1].indexOf("(");
			verb  = fields[size - 1].substring(0, pos1);
			team2 = fields[size - 1].substring(pos1).replace(")", "").replace("(", "");
			
			weeklyReport5 = team1 + " " + verb + " " + team2;
			
			String NRGScoreStr1a = NRGscoreStr.toString();
			fields = NRGScoreStr1a.split(",");
			size =  fields.length;
			team1 = "NRG";
			pos1 = fields[size - 1].indexOf("(");
			verb  = fields[size - 1].substring(0, pos1);
			team2 = fields[size - 1].substring(pos1).replace(")", "").replace("(", "");
			
			weeklyReport6 = team1 + " " + verb + " " + team2;
			
			String RENScoreStr1a = RENscoreStr.toString();
			fields = RENScoreStr1a.split(",");
			size =  fields.length;
			team1 = "REN";
			pos1 = fields[size - 1].indexOf("(");
			verb  = fields[size - 1].substring(0, pos1);
			team2 = fields[size - 1].substring(pos1).replace(")", "").replace("(", "");
			
			weeklyReport7 = team1 + " " + verb + " " + team2;
			
			String TLScoreStr1a = TLscoreStr.toString();
			fields = TLScoreStr1a.split(",");
			size =  fields.length;
			team1 = "TL";
			pos1 = fields[size - 1].indexOf("(");
			verb  = fields[size - 1].substring(0, pos1);
			team2 = fields[size - 1].substring(pos1).replace(")", "").replace("(", "");
			
			weeklyReport8 = team1 + " " + verb + " " + team2;
			
			String FOXscoreStr1a = FOXscoreStr.toString();
			fields = FOXscoreStr1a.split(",");
			size =  fields.length;
			team1 = "FOX";
			pos1 = fields[size - 1].indexOf("(");
			verb  = fields[size - 1].substring(0, pos1);
			team2 = fields[size - 1].substring(pos1).replace(")", "").replace("(", "");
			
			weeklyReport9 = team1 + " " + verb + " " + team2;
			
			String TIPscoreStr1a = TIPscoreStr.toString();
			fields = TIPscoreStr1a.split(",");
			size =  fields.length;
			team1 = "TIP";
			pos1 = fields[size - 1].indexOf("(");
			verb  = fields[size - 1].substring(0, pos1);
			team2 = fields[size - 1].substring(pos1).replace(")", "").replace("(", "");
			
			weeklyReport10 = team1 + " " + verb + " " + team2;
			
			//System.out.println("weeklyReport5 " + weeklyReport5);
			
			/*
			public StringBuilder TSMscoreStr = new StringBuilder();
			public StringBuilder CLGscoreStr = new StringBuilder();
			public StringBuilder C9scoreStr  = new StringBuilder();
			public StringBuilder IMTscoreStr = new StringBuilder();
			public StringBuilder DIGscoreStr = new StringBuilder();
			public StringBuilder NRGscoreStr = new StringBuilder();
			public StringBuilder RENscoreStr = new StringBuilder();
			public StringBuilder TLscoreStr = new StringBuilder();
			public StringBuilder FOXscoreStr = new StringBuilder();
			public StringBuilder TIPscoreStr = new StringBuilder();
			*/
		
		
		
	
	}
	
	public void calculateTeamTotalWin() {
		
		String[] fields = null;
		String[] fields2 = null;
		
		String TSMscore = TSMscoreStr.toString();
		//System.out.println("score check :" + TSMscore);
		fields = TSMscore.split(",");
		fields2 = fields[fields.length - 1].split("%");
		//for (int i = 0; i < fields.length; i++) {
			if (fields2[0].indexOf("VICTORY") > -1) 
				TSMwins++;
			else
				TSMdefeats++;
		//}
		
		String CLGscore = CLGscoreStr.toString();
		fields = CLGscore.split(",");
		fields2 = fields[fields.length - 1].split("%");
		//for (int i = 0; i < fields.length; i++) {
			if (fields2[0].indexOf("VICTORY") > -1) 
				CLGwins++;
			else
				CLGdefeats++;
		//}
		
		String C9score = C9scoreStr.toString();
		fields = C9score.split(",");
		fields2 = fields[fields.length - 1].split("%");
		//for (int i = 0; i < fields.length; i++) {
			if (fields2[0].indexOf("VICTORY") > -1) 
				C9wins++;
			else
				C9defeats++;
		//}
		
		String IMTscore = IMTscoreStr.toString();
		fields = IMTscore.split(",");
		fields2 = fields[fields.length - 1].split("%");
		//for (int i = 0; i < fields.length; i++) {
			if (fields2[0].indexOf("VICTORY") > -1) 
				IMTwins++;
			else
				IMTdefeats++;
		//}
		
		String DIGscore = DIGscoreStr.toString();
		fields = DIGscore.split(",");
		fields2 = fields[fields.length - 1].split("%");
		//for (int i = 0; i < fields.length; i++) {
			if (fields2[0].indexOf("VICTORY") > -1) 
				DIGwins++;
			else
				DIGdefeats++;
		//}
		
		String NRGscore = NRGscoreStr.toString();
		fields = NRGscore.split(",");
		fields2 = fields[fields.length - 1].split("%");
		//for (int i = 0; i < fields.length; i++) {
			if (fields2[0].indexOf("VICTORY") > -1) 
				NRGwins++;
			else
				NRGdefeats++;
		//}
		
		String RENscore = RENscoreStr.toString();
		fields = RENscore.split(",");
		fields2 = fields[fields.length - 1].split("%");
		//for (int i = 0; i < fields.length; i++) {
			if (fields2[0].indexOf("VICTORY") > -1) 
				RENwins++;
			else
				RENdefeats++;
		//}
		
		String TLscore = TLscoreStr.toString();
		fields = TLscore.split(",");
		fields2 = fields[fields.length - 1].split("%");
		//for (int i = 0; i < fields.length; i++) {
			if (fields2[0].indexOf("VICTORY") > -1) 
				TLwins++;
			else
				TLdefeats++;
		//}
		
		String FOXscore = FOXscoreStr.toString();
		fields = FOXscore.split(",");
		fields2 = fields[fields.length - 1].split("%");
		//for (int i = 0; i < fields.length; i++) {
			if (fields2[0].indexOf("VICTORY") > -1) 
				FOXwins++;
			else
				FOXdefeats++;
		//}
		
		String TIPscore = TIPscoreStr.toString();
		fields = TIPscore.split(",");
		fields2 = fields[fields.length - 1].split("%");
		//for (int i = 0; i < fields.length; i++) {
			if (fields2[0].indexOf("VICTORY") > -1) 
				TIPwins++;
			else
				TIPdefeats++;
		//}
		
		
	}
	
	public void weeklyTeamRanking(String week) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("TSM", getWins("TSM"));
        map.put("CLG", getWins("CLG"));
        map.put("C9", getWins("C9"));
        map.put("IMT", getWins("IMT"));
        map.put("DIG", getWins("DIG"));
        map.put("NRG", getWins("NRG"));
        map.put("REN", getWins("REN"));
        map.put("TL", getWins("TL"));
        map.put("FOX", getWins("FOX"));
        map.put("TIP", getWins("TIP"));
        
        
        Set<Entry<String, Integer>> set = map.entrySet();
        ArrayList<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
        Collections.sort( list, new Comparator<Map.Entry<String, Integer>>()
        {
            public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 )
            {
                return (o2.getValue()).compareTo( o1.getValue() );
            }
        } );
        
        if (week.equals("1a")) {
        	week1aRankingList = list;
        	System.out.println("");
        	System.out.println("-- weekly team ranking --");
        	System.out.println("");
        	int count = 1;
        	for(Map.Entry<String, Integer> entry:week1aRankingList){
        		setTeamWeeklyRanking(entry.getKey(), count);
                System.out.println("(" + count + "). " + entry.getKey()+" : "+entry.getValue());
                count++;
            }
        	System.out.println("");
        }
        
        if (week.equals("1b")) {
        	week1bRankingList = list;
        	System.out.println("");
        	System.out.println("-- weekly team ranking --");
        	int count = 1;
        	for(Map.Entry<String, Integer> entry:week1bRankingList){
        		setTeamWeeklyRanking(entry.getKey(), count);
                System.out.println("(" + count + "). " + entry.getKey()+" : "+entry.getValue());
                count++;
            }
        	System.out.println("");
        }
        
        if (week.equals("2a")) {
        	week2aRankingList = list;
        	System.out.println("");
        	System.out.println("-- weekly team ranking --");
        	int count = 1;
        	for(Map.Entry<String, Integer> entry:week2aRankingList){
        		setTeamWeeklyRanking(entry.getKey(), count);
                System.out.println("(" + count + "). " + entry.getKey()+" : "+entry.getValue());
                count++;
            }
        	System.out.println("");
        }
        
        if (week.equals("2b")) {
        	week2bRankingList = list;
        	System.out.println("");
        	int count = 1;
        	System.out.println("-- weekly team ranking --");
        	for(Map.Entry<String, Integer> entry:week2bRankingList){
        		setTeamWeeklyRanking(entry.getKey(), count);
                System.out.println("(" + count + "). " + entry.getKey()+" : "+entry.getValue());
                count++;
            }
        }
        	
        if (week.equals("3a")) {
        	week3aRankingList = list;
        	System.out.println("");
        	System.out.println("-- weekly team ranking --");
        	int count = 1;
        	for(Map.Entry<String, Integer> entry:week3aRankingList){
        		setTeamWeeklyRanking(entry.getKey(), count);
                System.out.println("(" + count + "). " + entry.getKey()+" : "+entry.getValue());
                count++;
            }
        }
        
        if (week.equals("3b")) {
        	week3bRankingList = list;
        	System.out.println("");
        	System.out.println("-- weekly team ranking --");
        	int count = 1;
        	for(Map.Entry<String, Integer> entry:week3bRankingList){
        		setTeamWeeklyRanking(entry.getKey(), count);
                System.out.println("(" + count + "). " + entry.getKey()+" : "+entry.getValue());
                count++;
            }
        }

        if (week.equals("4a")) {
        	week4aRankingList = list;
        	System.out.println("");
        	System.out.println("-- weekly team ranking --");
        	int count = 1;
        	for(Map.Entry<String, Integer> entry:week4aRankingList){
        		setTeamWeeklyRanking(entry.getKey(), count);
                System.out.println("(" + count + "). " + entry.getKey()+" : "+entry.getValue());
                count++;
            }
        }
        
        if (week.equals("4b")) {
        	week4bRankingList = list;
        	System.out.println("");
        	System.out.println("-- weekly team ranking --");
        	int count = 1;
        	for(Map.Entry<String, Integer> entry:week4bRankingList){
        		setTeamWeeklyRanking(entry.getKey(), count);
                System.out.println("(" + count + "). " + entry.getKey()+" : "+entry.getValue());
                count++;
            }
        }
	
        if (week.equals("5a")) {
        	week5aRankingList = list;
        	System.out.println("");
        	System.out.println("-- weekly team ranking --");
        	int count = 1;
        	for(Map.Entry<String, Integer> entry:week5aRankingList){
        		setTeamWeeklyRanking(entry.getKey(), count);
                System.out.println("(" + count + "). " + entry.getKey()+" : "+entry.getValue());
                count++;
            }
        	System.out.println("");
        }
        
        if (week.equals("5b")) {
        	week5bRankingList = list;
        	System.out.println("");
        	System.out.println("-- weekly team ranking --");
        	int count = 1;
        	for(Map.Entry<String, Integer> entry:week5bRankingList){
        		setTeamWeeklyRanking(entry.getKey(), count);
                System.out.println("(" + count + "). " + entry.getKey()+" : "+entry.getValue());
                count++;
            }
        	System.out.println("");
        }
        
        if (week.equals("6a")) {
        	week6aRankingList = list;
        	System.out.println("");
        	System.out.println("-- weekly team ranking --");
        	int count = 1;
        	for(Map.Entry<String, Integer> entry:week6aRankingList){
        		setTeamWeeklyRanking(entry.getKey(), count);
                System.out.println("(" + count + "). " + entry.getKey()+" : "+entry.getValue());
                count++;
            }
        	System.out.println("");
        }
        
        if (week.equals("6b")) {
        	week6bRankingList = list;
        	System.out.println("");
        	System.out.println("-- weekly team ranking --");
        	int count = 1;
        	for(Map.Entry<String, Integer> entry:week6bRankingList){
        		setTeamWeeklyRanking(entry.getKey(), count);
                System.out.println("(" + count + "). " + entry.getKey()+" : "+entry.getValue());
                count++;
            }
        	System.out.println("");
        }
        
        if (week.equals("7a")) {
        	week7aRankingList = list;
        	System.out.println("");
        	System.out.println("-- weekly team ranking --");
        	int count = 1;
        	for(Map.Entry<String, Integer> entry:week7aRankingList){
        		setTeamWeeklyRanking(entry.getKey(), count);
                System.out.println("(" + count + "). " + entry.getKey()+" : "+entry.getValue());
                count++;
            }
        	System.out.println("");
        }
        
        if (week.equals("7b")) {
        	week7bRankingList = list;
        	System.out.println("");
        	System.out.println("-- weekly team ranking --");
        	int count = 1;
        	for(Map.Entry<String, Integer> entry:week7bRankingList){
        		setTeamWeeklyRanking(entry.getKey(), count);
                System.out.println("(" + count + "). " + entry.getKey()+" : "+entry.getValue());
                count++;
            }
        	System.out.println("");
        }
        
       
        if (week.equals("8a")) {
         	week8bRankingList = list;
         	System.out.println("");
         	System.out.println("-- weekly team ranking --");
         	int count = 1;
         	for(Map.Entry<String, Integer> entry:week8bRankingList){
         		setTeamWeeklyRanking(entry.getKey(), count);
                 System.out.println("(" + count + "). " + entry.getKey()+" : "+entry.getValue());
                 count++;
             }
         	
         	System.out.println("");
        }
        	
        
        if (week.equals("8b")) {
             	week8bRankingList = list;
             	System.out.println("");
             	System.out.println("-- weekly team ranking --");
             	int count = 1;
             	for(Map.Entry<String, Integer> entry:week8bRankingList){
             		setTeamWeeklyRanking(entry.getKey(), count);
                     System.out.println("(" + count + "). " + entry.getKey()+" : "+entry.getValue());
                     count++;
                 }
             	
             	System.out.println("");
        }
        
        if (week.equals("9a")) {
        	week9aRankingList = list;
        	System.out.println("");
        	System.out.println("-- weekly team ranking --");
        	int count = 1;
        	for(Map.Entry<String, Integer> entry:week9aRankingList){
        		setTeamWeeklyRanking(entry.getKey(), count);
                System.out.println("(" + count + "). " + entry.getKey()+" : "+entry.getValue());
                count++;
            }
        	System.out.println("");
        }
        
        if (week.equals("9b")) {
        	week9bRankingList = list;
        	System.out.println("");
        	System.out.println("-- weekly team ranking --");
        	int count = 1;
        	for(Map.Entry<String, Integer> entry:week9bRankingList){
        		setTeamWeeklyRanking(entry.getKey(), count);
                System.out.println("(" + count + "). " + entry.getKey()+" : "+entry.getValue());
                count++;
            }
        	System.out.println("");
        }
        
        
		
		
	}
	
	public void printWeeklyWin() {
		System.out.println();
		System.out.println("-------- Team's Season records ----------");
		System.out.println();
		System.out.println("TSM win/lose : " + TSMwins + "/" + TSMdefeats);
		System.out.println("CLG win/lose : " + CLGwins + "/" + CLGdefeats);
		System.out.println("C9  win/lose : " + C9wins  + "/" + C9defeats);
		System.out.println("IMT win/lose : " + IMTwins + "/" + IMTdefeats);
		System.out.println("DIG win/lose : " + DIGwins + "/" + DIGdefeats);
		System.out.println("NRG win/lose : " + NRGwins + "/" + NRGdefeats);
		System.out.println("REN win/lose : " + RENwins + "/" + RENdefeats);
		System.out.println("TL  win/lose : " + TLwins  + "/" + TLdefeats);
		System.out.println("FOX win/lose : " + FOXwins + "/" + FOXdefeats);
		System.out.println("TIP win/lose : " + TIPwins + "/" + TIPdefeats);
	}
	
    public int getWins(String team) {
		int wins = 0;
		if (team.equalsIgnoreCase("TSM"))
			wins = TSMwins - TSMdefeats;
		if (team.equalsIgnoreCase("CLG"))
			wins = CLGwins - CLGdefeats;
		if (team.equalsIgnoreCase("C9"))
			wins = C9wins - C9defeats;
		if (team.equalsIgnoreCase("IMT"))
			wins = IMTwins - IMTdefeats;
		if (team.equalsIgnoreCase("DIG"))
			wins = DIGwins - DIGdefeats;
		if (team.equalsIgnoreCase("NRG"))
			wins = NRGwins - NRGdefeats;
		if (team.equalsIgnoreCase("REN"))
			wins = RENwins - RENdefeats;
		if (team.equalsIgnoreCase("TL"))
			wins = TLwins - TLdefeats;
		if (team.equalsIgnoreCase("FOX"))
			wins = FOXwins - FOXdefeats;
		if (team.equalsIgnoreCase("TIP"))
			wins = TIPwins - TIPdefeats;
		
				
		return wins;
	}
    
    public int getTeamTotalLoses(String team) {
		int defeats = 0;
		if (team.equalsIgnoreCase("TSM")) {
			defeats = TSMdefeats;
			//System.out.println("TSM defeats: " + defeats);
			//System.out.println("TSM win/lose : " + TSMwins + "/" + TSMdefeats);
		}
		if (team.equalsIgnoreCase("CLG"))
			defeats = CLGdefeats;
		if (team.equalsIgnoreCase("C9"))
			defeats = C9defeats;
		if (team.equalsIgnoreCase("IMT"))
			defeats = IMTdefeats;
		if (team.equalsIgnoreCase("DIG"))
			defeats = DIGdefeats;
		if (team.equalsIgnoreCase("NRG"))
			defeats = NRGdefeats;
		if (team.equalsIgnoreCase("REN"))
			defeats = RENdefeats;
		if (team.equalsIgnoreCase("TL"))
			defeats = TLdefeats;
		if (team.equalsIgnoreCase("FOX"))
			defeats = FOXdefeats;
		if (team.equalsIgnoreCase("TIP"))
			defeats = TIPdefeats;
		
				
		return defeats;
	}
    
    public int getTeamTotalWins(String team) {
		int wins = 0;
		if (team.equalsIgnoreCase("TSM")) {
			wins = TSMwins;
			System.out.println("TSM wins: " + wins);
		}
		if (team.equalsIgnoreCase("CLG"))
			wins = CLGwins;
		if (team.equalsIgnoreCase("C9"))
			wins = C9wins;
		if (team.equalsIgnoreCase("IMT"))
			wins = IMTwins;
		if (team.equalsIgnoreCase("DIG"))
			wins = DIGwins;
		if (team.equalsIgnoreCase("NRG"))
			wins = NRGwins;
		if (team.equalsIgnoreCase("REN"))
			wins = RENwins;
		if (team.equalsIgnoreCase("TL"))
			wins = TLwins;
		if (team.equalsIgnoreCase("FOX"))
			wins = FOXwins;
		if (team.equalsIgnoreCase("TIP"))
			wins = TIPwins;
		
				
		return wins;
	}
    
    public void setTeamWeeklyRanking(String team, int rank) {
    	if (team.equalsIgnoreCase("TSM")) {
    		TSMranking = rank;
    	}
    	if (team.equalsIgnoreCase("C9")) {
    		C9ranking = rank;
    	}
    	if (team.equalsIgnoreCase("IMT")) {
    		IMTranking = rank;
    	}
    	if (team.equalsIgnoreCase("CLG")) {
    		CLGranking = rank;
    	}
    	if (team.equalsIgnoreCase("TL")) {
    		TLranking = rank;
    	}
    	if (team.equalsIgnoreCase("NRG")) {
    		NRGranking = rank;
    	}
    	if (team.equalsIgnoreCase("FOX")) {
    		FOXranking = rank;
    	}
    	if (team.equalsIgnoreCase("DIG")) {
    		DIGranking = rank;
    	}
    	if (team.equalsIgnoreCase("TIP")) {
    		TIPranking = rank;
    	}
    	if (team.equalsIgnoreCase("REN")) {
    		TIPranking = rank;
    	}
    	
    	
    }
    
    public String getTeamWeeklyRanking(String team) {
    	if (team.equalsIgnoreCase("TSM")) {
    		return Integer.toString(TSMranking);
    	}
    	if (team.equalsIgnoreCase("C9")) {
    		return Integer.toString(C9ranking);
    	}
    	if (team.equalsIgnoreCase("IMT")) {
    		return Integer.toString(IMTranking);
    	}
    	if (team.equalsIgnoreCase("CLG")) {
    		return Integer.toString(CLGranking);
    	}
    	if (team.equalsIgnoreCase("TL")) {
    		return Integer.toString(TLranking);
    	}
    	if (team.equalsIgnoreCase("NRG")) {
    		return Integer.toString(NRGranking);
    	}
    	if (team.equalsIgnoreCase("FOX")) {
    		return Integer.toString(FOXranking);
    	}
    	if (team.equalsIgnoreCase("DIG")) {
    		return Integer.toString(DIGranking);
    	}
    	if (team.equalsIgnoreCase("TIP")) {
    		return Integer.toString(TIPranking);
    	}
    	if (team.equalsIgnoreCase("REN")) {
    		return Integer.toString(RENranking);
    	}
    	
    	
    	
    	return "";
    }

	public String printTop3Teams(ArrayList<Entry<String, Integer>> weekRankingList) {
		int count = 1;
		StringBuilder top3Team = new StringBuilder();
		
		if (weekRankingList != null) {
			for(Map.Entry<String, Integer> entry:weekRankingList){
	            
	            if (count < 4) {
	            	System.out.println(entry.getKey()+" : "+entry.getValue());
	            	top3Team.append(entry.getKey()+" : "+entry.getValue() + " ,");
	            } else {
	            	break;
	            }
	            count++;
	        }
		}
		return top3Team.toString();
	}
	
    public void clearTeamScores() {
		TSMscoreStr = new StringBuilder();
		CLGscoreStr = new StringBuilder();
		C9scoreStr  = new StringBuilder();
		IMTscoreStr = new StringBuilder();
		DIGscoreStr = new StringBuilder();
		NRGscoreStr = new StringBuilder();
		RENscoreStr = new StringBuilder();
		TLscoreStr  = new StringBuilder();
		FOXscoreStr = new StringBuilder();
		TIPscoreStr = new StringBuilder();
		
	}
	
	public void clearWeeklyReports() {
		weeklyReport1 = "";
		weeklyReport2 = "";
		weeklyReport3 = "";
		weeklyReport4 = "";
		weeklyReport5 = "";
		weeklyReport6 = "";
		weeklyReport7 = "";
		weeklyReport8 = "";
		weeklyReport9 = "";
		weeklyReport10 = "";
	}
	
	public void printWeeklyScore() {
		System.out.println("TSM game records : " + TSMscoreStr.toString());
		System.out.println("CLG game records : " + CLGscoreStr.toString());
		System.out.println("C9  game records : " + C9scoreStr.toString());
		System.out.println("IMT game records : " + IMTscoreStr.toString());
		System.out.println("DIG game records : " + DIGscoreStr.toString());
		System.out.println("NRG game records : " + NRGscoreStr.toString());
		System.out.println("REN game records : " + RENscoreStr.toString());
		System.out.println("TL  game records : " + TLscoreStr.toString());
		System.out.println("FOX game records : " + FOXscoreStr.toString());
		System.out.println("TIP game records : " + TIPscoreStr.toString());
	}
	
	public String getTeamNameByPos(int pos) {
	
		
		if ( pos == TSMpos) return "TSM";
		if ( pos == CLGpos) return "CLG";
		if ( pos == C9pos) return "C9";
		if ( pos == IMTpos) return "IMT";
		if ( pos == DIGpos) return "DIG";
		if ( pos == NRGpos) return "NRG";
		if ( pos == RENpos) return "REN";
		if ( pos == FOXpos) return "FOX";
		if ( pos == TLpos) return "TL";
		if ( pos == TSMpos) return "TSM";
		if ( pos == TIPpos) return "TIP";
		
		return "";
		
		
	}

	
}
