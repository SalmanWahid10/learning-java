package javatpoint;

public class StudentNew1 {
	int rollno;  
	 String name;  
	 String city;  
	  
	 StudentNew1(int rollno, String name, String city){  
	 this.rollno=rollno;  
	 this.name=name;  
	 this.city=city;  

}
	 public String toString() {
		 return rollno+" "+name+" "+city;
	 }
	 public static void main(String args[]) {
		 
		 StudentNew1 s1=new StudentNew1(101,"Raj","lucknow");
		 StudentNew1 s2=new StudentNew1(102,"Vijay","ghaziabad");    
		 System.out.println(s1);  
		 System.out.println(s2);  
		
	 }  
	 
}
