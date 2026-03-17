package Mock;
class Plane
{
    void add()
    {
        System.out.println("This is from empty method");
    }
    
    void add(int a,int b)
    {
        System.out.println("This is from empty method");   
    }
}

public class PolyRiding {
    public static void main(String[] args) {
        int a=0,b=9;
        Plane p=new Plane();
        p.add();
        p.add(a,b);
    }
}
