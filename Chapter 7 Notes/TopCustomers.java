import java.util.ArrayList;
/**
A supermarket wants to reward its best customer of each day, showing the customer’s name on a 
screen in the supermarket. For that purpose, the store keeps an ArrayList<Customer>. 
In the Store class, implement methods
    public void addSale(String customerName, double amount)
    public String nameOfBestCustomer()
to record the sale and return the name of the customer with the largest sale. Write a
program that prompts the cashier to enter all prices and names, adds them to a Store object, 
and displays the best customer’s name. Use a price of 0 as a sentinel.

Improve the program of Exercise P7.10 so that it displays the top customers, that is, the 
top N customers with the largest sales, where top N is a value that the user of the program 
supplies. Implement a method
    public ArrayList<String> nameOfBestCustomers(int topN)
If there were fewer than topN customers, include all of them.

 * @author (Muhammed) 
 * @version (12-9-16)
 */
public class TopCustomers
{
    private ArrayList<Customer> list = new ArrayList<Customer>();
    /**
     * Default constructor for objects of class TopCustomers
     */
    public TopCustomers()
    {
        
    }
    
    public void addSale(String customerName, double amount)
    {
        list.add(Customer(customerName,amount));
    }

    public String nameOfBestCustomer()
    {
        
    }
}
