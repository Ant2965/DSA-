/*Given an m x n grid of characters board and a string word, return true if word exists in the grid.

The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.

 

Example 1:


Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
Output: true */



class Solution {
    public boolean exist(char[][] board, String word) {
        int n = board[].length();
        int m = board[0].length();


        for(int i =0; i<n;i++){
            for(int j =0;j<m;j++)[
                if(board[i][j]==word.charAt(0)){
                    Search();
                }

            ]
        }

        

        
    }
}