class Method2{
    static void update(int a[]){//we are passing object as parameter
     a[2]=39;
    }
    public static void main(String args[]){
	int a[]={32,45,67,89};
	update(a);
	System.out.println(a[2]);
    }
}
//39
