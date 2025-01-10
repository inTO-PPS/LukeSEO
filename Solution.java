import java.util.*;

class Solution {

    public static void main(String[] args) {
        Solution sol = new Solution();

    }

    //A001
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int gi=0;
        int count=0;
        for(int i:s){
            if(gi>=g.length)break;
            if(i>=g[gi]){
                count++;
                gi++;
            }
        }
        return count;
    }


    //A002
    public List<List<Integer>> generate(int numRows) {
        if(numRows==1){
            List<Integer> list=new ArrayList<>();
            list.add(1);
            List<List<Integer>> listlist=new ArrayList<>();
            listlist.add(list);
            return listlist;
        }
        else{
            List<List<Integer>> list=generate(numRows-1);
            List<Integer> part=new ArrayList<>();
            for(int i=1;i<=numRows;i++){
                if(i==1){
                    part.add(1);
                }
                else if(i==numRows){
                    part.add(1);
                }
                else{
                    part.add(list.get(list.size()-1).get(i-2)+list.get(list.size()-1).get(i-1));
                }
            }
            list.add(part);
            return list;
        }
    }


    //A003
    public int[] plusOne(int[] digits) {
        digits[digits.length-1]++;
        for(int i=digits.length-1;i>0;i--){
            if(digits[i]==10){
                digits[i]=0;
                digits[i-1]++;
            }
        }
        if(digits[0]==10){
            int[] newDigits=new int[digits.length+1];
            newDigits[0]=1;
            newDigits[1]=0;
            for(int i=1;i<digits.length;i++){
                newDigits[i+1]=digits[i];
            }
            return newDigits;
        }
        return digits;
    }


    //A012
    public int countPrimes(int n) {
        if(n==0||n==1) return 0;
        boolean[] list=new boolean[n+1];
        Arrays.fill(list,true);
        for(int i=2;i<Math.sqrt(n)+1;i++){
            if(list[i]){
                for(int j=i+i;j<n;j+=i){
                    list[j]=false;
                }
            }
        }
        int count=-3;
        for(boolean bool:list){
            if(bool) count++;
        }
        return count;
    }


    //A013
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int i;
        for(i=0;i<nums.length;i++){
            if(i<nums.length-2 && nums[i]==nums[i+1]) i++;
            else break;
        }
        return nums[i];
    }


    //A014
    public List<String> summaryRanges(int[] nums) {
        List<String> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            String str="";
            if(i<nums.length-1 && nums[i+1]==nums[i]+1){
                str+=nums[i]+"->";
                int j;
                for(j=i+1;j<nums.length;j++){
                    if(!(j<nums.length-1 && nums[j]+1==nums[j+1])) break;
                }
                str+=nums[j];
                list.add(str);
                i=j;
            }
            else if(i>0 && nums[i-1]==nums[i]){
                continue;
            }
            else{
                str+=nums[i];
                list.add(str);
            }
        }
        return list;
    }


    //A023
    public int addDigits(int num) {
        if(num<10) return num;
        int sum=0;
        long div=10;
        while(true){
            long digit=num%div/(div/10);
            sum+=digit;
            if(num/div<1) break;
            div*=10;
        }
        return addDigits(sum);
    }


    //A024
    public boolean lemonadeChange(int[] bills) {
        List<Integer> list=new ArrayList<>();

        for(int i:bills){
            switch(i){
                case 5:
                    list.add(5);
                    break;
                case 10:
                    if(list.contains(5)){
                        list.remove(Integer.valueOf(5));
                        list.add(10);
                    }
                    else return false;
                    break;
                case 20:
                    if(list.contains(5) && list.contains(10)){
                        list.remove(Integer.valueOf(5));
                        list.remove(Integer.valueOf(10));
                    }
                    else if(Collections.frequency(list,5)>=3){
                        for(int j=0;j<3;j++) list.remove(Integer.valueOf(5));
                    }
                    else return false;
                    break;
            }
        }
        return true;
    }


    //A025
    public boolean isPowerOfFour(int n) {
        int div=0;
        while(true){
            if(Math.pow(4,div)==n) return true;
            div++;
            if(Math.pow(4,div)>n) break;
        }
        return false;
    }


    //
}