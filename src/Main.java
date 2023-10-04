public class Main {
    public static void main(String[] args) {

        String s = "A"; // Imutabil, creaza adrese noi in for

        StringBuilder stringBuilder = new StringBuilder("A"); // Mutabil, nu creaze adrese noi

//        for (int i = 0; i <= 3; i++) {
//            stringBuilder.append(i);  // 33
//
//           System.out.println(stringBuilder);
//        }

        String b = "B";

//        for (int i = 0; i < 20; i++) {
//            System.out.println(i); // 0
//        }

        // i < 3:
        // 0 < 3 ? true -> executare
        // i++
        // 1 < 3 ? true -> executare
        // i++
        // 2 < 3 ? true -> executare
        // i++
        // 3 < 3 ? false - ne oprim


        // 0 <= 3 ? true -> executare
        // i++
        // 1 <= 3 ? true -> executare
        // i++
        // 2 <= 3 ? true -> executare
        // i++
        // 3 <= 3 ? true - executare
        // i++
        // 4 <= 3 ? false - ne oprim


//        int count = 20;
//
//        System.out.println("Counter: " + count--);
//        System.out.println("Counter: " + count--);
//        System.out.println("Counter: " + count--);
//        System.out.println("Counter: " + count--);
//        System.out.println("Counter: " + count--);
//        System.out.println("Counter: " + count--);
//        System.out.println("Counter: " + count--);
//        System.out.println("Counter: " + count--);
//
//
//        for (int i = 0; i < 20; i++) {
//            System.out.println(i);
//        }
//
//        for(int i = 20; i >= 0; i--) {
//            System.out.println(i);
//        }


//        for (int i = 0; i < 10; i++) {
//
//            for (int j = 0; j < i; j++) {
//                System.out.print(j);
//            }
//
//            System.out.println();
//
//        }

//        for (int i = 0; i < 20; i++) {
//            System.out.println("Rulez !" + c);
//            // conditie cand sa oprim fortat
//
//            break;
//
//        }
//
//        int c = 0;
//
//        while (c < 5) {
//            System.out.println("Rulez !" + c);
//            c++;
//        }
//
//        c = 0;
//
//        do {
//            System.out.println("Rulez !" + c);
//            c++;
//        } while (c < 5);


//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//
//
//            if( i == 0) {
//                continue;
//            }
//
//            System.out.println("Ruleaza");
//        }


        Automobil automobil = new Automobil(1570);

        System.out.println(automobil.getAnProducere());

        for (int i = 0; i < 10; i++) {

            System.out.print("");
            System.out.println();

            boolean df = (5 % 5) == 0;
        }

        System.out.println("sadasd");
    }
}