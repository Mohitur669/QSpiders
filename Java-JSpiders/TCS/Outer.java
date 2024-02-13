class Outer {
    int outer_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
        System.out.println(inner.y);
    }

    class Inner {
        int y = 20;
        void display() {
            System.out.println("display: outer_x = " + outer_x);
        }
    }
}

class InnerClassDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
    }
}