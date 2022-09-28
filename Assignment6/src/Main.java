import java.util.Arrays;

public class Main {

    final static int START = 10, END = 42;

    public static void main(String[] args) {

        for (int fangA = START; fangA < END; fangA++) {

            String sFangA = String.valueOf(fangA);
            boolean trailingZeros = sFangA.endsWith("0");
            int max = (int) Math.min(END, Math.pow(10, sFangA.length()));
            for (long fangB = fangA; fangB < max; fangB++) {

                long candidate = fangA * fangB;
                if (candidate % 9 == (fangA + fangB) % 9) {
//                    System.out.println(candidate + " : candidate");
//                    System.out.println(candidate % 9);
//                    System.out.println((fangA + fangB) % 9);
//                    System.out.println("Fang1 :  " + fangA + " fangB : " + fangB);

                    String sCandidate = String.valueOf(candidate);
                    String sFangB = String.valueOf(fangB);
//                    System.out.println(sCandidate + " scandidate" + "  fangB : " + fangB)  ;
                    if ((trailingZeros && sFangB.endsWith("0")) == false) {

                        char[] cVampire = sCandidate.toCharArray();
                        Arrays.sort(cVampire);
                        char[] cFangs = (sFangA + sFangB).toCharArray();
                        Arrays.sort(cFangs);

                        if (Arrays.equals(cVampire, cFangs)) {
                            System.out.println(sFangA + " * " + sFangB + " = " + sCandidate);
                        }
                    }
                }
            }
        }
    }
}

