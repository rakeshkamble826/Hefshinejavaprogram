package ASSIGN2;

public class DayToYear {


	public static void main(String[] args) {
		int days=366,week=days/7,year=week/52;
		year=days/366;
		days=days/366;
		week=days;
		days=days;
		
		System.out.println("convert days into year and week are.. ");
		System.out.println("year="+year );
		System.out.println("week="+week );
		System.out.println("days="+days );

	}

}
