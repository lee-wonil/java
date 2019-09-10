package java0821;

class Dog {
	private String name;
	public String breed;
	private int age;
	
	Dog(String name,int age){
		this.name=name;
		this.age=age;
		breed = null;
	
	}
	Dog(String name,String breed,int age){
		this.name= name;
		this.age=age;
		this.breed=breed;
	}
}

