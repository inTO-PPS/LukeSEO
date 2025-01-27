public class A096 {
    public int hammingWeight(int n) {
        String num=Integer.toBinaryString(n);
        int x=num.length() - num.replace("1","").length();
        return x;
    }
}
