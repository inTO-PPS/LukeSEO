public class A087 {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        sort(boxTypes);
        int result=0;
        int index=0;
        for(int i=0;i<truckSize;i++){
            if(boxTypes[index][0]>0){
                boxTypes[index][0]--;
                result+=boxTypes[index][1];
            }
            else{
                if(index+1==boxTypes.length) break;
                boxTypes[++index][0]--;
                result+=boxTypes[index][1];
            }
        }
        return result;
    }

    void swap(int[] a, int[] b){
        int[] c={a[0],a[1]};
        a[0]=b[0];
        a[1]=b[1];
        b[0]=c[0];
        b[1]=c[1];
    }
    int compare(int[] a, int[] b){
        return a[1]-b[1];
    }
    void sort(int[][] a){
        for(int i=a.length-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(compare(a[j],a[j+1])<0) swap(a[j],a[j+1]);
            }
        }
    }
}
