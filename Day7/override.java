class Super{
       public void display(){
	System.out.println("Hello");
	}
}

class Sub extends Super{
        public void  display(){
	System.out.println("Hello Welcome");
	}
}
class override{
     public static void main(String args[]){
	Super s=new Super();
	s.display();
	Sub u=new Sub();
	u.display();

	}
}

//Hello
//Hello Welcome
	       