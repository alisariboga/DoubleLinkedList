public class App {
    public static void main(String[] args) {
        OurLinkedList<String> linkedList = new OurLinkedList<>();
        linkedList.add("Ali");
        linkedList.add("Can");
        linkedList.add("Sifa");
        linkedList.display();
        System.out.println("===========");
        linkedList.delete();
        System.out.println("Linked List Deleted...");
        System.out.println("===========");
        linkedList.display();
        System.out.println("===========");
        linkedList.delete();
        System.out.println("Linked List Deleted...");
        System.out.println("===========");
        linkedList.display();
    }
}
