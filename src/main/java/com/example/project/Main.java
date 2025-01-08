package com.example.project;

public class Main {
    public static void main(String[] args) {
        // Fibonacci f = new Fibonacci(9);
        // for (int num : f.getSequence()) {
        //     System.out.print(num + " ");
        // }
        // System.out.println(f.fibonacciString());
        // System.out.println();
        // System.out.println(f.getIndexOf(1));
        // System.out.println(f.getIndexOf(233));
        // System.out.println(f.getIndexOf(5));
        // System.out.println(f.getIndexOf(8));
        // System.out.println(f.getIndexOf(55));
        // System.out.println(f.getIndexOf(7));
        // f.extendBy(4);
        // System.out.println(f.fibonacciString());
        // System.out.println(f.getIndexOf(1));
        // System.out.println(f.getIndexOf(233));
        // System.out.println(f.getIndexOf(5));
        // System.out.println(f.getIndexOf(8));
        // System.out.println(f.getIndexOf(55));
        // System.out.println(f.getIndexOf(7));


        // Fibonacci fib3 = new Fibonacci(5);
        // System.out.println(fib3.fibonacciString());


        // int[] seq3 = fib3.getSequence();
        // seq3[0] = 100;


        // System.out.println(fib3.fibonacciString());


   
        // Fibonacci[] fibonaccis = {new Fibonacci(5), new Fibonacci(11), new Fibonacci(20)};
        // for (Fibonacci fib : fibonaccis) {
        //     System.out.println(fib.getSequence().length);
        // }


        // // POINT TEST
        // Point p1 = new Point(10, 20);
        // Point p2 = new Point(20, 30);
        // Point p3 = new Point (-1, 42);
        // System.out.println(p1.pointInfo());
        // System.out.println(p2.pointInfo());
        // System.out.println(p3.pointInfo());
        // System.out.println(p1.distanceTo(p2));
        // System.out.println(p2.distanceTo(p3));
        // System.out.println(p3.distanceTo(p1));
        // System.out.println(p1.distanceTo(p2) + p2.distanceTo(p3) + p3.distanceTo(p1));


        // // TRIANGLE TEST
        // Triangle t1 = new Triangle(p1, p2, p3);
        // System.out.println(t1.perimeter());
        // System.out.println(t1.triangleInfo());


        // // COLLECTION TEST
        // TriangleCollection tCo = new TriangleCollection(6, 4, 7);
        // System.out.println(tCo.triangleCollectionInfo());
        // System.out.println(tCo.totalPerimeter());
        // tCo.shiftTriangles(2);
        // System.out.println(tCo.triangleCollectionInfo());

        // Horse h1 = new Horse("Trigger", 2303);
        // Horse h2 = new Horse("Silver", 3211);
        // Horse h3 = new Horse("Penny", 3211);
        // // Horse[] stalls = {h1, h2};
        // // HorseBarn barn1 = new HorseBarn(3);
        // // barn1.placeHorse(h1, 0);
        // // barn1.placeHorse(h2, 1);
        // // System.out.println(barn1.findHorseStall("Lucy"));
        // // System.out.println(barn1.findHorseStall("Trigger"));
        // // System.out.println(barn1.findHorseStall("Silver"));
        // HorseBarn barn2 = new HorseBarn(5);
        // barn2.placeHorse(h1, 0);
        // barn2.placeHorse(h2, 3);
        // barn2.placeHorse(h3, 4);
        // Horse[] barnStalls = barn2.getStalls();
        // for (Horse horse : barnStalls) {
        //     if (horse != null) {
        //         System.out.println(horse.getName());
        //     } else {
        //         System.out.println("null");
        //     }
        // }
        // barn2.consolidate();
        // // barnStalls = barn2.getStalls();
        // for (Horse horse : barnStalls) {
        //     if (horse != null) {
        //         System.out.println(horse.getName());
        //     } else {
        //         System.out.println("null");
        //     }
        // }

        TriangleCollection collection1 = new TriangleCollection(6,4,7);
        System.out.println(collection1.triangleCollectionInfo());
        collection1.shiftTriangles(5);
        System.out.println(collection1.triangleCollectionInfo());

    }
}
