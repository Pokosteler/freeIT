public class lesson_2_homework_7 {
    public static void main(String[] args) {
        int count = 30;
        if ((count % 10 > 4 && count % 10 < 10) || (count % 100 > 10 && count % 100 < 15) || count % 10 == 0) {
            System.out.println(count + " программистов");
        } else {
            if (count % 10 == 1 && count % 100 != 11) {
                System.out.println(count + " программист");
            }
            if ((count % 10 == 2 && count % 100 != 12) || (count % 10 == 3 && count % 100 != 13) || (count % 10 == 4 && count % 100 != 14)) {
                System.out.println(count + " программиста");
            }
        }
    }
}