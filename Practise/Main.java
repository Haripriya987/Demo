public class Main {
  public int[] shortestToChar(String s, char c) {
    List<Integer> ls=new ArrayList<>();
    int res[]=new int[s.length()];
    for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(c==ch){
            ls.add(i);
        }
    }
    for(int i=0;i<s.length();i++){
        int min=Integer.MAX_VALUE;
        for(int j=0;j<ls.size();j++){
            min=Math.min(min,Math.abs(i-ls.get(j)));
        }
        res[i]=min;
    }
    return res;
}

public static void main(String[] args) {
    
}

}
