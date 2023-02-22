package itschoolS9;

public class JavaCoreApi {

    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        String x = "1";
        //int c = a + b;
        System.out.println(x + a);//13
        System.out.println(a + b);//4

        String name = "George";


        String name1 = "Marius";
        String name2 = "Marius";
        String name3 = new String ("Marius");
        System.out.println("name1 vs name2: " + (name1 == name2));//true
        System.out.println("name1 vs name3: " + (name1 == name3));//false

        //compare hashcode identity for the name1, name2 and name3 object
        System.out.println("name1 hashcode: " + Integer.toHexString(System.identityHashCode(name1)));
        System.out.println("name2 hashcode: " + Integer.toHexString(System.identityHashCode(name2)));
        System.out.println("name3 hashcode: " + Integer.toHexString(System.identityHashCode(name3)));

    }
}
