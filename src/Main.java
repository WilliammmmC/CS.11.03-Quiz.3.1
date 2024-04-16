public class Main {

    // Question 1 - calculateGrade
    public static char calculateGrade(int grade){
        if(grade >= 90){
            return 'A';
        }
        else if(grade >= 80){
            return 'B';
        }
        else if(grade >= 70){
            return 'C';
        }
        else if(grade >=60){
            return 'D';
        }
        else if(grade >= 50){
            return 'E';
        }
        else{
            return 'F';
        }
    }

    // Question 2 - fizzBuzz
    public static String fizzBuzz(int value){
        if(value%3 == 0 && value%5 == 0){
            return "fizzbuzz";
        }
        else if (value%3 == 0){
            return "fizz";
        }
        else if(value%5 == 0){
            return "buzz";
        }
        else{
            return "unlucky";
        }
    }


    // Question 3 - frontBack
    public static String frontBack(String input){
        if(input.length() >= 2){
            return input.substring(0,2) + input +input.substring(0,2);
        }
        else{
            return input;
        }
    }

    // Question 4 - twoAsOne
    public static boolean twoAsOne(int value1, int value2, int value3){
        if(value1 + value2 == value3){
            return true;
        }
        else if(value2 + value3 == value1){
            return true;
        }
        else if(value1 + value3 == value2 ){
            return true;
        }
        else{
            return false;
        }
    }
    // Question 5 - endUp
    public static String endUp(String input){
        if(input.length() >= 3){
            return input.substring(0,input.length() - 3) + input.substring(input.length() - 3).toUpperCase();
        }
        else{
            return input.toUpperCase();
        }
    }

}
