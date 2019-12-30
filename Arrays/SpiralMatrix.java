class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        if(matrix.length == 0 || matrix[0].length == 0){
            return new ArrayList<>();
        }
        
        List<Integer> spiralPrint = new ArrayList<>();
        int direction = 0;
        int topRow = 0;
        int rightCol = (matrix[0].length-1);
        int bottomRow = matrix.length-1;
        int leftCol = 0;
        
        while(topRow <= bottomRow && leftCol <= rightCol){
            if(direction == 0){
                for(int i=leftCol;i<=rightCol;i++){
                    spiralPrint.add(matrix[topRow][i]);
                }
                topRow++;
            }
            
            if(direction == 1){
                for(int i=topRow; i<=bottomRow;i++){
                    spiralPrint.add(matrix[i][rightCol]);
                }
                rightCol--;
            }
            
            if(direction == 2){
                for(int i=rightCol;i>=leftCol;i--){
                    spiralPrint.add(matrix[bottomRow][i]);
                }
                bottomRow--;
            }
            
            if(direction == 3){
                for(int i=bottomRow;i>=topRow;i--){
                    spiralPrint.add(matrix[i][leftCol]);
                }
                
                leftCol++;
            }
            
            direction = (direction+1)%4;
        }
        
        return spiralPrint;
    }
}
