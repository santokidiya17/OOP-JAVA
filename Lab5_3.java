import java.util.*;
public class Lab5_3
{
   public static void main(String[] args)
   {
      Scanner sc=new Scanner(System.in);
      while(true)
      {
         String s=sc.nextLine();
         if(s.equals("quit"))
         {
            break;
         }
         else
         {
            Count.countVowel(s);
         }
         
      }
      Count.display();
   }
}
class Count
{
   static int a=0;
   static int e=0;
   static int i=0;
   static int o=0;
   static int u=0;
 
   static void countVowel(String s)
   {
      // System.out.println(s);
      for(int j=0;j<s.length();j++)
      {
         char ch=s.charAt(j);
         // System.out.println(ch);
         if(ch=='a')
         {
            a++;
         }
         if(ch=='e')
         {
            e++;
         }
         if(ch=='i')
         {
            i++;
         }
         if(ch=='o')
         {
            o++;
         }
         if(ch=='u')
         {
            u++;
         }
      }
   }
   static void display()
   {
      System.out.println(a+" "+e+" "+i+" "+o+" "+u);
   }
}
