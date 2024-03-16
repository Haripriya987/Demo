class ClimbingStairs {
    public static int climbStairs(int n) {
       if(n==1 || n==0){
           return 1;
       }
        int previous=1,next=1;
        for(int i=2;i<=n;i++){
            int temp=next;
            next=previous+next;
            previous=temp;
        }
        return next;
    }
    public static void main(String[] args) {
      System.out.println(climbStairs(4));
    }
}