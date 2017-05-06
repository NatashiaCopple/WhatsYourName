
import javax.swing.JOptionPane;
public class WhatsYourName
{
   public static void main(String[] args) 
    {
         //E1.15
        String name = JOptionPane.showInputDialog ("What is your name?");
        System.out.println ("\"Hello " + name + "!\"" );
     }
}
