import java.util.*;

class Solution {

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.removeOuterParentheses("(()())(())(()(()))"));
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


    //A037
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(selfDividing(i)) list.add(i);
        }
        return list;
    }
    boolean selfDividing(int num){
        int div=10;
        int digit;
        while(true){
            digit=num%div/(div/10);
            if(digit==0) return false;
            if(num%digit!=0) return false;
            div*=10;
            if(div>num*10) break;
        }
        return true;
    }


    //A038
    public int mySqrt(int x) {
        if(x==0) return 0;
        long root=x;
        while(true){
            if(root>x/root) root/=2;
            else{
                while(x/root>root) root++;
                break;
            }
        }
        while(root*root>x) root--;
        return (int)root;
    }


    //A039
    public boolean isPerfectSquare(int x) {
        if(x==0) return false;
        int root=x;
        while(true){
            if(root>x/root) root/=2;
            else{
                while(x/root>root) root++;
                break;
            }
        }
        while(root*root>x) root--;
        if(root*root==x) return true;
        else return false;
    }


    //A040
    public boolean halvesAreAlike(String s) {
        String a=s.substring(0,s.length()/2).toLowerCase();
        String b=s.substring(s.length()/2).toLowerCase();
        int ac=0;
        int bc=0;
        String[] list={"a","e","i","o","u"};
        for(String vowel:list){
            while(a.contains(vowel)){
                a=a.replaceFirst(vowel,"");
                ac++;
            }
            while(b.contains(vowel)){
                b=b.replaceFirst(vowel,"");
                bc++;
            }
        }
        return ac==bc;
    }



    //A042
    public boolean backspaceCompare(String s, String t) {
        for(int i=0;i<s.length();i++){
            if(i!=0 && s.charAt(i)=='#'){
                s=s.replace(s.substring(i-1,i+1),"");
                i-=2;
            }
            else if(i==0 && s.charAt(i)=='#'){
                s=s.replaceFirst("#","");
                i--;
            }
        }
        for(int i=0;i<t.length();i++){
            if(i!=0 && t.charAt(i)=='#'){
                t=t.replace(t.substring(i-1,i+1),"");
                i-=2;
            }
            else if(i==0 && t.charAt(i)=='#'){
                t=t.replaceFirst("#","");
                i--;
            }
        }
        return s.equals(t);
    }


    //A043
    public String longestCommonPrefix(String[] strs) {
        String first=strs[0];
        int i;
        int flag=0;
        for(i=0;i<first.length();i++){
            for(String str:strs){
                if(i<str.length() && str.charAt(i)==first.charAt(i)){
                    continue;
                }
                else{
                    flag=1;
                    break;
                }
            }
            if(flag==1) break;
        }
        return first.substring(0,i);
    }



    //A044
    public boolean checkRecord(String s) {
        int ac=0;
        int lc=0;
        for(int i=0;i<s.length();i++){
            if(i>0 && s.charAt(i-1)=='L' && s.charAt(i)!='L' && lc<3) lc=0;
            if(s.charAt(i)=='A')ac++;
            else if(s.charAt(i)=='L') lc++;
        }
        return ac<2&&lc<3;
    }


    //A055
    public String removeOuterParentheses(String s) {
        StringBuilder str=new StringBuilder(s);
        int flag=0;
        int count=0;
        for(int i=0;i<str.length();i++){
            if(flag==0){
                str.deleteCharAt(i);
                i--;
                flag=1;
            }
            else if(count<0){
                str.deleteCharAt(i-1);
                if(i==str.length()) break;
                i-=2;
                flag=0;
                count=0;
            }
            else{
                if(str.charAt(i)=='(') count++;
                else count--;
            }
        }
        str.deleteCharAt(str.length()-1);
        return str.toString();
    }
    
}