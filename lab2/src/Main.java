import java.util.Objects;

enum Color {
    RED,
    BLACK,
    YELLOW
}

public class Main {

    private static Integer iki = 5;


    public static void main(final String[] args) {
        System.out.println("Hello world!");

        final Integer integer = 3;

        Test test1 = new Test();
        Test test2 = new Test();

        System.out.println(test1.equals(test2));
        System.out.println(test1 == test2);

        Color color = Color.BLACK;

        int i = 3;
        int j = 5;
        /*int k = switch (color) {
            case RED -> 4;
            case YELLOW -> {
                int x = 5;
                yield i + j + x;
            }
        };*/

        switch (color) {
            case RED:
                System.out.println("Red");
                break;
            case YELLOW:
                System.out.println("Yellow");
                break;
                case BLACK:
                    System.out.println("Black");
                    break;
            default:
                System.out.println("Default");
                break;
        }

        String str = "de" +
                "deee" +
                "deeee";

        String str2 = """
                de
                deee
                deeeee
                """;

        String strr1 = "hello";
        String strr2 = "hello";
        String strr3 = new String("hello");

        System.out.println(strr1 == strr2);
        System.out.println(strr1 == strr3);

       // System.out.println(str);

    }

    public Color getColor() {
        int i = 3;

        return switch (i) {
            case 1 -> Color.RED;
                //Color.RED;
            case 2 -> Color.BLACK;
            case 3 -> Color.YELLOW;
            default -> throw new IllegalStateException("Unexpected value: " + i);
        };
    }
}

class Test {

    private Integer number1;

    private Integer number2;

    public Integer sum() {
        return number1 + number2;
    }


    public Test() {

    }
    public Test(Integer number1, Integer number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public Integer getNumber1() {
        return number1;
    }

    public void setNumber1(Integer number1) {
        this.number1 = number1;
    }

    public Integer getNumber2() {
        return number2;
    }

    public void setNumber2(Integer number2) {
        this.number2 = number2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test test = (Test) o;
        return Objects.equals(number1, test.number1) && Objects.equals(number2, test.number2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number1, number2);
    }

    @Override
    public String toString() {
        return "Test{" +
                "number1=" + number1 +
                ", number2=" + number2 +
                '}';
    }
}

class Test2 {

    Integer i = 50;
    Integer j = 60;
    static Integer k = 70;


    {
        i = 5;
        j = 6;
        k = 7;
    }

    static {
        k = 80;
    }
}