public class LinkedList {
    private String data;
    private LinkedList next;

    public LinkedList(String data) {
        this.data = data;
    }

    public LinkedList search(String target) {        
        if (data != null && data.equals(target)) {
            return this;
        } 

        if (next == null) return null;

        return next.search(target);
    }

    public static void main(String[] args) {
        LinkedList doesNotContainFish = new LinkedList("Dog");
        System.out.println("search fails: " + doesNotContainFish.search("Fish")); 

        LinkedList containsFish = new LinkedList("Fish");
        System.out.println("search succeeds: " + containsFish.search("Fish")); 
    }
}