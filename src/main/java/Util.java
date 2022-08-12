public class Util {

    private String StartString;

    Util(){
        String a = "abcdefghij";
        String b = a.substring(3);
        String c = a.substring(0,1);
       // String c2 = a.substring(1,);
        String d = c.toUpperCase();
        String charA = String.valueOf(a.toCharArray());
        char[] charaa =  a.toCharArray();
        System.out.println("--result...");
        //System.out.println(b);    // a.substring(3)       defghij
        //System.out.println(c);    // a.substring(0,1)     a
        //System.out.println(c2);      // a.toUpperCase()
        //System.out.println(d);      // a.toUpperCase()      A
        //System.out.println(charA);
        System.out.println(charaa[0]);

        //
        String value = "abcdefghij";
        char[] charString = value.toCharArray();
        String convBeforeUpperCase = String.valueOf(charString[0]).toUpperCase();
        //replace.
        System.out.println("1 " + convBeforeUpperCase); //A

        //맨앞 부분을 뺀, value.
        int longer = value.length();  //전체 길이.
        System.out.println("전체 길이, " + longer); //10.



        //substring의 사용. String형.substring(1,longer )
        System.out.println("substring, " + value.substring(1,longer));
        //뒤의 글자.
        String result2 = value.substring(1,longer);

        String result = convBeforeUpperCase + result2;
        System.out.println("결과값: " + result);
    }

    public static void main(String[] args) {

        new Util();
    }

    public String frontChangeCase(String v1) {
        StartString = v1;
        char[] charString = v1.toCharArray();
        String convBeforeUpperCase = String.valueOf(charString[0]).toUpperCase();

        int longer = v1.length();
        String backCase = v1.substring(1,longer);

        String result = convBeforeUpperCase + backCase;

        return result;
    }

    private class Char {
    }
}
