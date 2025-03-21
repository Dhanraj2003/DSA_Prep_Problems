package collection.framework.java;

import java.util.ArrayList;

public class ArrayListImpl<E>{

    private ArrayList<E> arrayList;   //declare arraylist to store elements of type E

    private ArrayList<E> newArrayList;


    //declare or create constructor with initial capacity
    public ArrayListImpl(int initialCapacity)
    {
        newArrayList=new ArrayList<E>(initialCapacity);
    }

    //objects are added into new arrayList
    public void addItemIntoNewArrayList(E ele)
    {
        newArrayList.add(ele);
    }

    //print new ArrayList
    public void printNewArrayList()
    {
        for(E ob:newArrayList)
        {
            System.out.println(ob);
        }
    }

    //insert specified element at specified position in list
    public void insertAtSpecifiedIndex(int index,E element)
    {
        newArrayList.add(index,element);
    }

    //Removes all of the elements from this list.
    public void clear()
    {
        newArrayList.clear();
    }







    //constructor to initialize the arrayList
    public ArrayListImpl()   //default constructor with initial capacity of 10
    {
        arrayList=new ArrayList<>();   //Initialize the arrayList
    }


    //add method
    public void add(E element)  //method to add element at a specific index
    {
        arrayList.add(element);

    }

    //get
    public E get(int index)  //method to get element at specified index
    {
        return arrayList.get(index);
    }

    //method to return size of arraylist
    public int getSize()
    {
        return arrayList.size();
    }

    //method to print the arraylist
    public void printArrayList()
    {
        for(E obj:arrayList)
        {
            System.out.println(obj);
        }
    }

    //method to check element is present or not
    public boolean isPresent(E object)
    {
        return arrayList.contains(object);
    }


    //Constructs a list containing the elements of the specified collection, in
    //     * the order they are returned by the collection's iterator.




    public static void main(String[] args) {

        //create new arraylist
        ArrayList lists=new ArrayList();
        lists.add(10);
        lists.add(20);
        lists.add(30);
        lists.add(40);
        lists.add(50);



        ArrayListImpl<Integer> listItem=new ArrayListImpl<>();

        listItem.add(100);  //call method for adding element
        listItem.add(200);
        listItem.add(300);
        listItem.add(400);
        listItem.add(500);

        listItem.printArrayList();

        boolean result=listItem.isPresent(100);

        System.out.println("Element is present: "+result);


        int arrayListSize=listItem.getSize();
        System.out.println("size of arraylist is: "+arrayListSize);

        Integer i = listItem.get(2);
        System.out.println("element which is present at 2 is: "+i);


        //New Constructor with initial capacity

        ArrayListImpl<Integer> item=new ArrayListImpl<>(3);

        item.addItemIntoNewArrayList(1001);
        item.addItemIntoNewArrayList(1002);
        item.addItemIntoNewArrayList(1003);

        item.printNewArrayList();

        //insert at specified position in new arraylist
        item.insertAtSpecifiedIndex(3,1004);

        item.printNewArrayList();

    }

}
