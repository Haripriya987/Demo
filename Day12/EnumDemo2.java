enum Dept2{
     CS("Block A"),MATHS("Block B"),STATS("Block C");
	String location;
     private Dept2(String loc){
	this.location=loc;
	}  
     public String getLocation(){
	return location;
	}
}
public class EnumDemo2{
	public static void main(String args[]){
		Dept2 d2=Dept2.STATS;
		System.out.println(d2.getLocation());

	}
}
//Enums also have constructors and methods also
//Block C
