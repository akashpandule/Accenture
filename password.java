import java.util.*;
class password{
   
    
      public static int checkPassword (String str, int n)
      {
        if (n < 4)
          return 0;
        if (str.charAt (0) >= '0' && str.charAt (0) <= '9')
          return 0;
          
       int num = 0;
        for (int i = 0; i < str.length(); i++)
          {
        if (str.charAt (i) == ' ' || str.charAt (i) == '/')
          return 0;
        if (str.charAt (i) >= 'A' && str.charAt (i) <= 'Z')
          return 1;
        if (str.charAt (i) >= '0' && str.charAt (i) <= '9')
          return 1;
          }
        return num;
        
      }
      public static void main (String[]args)
      {
        Scanner sc = new Scanner (System.in);
        String str = sc.next ();
        
        System.out.println (checkPassword (str, str.length()));
      }
        }
        

