public class strings {
    public static void main(String[] args) {
        String S1="Jeevan";
        System.out.println(S1.toUpperCase());
        System.out.println(S1.toLowerCase());
        System.out.println(S1.length());
        System.out.println(S1.isEmpty());
        System.out.println(S1.isBlank());
        System.out.println(S1.charAt(1));
        System.out.println(S1.indexOf('a'));
        System.out.println(S1.lastIndexOf('e'));

        String S2=S1.concat(" Mishra");
        System.out.println(S2);


        System.out.println("My Name Is Jee"+1);
        System.out.println("My favourite number is "+1+5);
        System.out.println("My favourite Number Is "+(1+5));
    }
}
