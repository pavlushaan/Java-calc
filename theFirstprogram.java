public class theFirstprogram {
    static void calc(double x, double y, String operation){
        switch (operation){
            case "+" :
                System.out.println(x+y);
                break;
            case "-" :
                System.out.println(x-y);
                break;
            case "/":
                System.out.println(x/y);
                break;
            case "*":
                System.out.println(x*y);
                break;
            default:
                System.out.println("Error");

        }

    }

    public static void main(String[] args) {
        calc(10,10, "+");
        calc(12,15, "-");
        calc(20,2, "/");
        calc(122,4, "*");
        calc(15,17, "%");
    }
}