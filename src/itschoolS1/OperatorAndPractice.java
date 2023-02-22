package itschoolS1;

public class OperatorAndPractice {
    public static void main(String[] args) {
        // Hello World
        System.out.println("Hello World");
        // My name is Adrian

        System.out.println("My name is Adrian");
        // And now is the first time when  type some code lines

        System.out.print("And now is the first time when i type some code lines");

        // ,before  start the JAVA course

        System.out.print(" ,before i start the JAVA course");
        // now we left a line free

        System.out.println();
        // The numbers

        // Integer Numbers Int
        System.out.println(200);

        // double Numbers
        System.out.println(15.15);

        // float numbers
        System.out.println(15.5f);

        // Numbers char it may be letter or symbols 'a' 'A' '!' '%'
        System.out.println('A');
        System.out.println('%');

        // Long numbers whit L at  finish
        System.out.println(2000000000L);

        // Boolean True or False

        System.out.println(true);

        System.out.println(false);

        System.out.println();


        int myNumberInteger = 100;
        System.out.println(myNumberInteger);

        double myNumberDouble = 22;
        System.out.println(myNumberDouble);

        float myFloatNumber = 22.1f;
        System.out.println(myFloatNumber);

        char myCharNumber = 'A';
        System.out.println(myCharNumber);

        long myLongNumber = 2000000000L;
        System.out.println(myLongNumber);

        boolean value = true;
        System.out.println(value);


        // Now type some variables

        String myName = "Adrian";

        System.out.print(myName);

        String anotherVariables = " ,i have 26 years ";

        System.out.print(anotherVariables);
        System.out.println();

        // But Variables can change like...
        anotherVariables = " Now i type same variables but i can change her print... ";
        System.out.println(anotherVariables);

        System.out.println();

        // And now we start whit Arithmetical Operators  +  -  *  /  % modulo

        // Addition
        System.out.println(22+1);

        // Subtraction
        System.out.println(22-1);

        // Multiplication
        System.out.println(22*2);

        // Division
        System.out.println(22/11);

        // Modulo % (rest of a division)
        System.out.println(22%21);


        // Rational Operators  (it used to compare)

        // == Equal
        System.out.println(10==10);

        // !Inequality
        System.out.println(10!=9);

        // < Smaller
        System.out.println(9<10);

        // > Bigger
        System.out.println(10>9);

        // >= Bigger or Equal
        System.out.println(10>=9);

        // <= Smaller or Equal
        System.out.println(9<=10);

        // Logical Operator

        // Logical operator && (and) It's named operator AND if both condition of  operators is true ex. A&&B
        System.out.println(10<11 && 11>10);

        // Logical operator || (or) It's named operator OR if condition is just one of them to be true   ex. A||B
        System.out.println(10<10 || 10>9);

        // Operator ! (negation) It's named operator !(no) Reverses the meaning of a condition Ex. !(A&&B)
        System.out.println(!true);

        // Assign Operators

        // Operator = Assign a value from right part for operator on left

        // Increase (gathering whit 1 or...) ex.A++
        int number = 22;
        number++;
        System.out.println(number);

        // Decrease (decrease whit 1 or...) ex.A--
        int number2 = 20;
        number2--;
        System.out.println(number2);

        //Operator += Gathering operator on the right and assign the result for operator on the left
        int number3 = 40;
        number3 = number3 + 60;
        System.out.println(number3);

        //Operator -= Decreased operator on the right and assign the result for operator on the left
        int number4 = 20;
        number4 = number4 - 10;
        System.out.println(number4);

        //Operator *= Multiplication operator on the right and assign the result for operator on the left
        int number5 = 10;
        number5 = number5 * 3;
        System.out.println(number5);

        //Operator /= Division operator on the right whit operator on the left and assign the result for operator on the left
        int number6 = 9;
        number6 = number6 / 3;
        System.out.println(number6);

        //Operator %= Calculated MODULO between the two operators and assign the result for operator on the left
        int number7 = 20;
        number7 = number7 % 3;
        System.out.println(number7);

        //exercise
        number7 = number4 + 80;
        System.out.println(number7+number4);

        int age = 20;
        age = age +10;
        System.out.println(age);

    }
}