public class Person{
	
	private String name;

	private String address;
	private String phone;
	private String email;


	public Person(String n, String a, String p, String e){

	name = n;
	address = a;
	phone = p;
	email = e;

	}


	public String get_name(){

	return name;
	};


	public String get_address(){

	return address;

	};

	public String get_phone(){

	return phone;

	};
	public String get_email(){

	return email;

	};


	public void set_name(String n){

		name = n;

	}

	public void set_address(String a){

		address = a;

	}

	public void set_phone(String p){

		phone = p;

	}

	public void set_email(String e){

		email = e;

	}	











}