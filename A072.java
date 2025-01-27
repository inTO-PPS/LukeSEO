public class A072 {
    public int dayOfYear(String date) {
        String[] part=date.split("-");
        int re=0;
        int[] days={31,28,31,30,31,30,31,31,30,31,30,31};
        int year=Integer.parseInt(part[0]);
        if(year%4==0 && year%100!=0 || year%4==0 && year%400==0) days[1]++;
        for(int i=0;i<Integer.parseInt(part[1])-1;i++){
            re+=days[i];
        }
        re+=Integer.parseInt(part[2]);
        return re;
    }
}
