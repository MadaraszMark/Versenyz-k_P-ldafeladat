package main;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ReadDataFromFile {
	
	public List<Pilotak> readDataFromCsv() {
		List<Pilotak> pilota = new ArrayList<Pilotak>();
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("adatok/pilotak.csv"), "UTF-8"));
			String header = br.readLine();
			while(br.ready()) {
				String row = br.readLine();
				pilota.add(getPilotaFromRow(row));
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.err.println("Hiba! A fájl nem található!");
		} catch (IOException e) {
			System.err.println("IO Hiba!");
			e.printStackTrace();
		}
		return pilota;
	}
	
	public Pilotak getPilotaFromRow(String row) {
		String[] rowData = row.split(";");
		LocalDate birthDate = null;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
		birthDate = LocalDate.parse(rowData[1], formatter);
		int number = 0;
		if (rowData.length > 3) {
			if (!rowData[3].isEmpty()) {
				number = Integer.parseInt(rowData[3]);
			}
		}
		Pilotak pilotak = new Pilotak(
				rowData[0], 
				birthDate,
				rowData[2], 
				number
			);
		return pilotak;
	}

}
