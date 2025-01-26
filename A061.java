import java.util.ArrayList;
import java.util.List;

class A061 {
    public String convertToTitle(int columnNumber) {
        String result="";
        char c;
        if(columnNumber<27){
            c=(char)(columnNumber+64);
            result+=c;
            return result;
        }
        List<Integer> list=new ArrayList<>();
        int div=columnNumber;
        while(div>26){
            list.add(div%26);
            div=div/26;
        }

        if(div>=0){
            list.add(div);
        }

        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)<=0){
                list.set(i+1,list.get(i+1)-1);
                list.set(i,26+list.get(i));
            }
        }

        if(list.size()>0) list=convert(list);

        for(int i=0;i<list.size();i++){
            if(list.get(i)==0) list.remove(i);
            else break;
        }

        for(int i:list){
            c=(char)(i+64);
            result+=c;
        }





        return result;
    }

    List<Integer> convert(List<Integer> list){
        List<Integer> newList=new ArrayList<>();
        for(int i=list.size()-1;i>=0;i--){
            newList.add(list.get(i));
        }
        return newList;
    }
}