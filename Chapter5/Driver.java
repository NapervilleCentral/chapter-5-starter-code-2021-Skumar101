public class Driver
{
    public static void main()
    {
        Task obj1 = new Task();
        Task obj2 = new Task();
        Task obj3 = new Task();
        Task obj4 = new Task();
        Task obj5 = new Task();
        
        Task [] tasks = {obj1, obj2, obj3, obj4, obj5};
        Sorts.insertionSort(tasks);
        for(Task s: tasks)
        {
            System.out.println(s);
        }
    }
}
