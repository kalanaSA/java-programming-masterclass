package com.company;

public class Main {

    public static void main(String[] args) {

    /*
    * think you got large number of values you want to test & perform different code for based on that value, there is an alternative instead
      of if-else statement and that's using the switch statement.
    * both if statement & switch statement can achieve same thing. but if-statement little more flexible in that each time
      we do a test we don't have to use the same criteria(test different variables all together). in case of switch we're
      actually testing the same/one variable, you want to test different values for that same variable.(we can't introduce a
      different variable type to test argument's sake, we're just testing the one variable with switch statement)
    * by switch statement we can only test conditions like if(switchValue == 1) in if else.  (== equals to conditional operator)
    * so switch is good to use if you're actually testing the same variable you want to test different values for that variable.
      in if-else statement section, if one conditional expression will true then statements belong to that if statement will
      execute and jumping out of if-else statement section. no, any other conditional statements going to execute even if there is
      a true conditional expressions after that. to act as same in switch statement we use break line. if we didn't put break line,
      below cases after that will execute even if they are not true until found a break line or until reach end of the switch statement.
      technically don't need to put break in default case.*/

        int switchValue = 3;

        switch (switchValue) { /*switch works with the byte,short,char,int 4 primitive data types. It also works with enumerated types,
            the String class, and a few special classes that wrap certain primitive types Byte,Short,Character,Integer*/
            case 1:
                System.out.println("value was 1");
                break;
            case 2:
                System.out.println("value was 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("value was a 3 or a 4 or a 5");
                System.out.println("actually it was a " + switchValue);
                break;
            default:
                System.out.println("value was not 1,2,3,4,5");
                break;  //technically this is not need
        }

        String month = "JanUary";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("not sure");
                break;
        }

        challenge('D');

        System.out.println(DayName.getDayName(-1));
        System.out.println(DayName.getDayName(0));

    }

    //challenge --------------------------------------------------------------------------------------------------------
    public static void challenge(char charValue) {

        switch (charValue) {

            case 'A':
                System.out.println("it was a A");
                break;
            case 'B':
                System.out.println("it was a B");
                break;
            case 'C':
            case 'D':
            case 'E':
                System.out.println("it was a " + charValue);
                break;
            default:
                System.out.println("not found!");
        }
    }


}
