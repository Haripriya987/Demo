package mypack1;
     public class Demo2{
	PackDemo1 pd=new PackDemo1();
	   public void show(){
		System.out.println(pd.a+pd.b+pd.c+pd.b);
	}
}

//Same package but non sub class so it cannot acess private members of a class