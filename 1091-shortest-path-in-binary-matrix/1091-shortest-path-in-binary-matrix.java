class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        int[][] pos = new int[][]{{1,0},{1,1},{0,1},{-1,1},{-1,0},{-1,-1},{0,-1},{1,-1}};
        int [][] dist = new int[n][n];
        dist[n-1][n-1] = -2;
        Queue<int[]> queue = new LinkedList<>();     
        if(grid[0][0]==0){
            queue.offer(new int[]{0,0});
            grid[0][0] = 2;
            dist[0][0] = 0;
            while(!queue.isEmpty()){
                int[] currentLocation = queue.poll();
                int currentRow = currentLocation[0];
                int currentColumn = currentLocation[1];
                for(int k = 0; k < 8; k++){
                    int nextRow = currentRow + pos[k][0];
                    int nextColumn = currentColumn + pos[k][1];
                    if(0 <= nextRow && nextRow < n && 0 <= nextColumn && nextColumn < n && grid[nextRow][nextColumn] == 0){
                        queue.offer(new int[]{nextRow, nextColumn});
                        grid[nextRow][nextColumn] = 2;
                        dist[nextRow][nextColumn] = dist[currentRow][currentColumn] + 1;
                    }
                }
            }
        }
        return dist[n-1][n-1]+1;
    }
}