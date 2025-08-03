package programs.basicsDemo;

public class BasicExamples {
    public void nestedForWithJumpExample() {
        iLoop:
        for (int i = 1; i <= 3; i++) {
            // Using Label for inner and for loop
            jLoop:
            for (int j = 1; j <= 3; j++) {
                if (j == 2) {
                    break jLoop;
                }
                System.out.println(i + " " + j);
                kLoop:
                for (int k = 1; k <= 3; k++) {
                    if (k == 3) {
                        break kLoop;
                    }
                    System.out.println(i + " " + j + " " + k);
                }
                if (i == 2) {
                    break iLoop;
                }
            }
        }
    }
}
