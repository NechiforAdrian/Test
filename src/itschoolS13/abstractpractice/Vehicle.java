package itschoolS13.abstractpractice;

public abstract class Vehicle {
    abstract void startEngine(); //The Abstraction we use for detail hiding
    void turnLightsOn(){    // (implementation hiding)  short:  For method!
                            //Loose coupling = achieve by interface  and means cause u can
                            //Change something in your code and your app is still working
    }
}
