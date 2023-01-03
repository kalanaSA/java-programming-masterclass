package com.company;

public class DayName {

    public static String getDayName(int dayNo) {

        /*no need this in here it'll handle by default case/else.
        if (dayNo < 0 || dayNo > 7) {
            return "invalid parameter!";
        }
        */

        switch (dayNo) {
        case 0:
            return dayNo + " is Sunday";
        // break; Unreachable statement-no need this break line in here because if we return something in a method with return
        // type, method won't execute anything anymore after returned. so method was done mean switch case also done, so
        // no need break line again to stop process. but if we do not return anything we do need break expression.
        case 1:
            return dayNo + " is Monday";
        // break;
        case 2:
            return dayNo + " is Tuesday";
        // break;
        case 3:
            return dayNo + " is Wednesday";
        // break;
        case 4:
            return dayNo + " is Thursday";
        // break;
        case 5:
            return dayNo + " is Friday";
        //break;
        case 6:
            return dayNo + " is Saturday";
        // break;
        default: //default equal to else in if statement
            //return "invalid day";
            System.out.println("Invalid day!");
            break;
        }

        /*
        if (dayNo == 0) {
            return dayNo + " is Sunday";
        } else if (dayNo == 1) {
            return dayNo + " is Monday";
        } else if (dayNo == 2) {
            return dayNo + " is Tuesday";
        } else if (dayNo == 3) {
            return dayNo + " is Wednesday";
        } else if (dayNo == 4) {
            return dayNo + " is Thursday";
        } else if (dayNo == 5) {
            return dayNo + " is Friday";
        } else if (dayNo == 6) {
            return dayNo + " is Saturday";
        } else {
            System.out.println("Invalid day!");
        }
        */

        return "this will return if some of above case haven't return something & that case was true in switch statement "
            + "that inside the method with return type (in this case it's default case)";
        /*in method with return type with if/switch statement -> if we have a one case or more than one with no returning something then we
         have to return something end of the method(outside the switch statement) as a default for cases that have no return expression. because
         method with return type should return something(even if case with no return expression were triggered). & if one case was returned
         something then method won't execute anything anymore. (method will finish by returning something that's why we need put default
         return expression for cases that aren't return something)
        */
    }

}
