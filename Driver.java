package marina1023w3d5assignment;

import java.util.Scanner;

public class Driver {
	//method to print just one object which pass as an argument
	public static void printMusicRecord(MusicRecord tempRecord) {
		System.out.println("ID: " + tempRecord.getId() + 
							"\nRecord Title: " + tempRecord.getRecordTitle() + 
							"\nSinger Name: " + tempRecord.getSingerName() + 
							"\nRecord Length: " + tempRecord.getRecordLength() +
							"\nRecord Ranking: " + tempRecord.getRecordRanking());
	}
	
	//method to iterate through the array and find the index of record for the title
		/*
		 * @return the index of record if we don`t have it --> return -1
		 */
		public static int findIndexOfMusicRecords(MusicRecord[] records, String rTitle) {
			for (int i = 0; i < records.length; i++) {
				if(records[i].getRecordTitle().equalsIgnoreCase(rTitle)) {
					return i;
				}
			}
			return -1;
		}
		//getAverage of lengthRecord -> return average 
		public static void getAverageOfLengthRecord(MusicRecord[] records) {
			double time = 0;
			for(int i = 0; i < records.length; i++) {
				if(records[i].getRecordLength() > 0) {
					time += records[i].getRecordLength();
				}
			}
			System.out.println("Average of Record length: " + time / records.length);
		}
		
		//getAverage of ranking -> return average (accurate double average)
		public static void getAverageOfRanking(MusicRecord[] records) {
			int rank = 0;
			for (int i = 0; i < records.length; i++) {
				if(records[i].getRecordRanking() > 0) {
					rank += records[i].getRecordRanking();
				}
			}
			System.out.println("Average of ranking: " + rank / records.length);
		}
		
		
		//create array and add these objects to array 
		public static void main(String[] args) {
			
			// at least create 7 objects
			Scanner input =new Scanner(System.in);
			MusicRecord m1 = new MusicRecord("Hello", "Adel", 2.2, 5);
			MusicRecord m2 = new MusicRecord("Holiday", "Green Day", 2.4, 4);
			MusicRecord m3 = new MusicRecord("Happy", "Pharrell Williams", 2.3, 3);
			MusicRecord m4 = new MusicRecord("sugar", "Maroon 5", 2.8, 5);
			MusicRecord m5 = new MusicRecord("Thriller", "Michael Jackson", 2.45, 4);
			MusicRecord m6 = new MusicRecord("Try", "Pink", 2.56, 3);
			MusicRecord m7 = new MusicRecord("Time", "Pink Floydk", 2.23, 3);
			
			MusicRecord[] records = new MusicRecord[7];
			records[0] = m1;
			records[1] = m2;
			records[2] = m3;
			records[3] = m4;
			records[4] = m5;
			records[5] = m6;
			records[6] = m7;
			
			//Ask the user to enter the title of record
			//read the input
			System.out.println("please enter record title: ");
			String recordTitle = input.nextLine();
			
			//findRecord
			//print the record
			int index = findIndexOfMusicRecords(records, recordTitle);
			
			if (index == -1) {
				System.err.println("We don't have " + recordTitle);
			} else {
				System.out.println(recordTitle);
				printMusicRecord(records[index]);
			}

			input.close();
			
			//print the both averages
			getAverageOfLengthRecord(records);
			getAverageOfRanking(records);

			
}
}