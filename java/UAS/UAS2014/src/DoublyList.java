/**
 *
 * @author kaqfa
 */
public class DoublyList {
    
   private ElmList first;               
   private ElmList last;                

   public DoublyList()         // constructor
      {
      first = null;                  
      last = null;
      }

   public boolean isEmpty()          
      { return first==null; }

   public void insertFirst(long dd) 
      {
      ElmList newLink = new ElmList();  

      if( isEmpty() )             
         last = newLink;          
      else
         first.prev = newLink;  
      newLink.next = first;         
      first = newLink;             
      }

   public void insertLast(long dd)  
      {
      ElmList newLink = new ElmList();
      if( isEmpty() )            
         first = newLink;        
      else
         {
         last.next = newLink;    
         newLink.prev = last;  
         }
      last = newLink;             
      }

   public ElmList deleteFirst()     
      {                             
      ElmList temp = first;
      if(first.next == null)      
         last = null;               
      else
         first.next.prev = null; 
      first = first.next;      
      return temp;
      }

   public ElmList deleteLast()     
      {                             
      ElmList temp = last;
      if(first.next == null)       
         first = null;            
      else
         last.prev.next = null; 
      last = last.prev;         
      return temp;
      }

                             
   public boolean insertAfter(long key, long dd)
      {                              
      ElmList current = first;        
      while(current.jam != key)   
         {
         current = current.next;   
         if(current == null)
            return false;            
         }
      ElmList newLink = new ElmList();  

      if(current==last)             
         {
         newLink.next = null;        
         last = newLink;             
         }
      else                          
         {
         newLink.next = current.next; 
                                      
         current.next.prev = newLink;
         }
      newLink.prev = current;    
      current.next = newLink;     
      return true;                  
      }

   public ElmList deleteKey(long key)  
      {                             
      ElmList current = first;       
      while(current.jam != key)   
         {
         current = current.next;  
         if(current == null)
            return null;             
         }
      if(current==first)            
         first = current.next;     
      else                           
                                     
         current.prev.next = current.next;

      if(current==last)              
         last = current.prev;    
      else                          
                                   
         current.next.prev = current.prev;
      return current;               
      }

   public void displayForward()
      {
      System.out.print("List (first-->last): ");
      ElmList current = first;          
      while(current != null)         
         {
//         current.displayLink();      
         current = current.next;     
         }
      System.out.println("");
      }

   public void displayBackward()
      {
      System.out.print("List (last-->first): ");
      ElmList current = last;          
      while(current != null)         
         {
//         current.displayLink();     
         current = current.prev; 
         }
      System.out.println("");
      }
}
