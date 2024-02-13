public class Test {
    public static void main(String[] args) {
        int[] arr = {1, 2};

        arr[0] = arr[0] + arr[1];
        arr[1] = arr[0] - arr[1];
        arr[0] = arr[0] - arr[1];

        System.out.println(arr[0] + " " + arr[1]);

        {
            int a = 10;
        }
        {
            int a = 20;
        }

        byte b = 127;
        System.out.println(b);

        double ratio = (double) 2 / 3;
        System.out.println(ratio);

        double x = 11;
        double y = 3;

        double result = x / y;

        System.out.println(Math.round(result));


        int test = 10;

        switch (test) {
            case 10:
                System.out.println("10");
            case 20:
                System.out.println("20");
                break;
            default:
                System.out.println("default");
        }


        int i, j;
        i = 100;
        j = 200;
        while (++i < --j) ;
        System.out.println("Midpoint is " + i);

        String s = new String();
        System.out.println(s);

        String date = "June 5, 2022 1:28:19 PM";
        System.out.println(date.indexOf('2', 9));



    }
}