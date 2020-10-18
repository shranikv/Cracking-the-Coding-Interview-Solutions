package chapterTwo;

import java.util.HashSet;

public class RemoveDups {

    private Node head;

    public RemoveDups()
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

    public void removeDups(Node head)
    {
        HashSet<Integer> nodeData = new HashSet<>();
        Node temp = head;
        Node previous = null;
        while(temp != null)
        {
            if(nodeData.contains(temp.data))
            {
                previous.next = temp.next;
            }
            else
            {
                nodeData.add(temp.data);
                previous = temp;
            }
            temp = temp.next;
        }
    }

    public void removeDupsWithoutBuffer(Node head)
    {
        Node temp = head;
        Node runner = null;
        Node previous = null;
        while(temp != null)
        {
            runner = temp.next;
            previous = temp;
            while(runner != null)
            {
                if(runner.data == temp.data)
                {
                    previous.next = runner.next;
                }
                previous = runner;
                runner = runner.next;
            }
            temp = temp.next;
        }
    }

    public static void main(String[] args)
    {
        RemoveDups rd = new RemoveDups();
        rd.insertNode(1);
        rd.insertNode(2);
        rd.insertNode(3);
        rd.insertNode(2);
        rd.insertNode(5);
        rd.insertNode(6);
        rd.insertNode(3);
        rd.insertNode(7);
        rd.insertNode(6);
        rd.removeDups(rd.head);
        rd.display(rd.head);
        rd.removeDupsWithoutBuffer(rd.head);
        rd.display(rd.head);
    }
}