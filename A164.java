public class A164 {
    public int[] solution(String s) {
        int[] list=new int[s.length()];
        for(int i=0;i<s.length();i++){
            if(i==0) list[i]=-1;
            else{
                int flag=0;
                int j=0;
                for(j=i-1;j>=0;j--){
                    if(s.charAt(j)==s.charAt(i)){
                        flag=1;
                        break;
                    }
                }
                if(flag==1) list[i]=i-j;
                else list[i]=-1;
            }
        }
        return list;
    }
}
