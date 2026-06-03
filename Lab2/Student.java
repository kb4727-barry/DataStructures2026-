public class Student extends Person{
	


	public enum status {FRESHMAN, SOPHOMORE, JUNIOR, SENIOR}

	final status student_status;

	// private status student_status;

	public Student(String s, String n, String a, String p, String e){

	// student_status = status.s;

	super(n, a, p, e);

	if(s == "Freshman"){

		student_status = status.FRESHMAN;
		}

	else if(s == "Sophmore"){

		student_status = status.SOPHOMORE;
		}

	else if (s == "Junior"){

		student_status = status.JUNIOR;
		}

	else if (s == "Senior"){

		student_status = status.SENIOR;
	}
	else

		student_status = status.FRESHMAN;








	}


	public status getStatus(){

 		return student_status; 


	}






}