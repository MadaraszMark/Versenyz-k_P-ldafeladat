package main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TaskSolution {
	
	List<Pilotak> pilota = new ArrayList<Pilotak>();
	
	public void fillData() {
		ReadDataFromFile readData = new ReadDataFromFile();
		pilota = readData.readDataFromCsv();
	}
	
	public void readAllData() {
		for (Pilotak pilotak : pilota) {
			System.out.println(pilotak.toString());
		}
	}
	
	public int getAllRow() {
		return pilota.size();
	}
	
	public String getLastPilotFromList() {
		return pilota.get(pilota.size() - 1).getName();

	}
	
	public void getAllXIXPilots(char divider) {
		for (Pilotak pilotak : pilota) {
			LocalDate birthDate = pilotak.getDateOfBirth();
			if (birthDate != null && birthDate.getYear() < 1901) {
				System.out.println(divider + pilotak.getName() + " (" + birthDate + ")");
			}
		}
	}
	
	public void getLeastPilotNumber() {
		int min = Integer.MAX_VALUE;
		for (Pilotak pilotak : pilota) {
			if(pilotak.getNumber() != 0) {
				if (pilotak.getNumber() < min) {
					min = pilotak.getNumber();
				}
			}
		}
		for (Pilotak pilotak : pilota) {
			if (pilotak.getNumber() == min) {
				System.out.println("6. Feladat: " +pilotak.getNationality());
			}
		}
	}
	
	public void getAllMatchNumber() {
	    Set<Integer> printedNumbers = new HashSet<>();

	    System.out.print("7. Feladat: ");

	    for (Pilotak pilot1 : pilota) {
	        for (Pilotak pilot2 : pilota) {
	            if (pilot1 != pilot2 && pilot1.getNumber() > 0 && pilot1.getNumber() == pilot2.getNumber()) {
	                if (!printedNumbers.contains(pilot1.getNumber())) {
	                    System.out.print(pilot1.getNumber() + ", ");
	                    printedNumbers.add(pilot1.getNumber());
	                }
	                break;
	            }
	        }
	    }
	}
	
	

}
