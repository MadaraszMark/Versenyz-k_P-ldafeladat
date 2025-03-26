package main;

public class Main {
	
	public static void main(String[] args) {
		
		TaskSolution taskSolutionObj = new TaskSolution();
		
		taskSolutionObj.fillData();
		
		System.out.println("3. Feladat: " + taskSolutionObj.getAllRow());
		
		System.out.println("4. Feladat: " + taskSolutionObj.getLastPilotFromList());
		
		System.out.println("5. Feladat: ");
		
		taskSolutionObj.getAllXIXPilots('\t');
		
		taskSolutionObj.getLeastPilotNumber();
		
		taskSolutionObj.getAllMatchNumber();
		
	}
	

}
