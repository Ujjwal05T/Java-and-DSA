package strings;

public class StringBuilderEx {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i <26 ; i++) {
            char a = (char) ('a' +i);
            builder.append(a);
        }
        System.out.println(builder);
        //here builder updates the original object
        //this is not immutable
        builder.reverse();
        System.out.println(builder);
    }
}
