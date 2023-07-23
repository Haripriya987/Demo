public class WrapperDemo3{
	public static void main(String args[]){
	     float a=12.5f;
	    Float b=12.5f;
	    Float c=(float)Math.sqrt(-1);
	    
	    System.out.println(b.equals(a));
	    System.out.println(c.isInfinite()); 
	    System.out.println(c);   	

	
	}
}

/*
true
false
NaN

*/ 