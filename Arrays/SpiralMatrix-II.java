class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
       
        int topRow = 0;
        int rightCol = n-1;
        int bottomRow = n-1;
        int leftCol = 0;
        int dir = 0;
        int N=1;
        
        while(topRow <= bottomRow && leftCol <= rightCol){
            if(dir == 0){
                for(int i=leftCol; i<=rightCol; i++){
                    matrix[topRow][i] = N;
                    N++;
                }
                topRow++;
            }   
            
            if(dir == 1){
                for(int i=topRow; i<= bottomRow; i++){
                    matrix[i][rightCol] = N;
                    N++;
                }
                rightCol--;
            }
            
            if(dir == 2){
                for(int i=rightCol; i>= leftCol; i--){
                    matrix[bottomRow][i] = N;
                    N++;
                }
                bottomRow--;
            }
            
            if(dir == 3){
                for(int i=bottomRow; i>= topRow;i--){
                    matrix[i][leftCol] = N;
                    N++;
                }
                
                leftCol++;
            }
            
            dir = (dir+1)%4;
        }
        
        return matrix;
    }
}
