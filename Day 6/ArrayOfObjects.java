 class Subject{
    private String subId;
    private String name;
    private int maxMarks;
    private int marksObtain;
    public Subject(String subId,String name,int maxMarks,int marksObtain){
      this.subId=subId;
      this.name=name;
       this.maxMarks=maxMarks;
       this.marksObtain=marksObtain;
    } 
     public String getSubId(){
	return subId;
     }
     public String getName(){
	return  name;
     }
     public int getMaxMarks(){
	return maxMarks;
     }
     public int getMarksObtain(){
	return  marksObtain;
     }
         public void setMaxMarks(int mm){
	 maxMarks=mm;
     }
     public void setMarksObtain(int m){
	marksObtain=m;
     }
     public String toString(){
         return    subId+"\nName:"+name+"\n"+marksObtain+"\n"+maxMarks;
      }
}

public class ArrayOfObjects{
      public static void main(String args[]){
	Subject s[]=new Subject[3];
	              s[0]=new Subject("s101","DSA",100,80);
	             s[1]=new Subject("s102","OS",100,75);
	for(Subject x: s)
	System.out.println(x);		

    }
}

/*
s101
Name:DSA
80
100
s102
Name:OS
75
100
null
*/