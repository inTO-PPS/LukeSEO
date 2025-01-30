public class A143 {
    boolean solution(String s) {
        // Deque<Character> stack=new ArrayDeque<>();
        // for(int i=0;i<s.length();i++){
        //     if(s.charAt(i)=='(') stack.push('(');
        //     else{
        //         if(stack.size()==0) return false;
        //         if(stack.pop()!='(') return false;
        //     }
        // }
        // if(stack.size()!=0) return false;
        // return true;
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(') count++;
            else count --;
            if(count<0) return false;
        }
        if(count>0) return false;
        return true;
    }

}
