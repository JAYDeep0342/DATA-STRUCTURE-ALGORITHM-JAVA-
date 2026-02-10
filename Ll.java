public class Ll {
    Node head ;
    class Node {
        int data;
        Node next ;
        Node(int data){
            this.data = data;
           this. next = null;
        }


    }
    public void addfirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addlast(int data ){
        Node newNode =new Node(data);{
            if(head == null){
                head = newNode;
                return;
            }
         Node current_node = head;
         while (current_node.next!= null) {
            
            current_node = current_node.next;
        }
        current_node.next = newNode;
        
        }
    }
       public void display() {
        Node current_node = head;
        while (current_node!= null) {
            System.out.print(current_node.data + " -> ");
            current_node = current_node.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args){
        Ll list = new Ll();
        list.addfirst(2);
        list.addfirst(1);
        list.display();
        list.addlast(3);
        list.addlast(4);
        list.display();

    }
}
