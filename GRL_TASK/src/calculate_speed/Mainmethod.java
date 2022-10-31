package calculate_speed;

import java.util.Scanner;

public class Mainmethod {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		UserInput ui = new UserInput();
		
		//fetch and store 10 inputs from user
		
		for (int i = 0;i<10;i++) {
			
			Dataset ds = new Dataset();
			ds.setDsDistance(sc.nextDouble());
			
			ds.setDsTime(sc.nextDouble());
			ui.insertDataSet(ds);
		}
		
		Measure m = new Measure();
		m.calculateSpeed(ui);
		
		ShowResults sr = new ShowResults();
		
		sr.saveToCSVfile(ui.fetchDataSetArray());
		
	}
}
