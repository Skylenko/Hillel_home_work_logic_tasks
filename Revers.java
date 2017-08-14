public class Revers {
    public static void main(String[] args) {
        System.out.println(reverse("12345678"));
    }

    public static String reverse(String first) {
        String rightPart;
        String leftPart;
        int length = first.length();
        if (length <= 1) {
            return first;
        }
        leftPart = first.substring(0, length / 2);
        rightPart = first.substring(length / 2, length);
        return reverse(rightPart) + reverse(leftPart);
    }
}
