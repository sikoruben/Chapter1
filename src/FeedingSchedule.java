
public class FeedingSchedule {
    int a;
    public static void main(String[] main) {
        int x = 5, j = 0;
        OUTER:
        for (int i = 0; i < 3; )
            INNER:do {
                i++;
                x++;
                if (x > 10) break INNER;
                x += 4;
                j++;
            } while (j <= 2);
        System.out.println(x);
    }
    //12 a valasz


}
