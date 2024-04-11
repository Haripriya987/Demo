import java.util.Stack;

public class RemoveParanthesis {
  public static  String removeOuterParentheses(String s) {
    Stack<Character> st=new Stack<>();
    StringBuilder res=new StringBuilder("");

    for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='('){
            if(st.size()>0){
                res.append("(");
            }
                st.push('(');
        }
        else{
            st.pop();
            if(st.size()>0){
                res.append(s.charAt(i));
            }
        }
    }

    return res.toString();
}
public static void main(String args[]){
  String s="(()())(())";
  System.out.println(removeOuterParentheses(s));
}
}
