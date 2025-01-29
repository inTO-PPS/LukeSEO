public class A116 {
    public String dayOfTheWeek(int day, int month, int year) {
        if(month==1||month==2) year--;
        month-=2;
        if(month<1) month+=12;
        int dkv=year/100;
        int enl=year%100;
        int w=(enl+enl/4-2*dkv+dkv/4+(13*month-1)/5+day)%7;
        while(w<0) w+=7;
        String[] l={"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        return l[w];
    }
}
