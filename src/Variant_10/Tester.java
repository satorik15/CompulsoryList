package Variant_10;

public class Tester
{
    public static void main(String[] args)
    {
        List list = new List();
        list.add(10);
        list.add(20);
        list.add(50);
        list.add(90);
        list.add(40);
        System.out.println("Unsorted list");
        list.print();
        System.out.println("Sorted list");
        list.sorting();
        list.print();

    }
}
