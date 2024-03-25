public class MarcsCalories {
  public static long marcsWalk(List<Integer> calorie) {
  
    Collections.sort(calorie, Collections.reverseOrder());
    long sum=0;
    long power=1;
    for(int value:calorie){
        sum+=power*value;
        power*=2;
    }
    
    return sum;
    }

public static void main(String args[]){

    List<Integer> calorie = new ArrayList<Integer>();
    calorie.add(1);
    calorie.add(3);
    calorie.add(2);

    System.out.println(marcsWalk(calorie));

}
  
}
