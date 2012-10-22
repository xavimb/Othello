package model;

import java.io.Serializable;
import java.util.ArrayList;

public class RankingGeneral implements Serializable {
	
	private static final long serialVersionUID = -6168506040830468066L;
	private static RankingGeneral r = new RankingGeneral();
	private static ArrayList<Ranking> list;
	
	private RankingGeneral() {
		list = new ArrayList<Ranking>();
	}
	public static void addRanking(Ranking r){
		
	}
	public static RankingGeneral getInstance() {
		return r;
	}
	public static ArrayList<Ranking> getRanking() {
		return list;
	}
	
}
