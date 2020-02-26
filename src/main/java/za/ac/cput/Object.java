package za.ac.cput;

public class Object {
    String name = "John";
    int age = 42;
    public Object(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    public void testEquality()
    {
        System.out.print("Equals");
    }
    public void same()
    {
        System.out.print("Same");
    }
    public void notsame()
    {
        System.out.print("Not Same");
    }
    public void testFail()
    {
        System.out.print("This will fail");
    }
    public void timer()
    {
        System.out.print("This will fail because execution time exceeds timer");
    }
    public void junk()
    {
        System.out.print("I is junk");
    }

}
