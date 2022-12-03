package day10stringmanipulations;

public class StringManipulations01 {

    public static void main(String[] args) {

        String a = "Java kolaydir";

        boolean b = a.startsWith("va",2);
        System.out.println(true);

        String c = a.replaceFirst("a","*");
        System.out.println(c);

        String d = c.concat(" anladin mi");
        System.out.println(d);

        String e = "    Tom Hanks    ";
        String f = e.trim();
        System.out.println(e);
        System.out.println(f);

        String h = "Java";
        String i = "kava";

        System.out.println(h.compareTo(i));

        String n = a.repeat(1);
        System.out.println(n);

    }
}
