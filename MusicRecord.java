package marina1023w3d5assignment;

public class MusicRecord {
	//id 
	private int id;
	//recordTitle 
	private String recordTitle;
	//singerName 
	private String singerName;
	//recordLength 
	private double recordLength;
	//recordRanking 
	private int recordRanking;
	

	//constructor
	public MusicRecord (String recordTitle, String singerName, 
						double recordLength, int recordRanking) {
		setId();
		setRecordTitle(recordTitle);
		setSingerName(singerName);
		setRecordLength(recordLength);
		setRecordRanking(recordRanking);
	}
	 
	//getter setters
	
	/*
	 * @ return id
	 */
	public int getId() {
		return id;
	}
	
	/*
	 * @ return recordTitle
	 */	
	public String getRecordTitle() {
		return recordTitle;
	}
	
	/*
	 * @ return singerName
	 */	
	public String getSingerName() {
		return singerName;
	}
	
	/*
	 * @ return recordLength
	 */		
	public double getRecordLength() {
		return recordLength;
	}

	/*
	 * @ return recordRanking
	 */		
	public int getRecordRanking() {
		return recordRanking;
	}
	
	/*
	 * @parm 
	 * id --> random number from 100 to 10000
	 */
	public void setId() {
		int randomNum = (int)((Math.random() * (10000 - 100) + 1) + 100);
		this.id = randomNum;
	}
	/*
	 * @param RecordTitle
	 * 	//recordTitle ---> Null or empty
	 */
	public void setRecordTitle(String recordTitle) {
		if(recordTitle != null || recordTitle != "") {
			this.recordTitle = recordTitle;
		} 
	}
	/*
	 * @param singerName
	 * 	//singerName ---> Null or empty
	 */	
	public void setSingerName(String singerName) {
		if(singerName != null || singerName != "" ) {
			this.singerName = singerName;
		}
	}
	/*
	 * @param recordLength
	 * recordLength ---> more than zero
	 */
	public void setRecordLength(double recordLength) {
		if(recordLength > 0) {
//			 System.out.println(recordLength + " minutes");
			this.recordLength = recordLength;
		} else {
			System.err.println("Record length should be more than zero.");
		}
	}
	/*
	 * @param recordRanking
	 * recordRanking ---> more than zero less than 6
	 */
	public void setRecordRanking(int recordRanking) {
		if(recordRanking > 0 && recordRanking <= 6) {
			this.recordRanking = recordRanking;
		} else {
			System.err.println("Record ranking should be between 0 and 6");
		}
	}
	
}
