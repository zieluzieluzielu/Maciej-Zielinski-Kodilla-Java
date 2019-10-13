package com.kodilla.testing;
import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {

        //simpleUser tests:
        SimpleUser simpleUser = new SimpleUser("theForumUser");
        String result = simpleUser.getUserName();

        if (result.equals("theForumUser")){
            System.out.println("simpleUser tests are OK!");
        }
        else {
            System.out.println("ERROR in simpleUser tests!");
        }

        //Calculator tests:
        Calculator calculator = new Calculator();
        int aa = 10;
        int bb = 5;

        int sum = calculator.addAtoB(aa,bb);
        int substract = calculator.substractAfromB(aa,bb);

        //Testing sum method:
        if(sum == 15){
            System.out.println("Sum method in calculator works correctly: "+aa+" + "+bb+" = "+sum);
        }
        else{
            System.out.println("Sum method is not correct!");
        }

        //Testing substract method:
        if(substract== 5){
            System.out.println("Substract method in calculator works correctly: "+aa+" - "+bb+" = "+substract);
        }
        else{
            System.out.println("Substract method is not correct!");
        }

        //Testing both methods:
        if(sum == 15 && substract== 5){
            System.out.println("Both calculator methods works correctly.");
        }
        else{
            System.out.println("Something is wrong with the calculator");
        }


    }
}