package singleton;

public class TripleMapMain {
    public static void main(String[] args) {
        TripleMap alpha = TripleMap.getInstance("ALPHA");
        System.out.println("alpha = " + alpha);
        TripleMap beta = TripleMap.getInstance("BETA");
        System.out.println("beta = " + beta);
        TripleMap gamma = TripleMap.getInstance("GAMMA");
        System.out.println("gamma = " + gamma);

        TripleMap alpha1 = TripleMap.getInstance("ALPHA");
        TripleMap beta1 = TripleMap.getInstance("BETA");
        TripleMap gamma1 = TripleMap.getInstance("GAMMA");


        if (alpha == alpha1) {
            System.out.println("alpha1 = " + alpha1);
        } else {
            System.out.println("TripleMapMain.main");
        }

        if (beta == beta1) {
            System.out.println("beta = " + beta);
        }else{
            System.out.println("TripleMapMain.main");
        }

        if (gamma == gamma1) {
            System.out.println("gamma = " + gamma);
        }else{
            System.out.println("TripleMapMain.main");
        }

    }
}
