import java.util.Scanner;
public class Task implements Priority, Comparable
{
    private String task;
    double priority;
    
    public Task()
    {
        Scanner str = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your task");
        task = str.nextLine();
        System.out.println("Please enter the priority number");
        priority = in.nextInt();
    }
    public double getPriority()
    {
        return priority;
    }
    public void setPriority(double p)
    {
        priority = p;
    }
    public int compareTo(Object obje)
    {
        Task obj = (Task) obje;
        if(priority>obj.priority)
            return -1;
        if(priority<obj.priority)
            return 1;
        return 0;
    }
    public String toString()
    {
        String data = priority + " "+ task;
        return data;
    }
}
