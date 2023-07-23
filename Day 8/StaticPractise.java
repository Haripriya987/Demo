class TestPractise{
	static float z=30.4f;
	        int x=10;
	void Show(){
	     System.out.println(x);
	}
	static {
		System.out.println(z);
	}
}
class StaticPractise{
	public static void main(String args[]){
	TestPractise t1=new TestPractise();
		t1.Show();
		t1.x=20;
		t1.Show();
		TestPractise t2=new TestPractise();
		t2.Show();

      }
}

//30.4
//10
//20
//10
