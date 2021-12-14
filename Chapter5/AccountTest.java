import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.*;
import java.util.*;
public class AccountTest
{
    public static void main()
    {
        Account a1 = new Account("Kevin", 2345, 100000);
        Account a2 = new Account("Izzy", 1111, 100000);
        Account a3 = new Account("Thomas", 5545, 100000);
        Account a4 = new Account("Charlie", 2045, 100000);
        Account a5 = new Account("Emy", 378, 100000);
        
        System.out.println(a1.compareTo(a3));
        System.out.println(a4.compareTo(a5));
        
        Account [] accounts = {a1, a2, a3, a4, a5};
        
        Sorts.insertionSort(accounts);
        
        for(Account s: accounts)
        {
            System.out.println(s);
        }
    }
}
