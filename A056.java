
public class A056 {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] list=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j] && j<nums2.length-1){
                    int flag=0;
                    for(int k=j+1;k<nums2.length;k++){
                        if(nums2[k]>nums2[j]){
                            list[i]=nums2[k];
                            flag=1;
                            break;
                        }
                    }
                    if(flag==0) list[i]=-1;
                    else break;
                }
                else list[i]=-1;
            }
        }
        return list;
    }
}
