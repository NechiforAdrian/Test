package itschoolS10;

public class StringBuilderPractice {

    public static void main(String[] args) {
        //string builder is a class can be moved StringBuilder sb  Api = Application Programming Interface
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("test");
        stringBuilder.append(" second part");
        stringBuilder.deleteCharAt(0);

        System.out.println(stringBuilder);


        String country = "Romania";
        StringBuilder reverseSb = new StringBuilder();
        reverseSb.append(country);
        reverseSb.reverse();

        System.out.println(reverseSb);

        String stringName = "";
        StringBuilder sbName = new StringBuilder();
        for(int index = 0; index < 5; index++) {
            stringName += "a";
            sbName.append("a");

        }
        System.out.println(stringName);//String: if we have some small application
        System.out.println(sbName);//StringBuilder: this is for reduce require ram memory. Use on big application
    }
}
