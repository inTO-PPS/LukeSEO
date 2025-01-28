import java.util.Stack;

public class A099 {
    public boolean isValid(String s) {
        Stack stack=new Stack();
        for(int i=0;i<s.length();i++){
            if(!stack.empty() && check(stack.peek().toString().charAt(0),s.charAt(i))) stack.pop();
            else stack.push(s.charAt(i));
        }
        if(stack.empty()) return true;
        else return false;
    }
    boolean check(char a, char b){
        if(a=='(' && b==')' || a=='{' && b=='}' || a=='[' && b==']') return true;
        else return false;
    }
}
