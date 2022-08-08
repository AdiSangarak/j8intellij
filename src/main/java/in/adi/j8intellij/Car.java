package in.adi.j8intellij;

public class Car implements Vehicle,FourWheeler{

    public void print() {
        Vehicle.super.print();
        FourWheeler.super.print();
        Vehicle.blowHorn();
        System.out.println("I am a car!");
    }
}
