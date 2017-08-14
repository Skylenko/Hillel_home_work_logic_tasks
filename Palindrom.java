public class Palindrom {
    public static void main(String[] args) {
        result();
    }

    public static String result() {
        String first = "123";
        String second = new StringBuilder(first).reverse().toString();
        if (second.equals(first)) {
            System.out.println("Palindrom");
        } else {
            System.out.println("Not palindrom");
        }
        return first;
    }
}
