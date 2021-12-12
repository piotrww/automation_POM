package samouczekProgramisty;

public class Temperature {
    private static boolean isSummer;

    public static void tellIfIsSummer(int temperature) {

        if (temperature > 20) {
            System.out.println("summer");
            isSummer = true;

        } else {
            System.out.println("no summer");
            isSummer = false;
        }

        System.out.println(isSummer);
    }
}
