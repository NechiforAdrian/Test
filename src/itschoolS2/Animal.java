package itschoolS2;

public class Animal {
    //private -access modifier
    //java primitives always have a value (int,boolean, double, etc)
    //non-primitive types, if they don't have assigned a value, are null
    private String animalName;  // is null
    private String animalColour; //is null
    private String animalName2 = "Horse"; //animalName2 is Horse

    //public - access modifier
    //String - return data type
    //getAnimalName -method name, it can be anything
    //() - holds method's parameters
    //return -java keyword
    private String getAnimalName() {
        return animalName;
    }

    public int getAnimalAge() {                //Metod*
        int someNumber = 23;
        return someNumber;
        //or directly:   return 23;
        // ex: public String getAnimalName(){
        //     return "papagal";
        //}
    }

    public void setAnimalName() {
        animalName = "Veverita";
    }

    public void setAnimalColour() {
        animalColour = "red";
    }
}

//when we don't declare an access modifier, it is the default one
//we can do that: |class Dog extends Animal| it means class Dog is parent of Animal.
class Dog {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal animal2 = new Animal();
        Animal animal3 = new Animal();
        //ctrl+d = duplicate code line
        //ctrl -delete code line
        //ctrl + space  = see all the variables and methods inside of the object

    }
}