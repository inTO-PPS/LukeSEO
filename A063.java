class A063 {
    public String addBinary(String a, String b) {
        int adder=0;
        int aa=a.length()-1;
        int bb=b.length()-1;
        String s="";
        while(aa>=0 && bb>=0){
            if(adder==0){
                if(a.charAt(aa)=='0' && '0'==b.charAt(bb)){
                    s="0"+s;
                }
                else if(a.charAt(aa)=='1' && '1'==b.charAt(bb)){
                    s="0"+s;
                    adder=1;
                }
                else{
                    s="1"+s;
                }
            }
            else{
                if(a.charAt(aa)=='0' && '0'==b.charAt(bb)){
                    s="1"+s;
                    adder=0;
                }
                else if(a.charAt(aa)=='1' && '1'==b.charAt(bb)){
                    s="1"+s;
                    adder=1;
                }
                else{
                    s="0"+s;
                    adder=1;
                }
            }
            aa--;
            bb--;
        }
        if(aa<0){
            for(int i=bb;i>=0;i--){
                if(adder==0){
                    if(b.charAt(i)=='0') s="0"+s;
                    else s="1"+s;
                }
                else{
                    if(b.charAt(i)=='0'){
                        s="1"+s;
                        adder=0;
                    }
                    else{
                        s="0"+s;
                        adder=1;
                    }
                }
            }
        }
        else{
            for(int i=aa;i>=0;i--){
                if(adder==0){
                    if(a.charAt(i)=='0') s="0"+s;
                    else s="1"+s;
                }
                else{
                    if(a.charAt(i)=='0'){
                        s="1"+s;
                        adder=0;
                    }
                    else{
                        s="0"+s;
                        adder=1;
                    }
                }
            }
        }
        if(adder==1) s="1"+s;
        return s;
    }
}