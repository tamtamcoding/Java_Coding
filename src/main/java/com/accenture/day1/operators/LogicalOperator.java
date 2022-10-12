package com.accenture.day1.operators;

public class LogicalOperator {

    /*
    Logical Operator - operators that ONLY accepts true or false (boolean values)
    1. AND && - true if ALL the values are true
    2. OR || - true if ONE of the value is true
    3. NOT ! - negating the original value

    Precedence: Parenthesis, NOT, AND, OR
     */

    public static void main(String[] args) {
        boolean myBoolean = true &&  !(true || false && false || true);
        // true && !(true || false || true) = true && !(true) = true && false = false
        System.out.println("myBoolean output: " + myBoolean);
    }
}
