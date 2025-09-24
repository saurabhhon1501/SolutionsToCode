import java.util.PriorityQueue ;

class Test{
    public static void main(String[] args) {
        PriorityQueue <Integer> gg= new  PriorityQueue<>() ;
    
        
        gg.add(2);
        gg.add(4) ;
        gg.add(5);
        gg.add(1) ;
        
        System.out.println("The list is as follow : "+gg) ;
        
         System.out.println("The list is as follow: "+gg.peek()) ;

  System.out.println("The list is as follow :  "+gg.poll()) ;//Remove   1st element
  
     System.out.println("The list is as follow: "+gg) ;
    }
}