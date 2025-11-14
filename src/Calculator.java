public class Calculator {

    private static int total_num_of_calc=0;
    protected static int last_calc_result=0;
    public static String calculator_name="";

    public static int Addition(int a, int b){
        int sum=a + b;
        Calculator.last_calc_result=sum;
        Calculator.total_num_of_calc++;
        return sum;
    }

    protected static int Subtraction(int a, int b){
        int sum=a - b;
        Calculator.last_calc_result=sum;
        Calculator.total_num_of_calc++;
        return sum;
    }

    private static void ResetCalculator(){
        Calculator.last_calc_result=0;
    }

    public static void MonthlyReset(){
        ResetCalculator();
    }

    public static void ShowTotalCalculations(){
        System.out.println("This is the total number of calculations: " +Calculator.total_num_of_calc);
    }

public static void ShowLastResult(){
        int last_calc_result =10;
    System.out.println("This is the global variable of last calculation result : " + Calculator.last_calc_result);
    System.out.println("This is the method variable of last calculation result : " + last_calc_result);

}

    public static void main(String[] args) {

        System.out.println("This is the addition sum : " + Addition(5,5));
        System.out.println("This is the subtraction sum : " + Subtraction(10,5));
        MonthlyReset();
        ShowTotalCalculations();
        ShowLastResult();



    }

}
