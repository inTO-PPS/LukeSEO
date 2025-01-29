public class A117 {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int dis=0;
        int dis2=0;
        int a=start;
        while(a!=destination){
            dis+=distance[a];
            a++;
            if(a>distance.length-1) a=0;
        }
        a=destination;
        while(a!=start){
            dis2+=distance[a];
            a++;
            if(a>distance.length-1) a=0;
        }
        return Math.min(dis,dis2);
    }
}
