import java.util.Scanner;

class Node
{
    int rollno;
    Node next;
}

public class SinglyLinkedList 
{
    Node START;
    SinglyLinkedList()
    {
        START = null;
    }
    
    void addnode()
    {
        System.out.println("enter data");
        Scanner sc2 = new Scanner (System.in);
        int rn = sc2.nextInt();
        
        Node newnode = new Node();
        newnode.rollno =rn;
        newnode.next = null;
        
        
        if(START == null)
        {
            START = newnode;
        }
        else
        {
            Node current = START;
            while(current.next != null)
            {
                current = current.next;
            }
            current.next = newnode;
        }
       System.out.println("data inserted...");
    }
    
    void deletenodebegin()
    {
        if(START == null)
        {
            System.out.println("list is empty");
        }
        else
        {
            System.out.println("deleted : "+START.rollno);
            START = START.next;
        }
    }
    
    void deletenodelast()
    {
        if(START == null)
        {
            System.out.println("list is empty");
        }
        else
        {
            
        }
    }
    
    void traversenode()
    {
        if(START == null)
        {
            System.out.println("list is empty");
        }
        else
        {
            Node current;
            for(current = START;current != null;current = current.next)
            {
                System.out.print(" "+current.rollno);
            }
        }
    }
    
    void searchnode()
    {
        if(START ==null)
        {
            System.out.println("list empty");
            
        }
        else
        {
            System.out.println("enter searching element");
            Scanner sc3 = new Scanner(System.in);
            int sea = sc3.nextInt();
            
            Node current;
            int count =0;
            for(current = START;current != null;current = current.next)
            {
                if(current.rollno == sea)
                {
                    count++;
                    break;
                }
            }
            if(count > 0)
            {
                System.out.println("...Found...");
            }
            else
            {
                System.out.println("...Not Found...");
            }
        }
    }
    
    public static void main (String args[])
    {
        SinglyLinkedList obj = new SinglyLinkedList();
        while(true)
        {
            System.out.println("\npress 1 for insert");
            System.out.println("press 2 for delete");
            System.out.println("press 3 for delete");
            System.out.println("press 4 for traverse");
            System.out.println("press 5 for search");
            System.out.println("press 6 for exit");
            
            System.out.println("enter your choice");
            Scanner sc = new Scanner(System.in);
            int ch = sc.nextInt();
            
            switch(ch)
            {
                case 1:
                    obj.addnode();
                    break;
                case 3:
                    obj.deletenodelast();
                    break;
                case 2:
                    obj.deletenodebegin();
                    break;
                case 4:
                    obj.traversenode();
                    break;
                case 5:
                    obj.searchnode();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Wrong choice");
            }
            
            
        }
    }
    
}
