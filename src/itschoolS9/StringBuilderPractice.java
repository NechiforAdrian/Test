package itschoolS9;

public class StringBuilderPractice {

    public static void main(String[] args) {
        //string builder is a class can be moved StringBuilder sb  Api = Application Programming Interface
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Test");
        stringBuilder.append(" second part");
        stringBuilder.deleteCharAt(0);

        System.out.println("Delete character at index 0 in this stringBuilder:" + stringBuilder);


        String country = "Romania";
        StringBuilder reverseSb = new StringBuilder();
        reverseSb.append(country);
        reverseSb.reverse();

        System.out.println("Reverse some string using reverse() :" + reverseSb);

        String stringName = "";
        StringBuilder sbName = new StringBuilder();
        for(int index = 0; index < 5; index++) {
            stringName += "YourName";
            sbName.append("YourName");

        }
        System.out.println("Print sb whit for, for 5 times :" + stringName);//String: if we have some small application
        System.out.println("Print sb whit for append, for 5 times :" + sbName);//StringBuilder: this is for reduce require ram memory. Use on big application
    }
}
