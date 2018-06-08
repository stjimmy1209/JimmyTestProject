package ExceptionTest;

public class ExceptionDemo {

    public static int division(int a, int b){

        int result = -1;
        try {
            result = a/b;

        }catch (Exception e){
            System.err.println("Error occurred: " + e.getMessage());
        }
        return result;
    }

    public static void main(String[] args) {

        int resultx = division(5,0);
        System.out.println("Result is: " + resultx);

    }
}
