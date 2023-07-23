interface My{
     void Display();
}
class OuterIn{
         public void meth(){
	My m=new My(){
		public void Display(){
			System.out.print("It is Annonymous Inner Class");
		}
	};
	m.Display();
         }
}
class AIclass{
      public static void main(String args[]){
	OuterIn  o=new OuterIn();
	       o.meth();
	}
}


//It is Annonymous Inner Class 