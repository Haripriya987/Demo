public class Lemonade {
  public static boolean lemonadeChange(int[] bills) {
    int five=0;
    int ten=0;
    for(int x:bills){
        if(x==5){
            five++;
        }
        else if(x==10){
            if(five>0){
                five--;
                ten++;
            }
            else{
                return false;
            }
        }
        else{
            if(five>0 && ten>0){
                five--;
                ten--;
            }
            else if(five>=3){
                five=five-3;
            }
            else{
                return false;
            }
        }
    }
    return true;    
}
public static void main(String args[]){
  int[] bills = {5,5,5,10,20};

System.out.println(lemonadeChange(bills));
}
  
}
