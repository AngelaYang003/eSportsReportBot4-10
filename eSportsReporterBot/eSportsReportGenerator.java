package eSportsReporterBot;

import java.util.ArrayList;

public class eSportsReportGenerator {
	
	eSportsScore sc;
	eSportsTemlate tp;
	
	

	public eSportsReportGenerator(eSportsScore sc2, eSportsTemlate tp2) {
		// TODO Auto-generated constructor stub
		this.sc = sc2;
		this.tp = tp2;
	}

	public void writeNewReport() {
    	
    	//write report from wining team, not losing team
    	//int count = 0;
    	ArrayList<String> alreadyReportedTeams = new ArrayList<String>();
    	
    	for(StringBuilder sb: sc.teamRecordList) {
    		//count++;
    		//if (count > 5)
    			//break;  //only 5 pairs of team
    		
    		String temp = sb.toString();
    		
    		/* (TSM-DEFEAT)^(CLG-VICTORY)  9W - 9L ^  13W - 5L */
    		//System.out.println("test: " + temp);
    		
    		/* grab last record - which is the current week score */
    		String[] f1 = temp.split(",");
    		int size = f1.length;
    		String record = f1[size-1];
    		//System.out.println(record);
    		String[] f2 = record.split("%");
    		//System.out.println(f2.length);
    		//System.out.println(f2[0]);
    		//System.out.println(f2[1]);
    		
    		
    	    //figure out which team won
    		String team1Record = f2[0];
    		String team2Record = f2[1];
    		String[] f31 = team1Record.split("-");
    		String[] f32 = team2Record.split("-");
    		String teamA = ""; //wining team
    		String teamB = ""; //losing team
    		
    		//System.out.println("test : " + f31[1]);
    		if (f31[1].indexOf("VICTORY") > -1) {
    			teamA = f31[0].trim().replace("(", "");
    			teamB = f32[0].trim().replace("(", "");;
    			
    		} else {
    			teamA = f32[0].trim().replace("(", "");;
    			teamB = f31[0].trim().replace("(", "");;
    		}
    		
    		if (!alreadyReportedTeams.contains(teamA) && !alreadyReportedTeams.contains(teamB)) {
    			System.out.println("");
    			System.out.println("team A " + teamA);
        		System.out.println("team B " + teamB);
        		
        		//(TSM-DEFEAT- 9W - 9L)%(CLG-VICTORY 13W - 5L)% SATURDAY% JANUARY 16% 2016 % DAY 1% WEEK 1
        		fillInReport(teamA, teamB, f2[2], f2[3], f2[4], f2[5],f2[6]);
        		
        		alreadyReportedTeams.add(teamA);
        		alreadyReportedTeams.add(teamB);
    		}
    		 
    	}
    	
    	
		
    }
    
    public void fillInReport(String teamA, String teamB, String weekday, String monthDate, String year, String day, String week) {
    	
    	//System.out.println(baseTemplate1);
    	
    	//System.out.println(tempString);
    	
    	
    	String tempStr1 = tp.baseTemplate1.replace("[TeamA]", teamA);
    	String tempStr2 = tempStr1.replace("[TeamB]", teamB);
    	String weekNumber = week.replace("WEEK", "").trim();
    	String tempStr3 = tempStr2.replace("[week]", weekNumber);
    	String monthdateyear = monthDate + year;
    	String tempStr4 = tempStr3.replace("[date]", monthdateyear);
    	String tempStr5 = tempStr4.replace("[season]", sc.SEASON);
    	
    	String tempStr6 = tempStr5.replace("[#ofWinsTeamA]", Integer.toString(sc.getTeamTotalWins(teamA)));
    	String tempStr7 = tempStr6.replace("[#ofWinsTeamB]", Integer.toString(sc.getTeamTotalWins(teamB)));
    	String tempStr8 = tempStr7.replace("[#ofLosesTeamA]", Integer.toString(sc.getTeamTotalLoses(teamA)));
    	String tempStr9 = tempStr8.replace("[#ofLosesTeamB]", Integer.toString(sc.getTeamTotalLoses(teamB)));
    	String tempStr10 = tempStr9.replace("[TeamA-rank]", sc.getTeamWeeklyRanking(teamA));
    	String tempStr11 = tempStr10.replace("[TeamB-rank]", sc.getTeamWeeklyRanking(teamB));
    	
    	System.out.println(tempStr11);
    	
    }
}
