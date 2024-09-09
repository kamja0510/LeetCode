class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int numOfRoom = rooms.size();
        boolean[] visited = new boolean[numOfRoom];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);
        visited[0] = true;
        while(!queue.isEmpty()){
            int currentRoom = queue.poll();
            for(Integer nextRoom : rooms.get(currentRoom)){
                if(!visited[nextRoom]){
                    queue.offer(nextRoom);
                    visited[nextRoom] = true;
                }
            }
        }
        for(boolean isTrue: visited){
            if(!isTrue){return false;}    
        }
        return true;
    }
}