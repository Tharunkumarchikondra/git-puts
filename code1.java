public class code1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        String s = "tharun kuamr";
        for (int i = s.length(); i > 0; i--) {
            System.out.println(s.charAt(i));
        }
        int[] a = { 1, 2, 3, 4, 5, 6 };
        for (int i = 0; i <= a.length; i++) {
            if (a[i] == 4) {
                System.out.println("Number is found");
            }
        }

    }
}
