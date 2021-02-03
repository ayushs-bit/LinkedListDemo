import java.util.Scanner;

class Nodee
{
    int data;
    Nodee previous;
    Nodee next;
}

public class DoublyLinkedList 
{
    Nodee START;
    DoublyLinkedList()
    {
        START = null;
    }
    
    void addnode()
    {
        System.out.println("Enter data");
        Scanner sc2 = new Scanner(System.in);
        int item = sc2.nextInt();
        
        Nodee newnode = new Nodee();
        newnode.data = item;
        newnode.previous = null;
        newnode.next = null;
        
        if(START == null)
        {
            START = newnode;
        }
        else
        {
            Nodee current = START;
            while(current.next != null)
            {
                current = current.next;
            }
            current.next = newnode;
            newnode.previous = current;
        }
        System.out.println("...data inserted...");
    }
    
    void deletenodebegin()
    {
          if(START == null)
        {
            System.out.println("list is empty");
        }
        else
        {
            System.out.println("deleted element : "+START.data);
            START = START.next;
            START.previous = null;
        }
    }
    
    void deletenodelast()
    {
        if(START == null)
        {
            System.out.println("Double list empty");
        }
        else
        {
            Nodee current =START ;
            Nodee Secondlast = null;
            while(current.next != null)
            {
                Secondlast = current;
                current = current.next;
            }
            System.out.println("Deleted Element :"+ current.data);
            Secondlast.next=null;
        }
    }
    
    void traversenode()
    {
        if(START == null)
        {
            System.out.println("Doubly list empty");
        }
        else
        {
               //forward
            
            System.out.println("\n.........forward.......");
            Nodee current;
            for(current = START;current.next != null;current=current.next)
            {
                System.out.print(" "+current.data);
            }
            System.out.println(" "+current.data);
            
            //reverse
            
            System.out.println("\n.........Reverse.........");
            Nodee current1;
            for(current1 = current;current1 != null;current1 = current1.previous)
            {
                System.out.print(" "+current1.data);
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
            
            Nodee current;
            int count =0;
            for(current = START;current != null;current = current.next)
            {
                if(current.data == sea)
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
        DoublyLinkedList obj = new DoublyLinkedList();
        while(true)
        {
            System.out.println("\npress 1 for insert");
            System.out.println("press 2 for delete from begin");
            System.out.println("press 3 for delete from last");
            System.out.println("press 4 for traverse");
            System.out.println("press 5 for search");
            System.out.println("press 6 for exit");
            
            System.out.println("enter your choice");
            Scanner sc = new Scanner(System.in);
            int ch = sc.nextInt();
            
            if(ch == 1)
            {
                obj.addnode();
            }
            else if(ch == 2)
            {
                obj.deletenodebegin();
            }
            else if(ch == 3)
            {
                obj.deletenodelast();
            }
            else if (ch == 4)
            {
                obj.traversenode();
            }
            else if(ch == 5)
            {
                obj.searchnode();
            }
            else if( ch == 6)
            {
                System.exit(0);
            }
            else
            {
                System.out.println("...Wrong choice...");
            }
        }
    }
}
