package Mock;
class Plane
{
    void fly()
    {
        System.out.println("It can take off");
    }
    void land()
    {
        System.out.println("It can land");
    }
}
class CargoPlane extends Plane
{
    @Override
    void fly()
    {
        System.out.println("It can fly in lower height");
    }
    @Override
    void land()
    {
        System.out.println("It can land verysoon");
    }
}
class PassengerPlane extends Plane
{
    @Override
    void fly()
    {
        System.out.println("It can fly in higher hight");
    }
    @Override
    void land()
    {
        System.out.println("It can land after oneday");
    }
}
class Airport
{
    void activity(Plane a)
    {
        a.fly();
        a.land();
    }
}
public class PolyLoading {
    public static void main(String[] args) {
        CargoPlane cp=new CargoPlane();
        PassengerPlane pp=new PassengerPlane();
        Airport ap=new Airport();
        ap.activity(cp);
        ap.activity(pp);
    }
}
