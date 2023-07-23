class StaticInner{
        static int x=10;
	int y=20;
       static class Inner{
	void Display(){
		System.out.println("It is only access static members");
		}
	}
}
class SIclass{
       public static void main(String args[]){
	StaticInner.Inner i=new StaticInner.Inner();
		i.Display();
	      System.out.println(StaticInner.x);

	}
}

//It is only access static members
//10
