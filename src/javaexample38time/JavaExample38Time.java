
package javaexample38time;


public class JavaExample38Time {

    // this program will exit after 5 seconds
    
    public static void main(String[] args) {
       
        long begin =System.currentTimeMillis();
        
        System.out.println(begin);
        
        // this loop will break after 5 seconds
        while(System.currentTimeMillis()-begin<5000)
        {
            
        }
        
        System.out.println("after 5 seconds....");
    }// end main()
    
}
