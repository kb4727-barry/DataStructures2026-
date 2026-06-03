public class myDate{
	
	
	private int Days; // assumed to be in range [0,30]
	private int Month; // assumed to be in range [0,11]
	private int Year; 



	public myDate(){

	this(0, 0, 0);

	};

	public myDate(int dd, int mm, int yy){

	Days = dd;
	Month = mm;
	Year = yy;

	}

	public void setDate(long elapsedTime){

	// assuming elapsedTime is in days
	int additional_years = (int) elapsedTime / 365;

	int tmp = (int) elapsedTime % 365;

	// Assuming 30 days a month
	
	int additional_months = tmp/30;

	int additional_days = tmp % 30;



	Days = ((Days + additional_days) % 365) % 30;
	
	Month = (Month + additional_months) % 12 + ((Days + additional_days) % 365) / 30;

	Year = Year + additional_years + ((int) Month/12) + ((int) Days/365);


	}




}