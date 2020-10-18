package chapterTwo;

public class DeleteMiddleNode {

    private Node head;

    public DeleteMiddleNode()
    {
        head = null;
    }

    public static class Node {
        Node next;
        int data;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    public void insertNode(int data)
    {
        if(head == null) {
            head = new Node(data);
            return;
        }
        Node temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = new Node(data);
    }

    public void display(Node head)
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public boolean deleteNode(Node anyNode)
    {
        if(anyNode == null || anyNode.next == null)
        {
            return false;
        }
        Node abc = anyNode.next;
        anyNode.data = abc.data;
        anyNode.next = abc.next;
        return true;
    }

    public static void main(String[] args)
    {
        DeleteMiddleNode dmn = new DeleteMiddleNode();
        dmn.insertNode(1);
        dmn.insertNode(7);
        dmn.insertNode(9);
        dmn.insertNode(3);
        dmn.insertNode(10);
        dmn.insertNode(6);
        Node deleteThis = dmn.head.next.next.next;
        System.out.println(dmn.deleteNode(deleteThis));
        dmn.display(dmn.head);
    }
}
