class BrowserHistory {
    // 자바의 LinkedList는 doubly linked list구조
    // 존재하는 객체를 사용하는 것이라 노드나 linked list를
    // 정의할 필요가 없다.
    private LinkedList<String> linkedList = new LinkedList<>();
    int index = 0;
    public BrowserHistory(String homepage) {
        linkedList.add(homepage);
    }
    
    public void visit(String url) {
        index++;
        linkedList.add(index, url);
        while(index < linkedList.size()-1){
            linkedList.removeLast();
        }
    }
    
    public String back(int steps) {
        if(index-steps < 0){
            index = 0;
            return linkedList.getFirst();
        }
        index -= steps;
        return linkedList.get(index);
    }
    
    public String forward(int steps) {
        if(index + steps >= linkedList.size()){
            index = linkedList.size() - 1;
            return linkedList.getLast();
        }
        index += steps;
        return linkedList.get(index);
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */