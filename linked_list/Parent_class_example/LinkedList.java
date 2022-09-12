public class LinkedList {
    private LinkedListNode head;

    public LinkedList(String data) {
        this.head = new LinkedListNode(data);
    }

    public LinkedListNode search(String target) {     
        LinkedListNode current = head;
        
        while (current != null) {
            if (current.getData() != null && current.getData().equals(target)) {
                return current;
            } 
            current = current.getNext();
        }

        return null;
    }

    public static void main(String[] args) {
        LinkedList doesNotContainFish = new LinkedList("Dog");
        System.out.println("search fails: " + doesNotContainFish.search("Fish")); 

        LinkedList containsFish = new LinkedList("Fish");
        System.out.println("search succeeds: " + containsFish.search("Fish")); 
    }
}