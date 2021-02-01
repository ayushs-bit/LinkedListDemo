import java.util.Scanner;

class Node
{
    int rollno;
    Node next;
}

public class SimplyLinkedList 
{
    Node START;
    SimplyLinkedList()
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
       System.out.println("data inserted...3");
    }
    
    void deletenode()
    {
        
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
                System.out.println(current.rollno);
            }
        }
    }
    
    void searchnode()
    {
        
    }
    
    public static void main (String args[])
    {
        SimplyLinkedList obj = new SimplyLinkedList();
        while(true)
        {
            System.out.println("press 1 for insert");
            System.out.println("press 2 for delete");
            System.out.println("press 3 for traverse");
            System.out.println("press 4 for search");
            System.out.println("press 5 for exit");
            
            System.out.println("enter your choice");
            Scanner sc = new Scanner(System.in);
            int ch = sc.nextInt();
            
            switch(ch)
            {
                case 1:
                    obj.addnode();
                    break;
                case 2:
                    obj.deletenode();
                    break;
                case 3:
                    obj.traversenode();
                    break;
                case 4:
                    obj.searchnode();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Wrong choice");
            }
            
            
        }
    }
    
}
