public class A102 {
    public int[][] transpose(int[][] matrix) {
        int[][] m=new int[matrix[0].length][matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                m[j][i]=matrix[i][j];
            }
        }
        return m;
    }
}
