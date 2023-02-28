public class Main {
    public static void main(String[] args) {
        int i = 1;
        float j = 2;
        double k = 3;

        byte b = 1;

        char c = 'c';

        boolean bool = true;

        long l = 3;

        String str = null;

        Integer integer = new Integer(5);
        Boolean boolEER = new Boolean(true);
        Float fl = new Float(3.5);
        Double d = new Double(3.5);


        fl.floatValue();
        boolEER.booleanValue();

        int intValue = integer.intValue();
        Integer integer2 = 5;
        Integer integer3 = Integer.valueOf(integer2);
        Integer integer4 = Integer.parseInt("7");
        integer4.intValue();

        Boolean bool2 = Boolean.TRUE;
        Boolean bool3 = Boolean.valueOf(false);
        Boolean bool4 = Boolean.parseBoolean("false");

        if (bool2) {
            System.out.println("true");
        } else if (bool3) {
            System.out.println("false");
        } else {
            // do nothing
        }

        int iiii = 0;
      /*  while (false) {
            System.out.println("Hello world!");
            iiii++;
        }*/
        System.out.println(iiii);

        do {
            iiii++;
            // do something
        } while (false);

        System.out.println(iiii);

        for (int forI = 0; forI < 100 || forI % 2 == 0; forI++) {

        }

        switch (Color.BLUE) {
            case RED -> System.out.println("0");
            case GREEN -> {
                System.out.println("1");
            }
            default ->  {
                System.out.println("2");
            }
        }

        int[] arr = new int[10];

        for (int arrI = 0; arrI < arr.length; arrI++) {
            System.out.println(arr[arrI]);
        }

        for (int arrI : arr) {
            System.out.println(arrI);
        }

        var arr2 = new int[10];
        //arr2[1] = "";

        var arr3 = new int[]{1, 2, 3, 4, 5};

        var integerClass1 = new Integer(5);

        var integerClass2 = Integer.valueOf(5);
        integerClass2 = null;

        var integer11 = 5;
        //integer11 = null;

        //var v = null;

        int[] arrrrr = {1, 2, 3, 4, 5};

        Test3 test3 = new Test3();
    }
}

enum Color {
    RED, GREEN, BLUE, YELLOW
}

class Test1 {

    public void calculateSum(int a, int b) {
        System.out.println(a + b);
    }
}

interface TestInterface {
    void calculateSum(int a, int b);
}

interface TestInterface2 {
    void calculateSum(int a, int b, int c);
}

class Test2 extends Test1 implements TestInterface, TestInterface2 {

    public void calculateSum(int a, int b) {
        System.out.println(a + b);
    }

    public void calculateSum(int a, int b, int c) {
        System.out.println(a + b + c);
    }
}

class Test {
    public void staticFunction(String[] args) {
        System.out.println("Hello world!");
    }
}

class Test3 {

    {
        i = 5;
        j = 6;
        k = 7;
    }

    int i = 0;
    int j = 1;
    int k = 2;

    Test3() {

    }

    Test3(int i, int j) {
        this.i = i;
        this.j = j;
    }

    Test3(int i, int j, int k) {
        this.i = i;
        this.j = j;
        this.k = k;
    }
}

class Testtt {


    double de = 5;
}

class Testteerr extends Testtt {

    double de = 6;

    public void test() {
        System.out.println(de);
        System.out.println(super.de);
    }
}