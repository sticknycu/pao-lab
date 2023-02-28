package package2;

public class PackageTest2 {
}

class FormaGeometrica {

    private String nume;

    private Double raza;

    private Double latura;

    public FormaGeometrica() {

    }

    public FormaGeometrica(String nume, Double raza, Double latura) {
        this.nume = nume;
        this.raza = raza;
        this.latura = latura;

    }
}

interface InterfataTest {

    void adress();

    String mail = "mail@mail.com";

    void calculateSum(int a, int b, int c, int d);

    default int calculateSum(int a, int b) {
        return a + b;
    }

    private int calculateSum(int a, int b, int c) {
        return a + b + c;
    }
}

abstract class AbstractTest {

    AbstractTest() {

    }

    public abstract void calculateSum(int a, int b, int c, int d);

    public void calculateSum(int a, int b) {
        System.out.println(a + b);
    }
}

class AbstractClassImplementation extends AbstractTest {

        @Override
        public void calculateSum(int a, int b, int c, int d) {
            System.out.println(a + b + c + d);
        }
}

class Cerc extends FormaGeometrica implements InterfataTest {

    public Cerc() {
        super("", 3d, 5d);
    }

    public Cerc(String nume, Double raza) {
        super();
    }

    @Override
    public void calculateSum(int a, int b, int c, int d) {
        System.out.println(a + b + c + d);
    }

    public void showSum(int a, int b) {
        InterfataTest interfataTest = new InterfataTest() {
            @Override
            public void calculateSum(int a, int b, int c, int d) {
                System.out.println(a + b + c + d);
            }
        };

        AbstractTest abstractTest = new AbstractTest() {
            @Override
            public void calculateSum(int a, int b, int c, int d) {
                System.out.println(a + b + c + d);
            }
        };
    }
}

record Test(int a, int b, int c) {
        public Test {
            System.out.println("Hello world!");
        }

        class NestedClass {
            public NestedClass() {
                System.out.println("Hello world!");
            }
        }

        public Test(int a, int b) {
            this(a, b, 0);
        }

        public Test(int a) {
            this(a, 0, 0);
        }

        public Test() {
            this(0, 0, 0);
        }
}
