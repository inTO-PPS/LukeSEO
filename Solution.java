import java.util.*;

class Solution {

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


    public int countPrimes(int n) {

        return 0;
    }
}