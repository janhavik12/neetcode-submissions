
class Solution {
    public boolean isValidSudoku(char[][] board) {

        HashSet<Character>[] row = new HashSet[9];
      HashSet<Character>[] col = new HashSet[9];
HashSet<Character>[] boxes = new HashSet[9];
        for (int x = 0; x < 9; x++) {
            row[x] = new HashSet<>();
            col[x] = new HashSet<>();
            boxes[x] = new HashSet<>();
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){

                char num=board[i][j];
                int b = (i / 3) * 3 + (j / 3);

                if(board[i][j]!='.'){

                    if(row[i].contains(num) || col[j].contains(num) || boxes[b].contains(num)){
                        return false;

                    }
                row[i].add(num);
                col[j].add(num);
                boxes[b].add(num);
                    
                }
          
                
               

            


            }
        }

              return true;
    }
}
