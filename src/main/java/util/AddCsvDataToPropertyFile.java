package util;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.opencsv.CSVReader;

public class AddCsvDataToPropertyFile {

	int count=0;
	public String[] addCsvDataToPropertyFile(String csvFile, String serverName) {
		String [] csvLineData=new String[3];
		String [] serverData=new String[3];
		
		try {
			FileReader obj_File=new FileReader(System.getProperty("user.dir")+csvFile);
						
			CSVReader obj_CsvReader=new CSVReader(obj_File);
			
			
			try {
				csvLineData=obj_CsvReader.readNext();
								
				
				while(csvLineData!=null) {
					
					if(csvLineData[0].equalsIgnoreCase(serverName)) {
						
						serverData[0]=csvLineData[1];
						serverData[1]=csvLineData[2];
						serverData[2]=csvLineData[3];
						count++;
										
						
						break;
					}
					csvLineData=obj_CsvReader.readNext();
				}
				
				if(count==0) {
					System.out.println("no matching server in the csv file");
				}
				
				
			} catch (Exception e) {
				System.out.println(e);
			}
			
		
		} catch (FileNotFoundException e) {
					e.printStackTrace();
		}
		
		return serverData;
		
	}
}
