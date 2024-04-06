public class LinkedList {
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
        Node(int data,Node next){
            this.data=data;
            this.next=next;
        }
    }
    public Node head=null;
    public Node tail=null;
    public void addNode(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        }
        else{
            tail.next=newNode;
            tail=newNode;
        }
    }
    public void display(){
        Node current=head;
        if(head==null){
            System.out.println("List is empty");
        }
        else{
            System.out.println("Nodes of singly linked list: ");
            while(current!=null){
                System.out.print(current.data+" ");
                current=current.next;
            }
            System.out.println("\n");
        }
    }
    public void deleteNode(int data){
        Node current=head;
        Node temp=null;
        while(current!=null){
            if(current.data==data){
                if(current==head){
                    head=head.next;
                    current=head;
                }
                else if(current==tail){
                    temp.next=null;
                    tail=temp;
                    current=null;
                }
                else{
                    temp.next=current.next;
                    current=current.next;
                }
            }
            else{
                temp=current;
                current=current.next;
            }
        }

    }
    public static void main(String[] args) {
        LinkedList l1=new LinkedList();
        l1.addNode(47);
        l1.addNode(23);
        l1.addNode(56);
        l1.addNode(78);
        l1.display();
        l1.deleteNode(23);
        l1.display();
    }

}
