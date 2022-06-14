package com.example.mathsapp;

import java.util.Random;

public class Question {
    // declaration of the operator
    public String operator;

    //declarations of selector for answer and operator
    int selector;
    int operatorSelector;

    // two numbers being used to get the answer
    public int number1;
    public int number2;

    // a variable used to store the right answer
    public int answer;

    // declaration for the answers to be used to assign to the buttons
    public int answer1;
    public int answer2;
    public int answer3;
    public int answer4;

    // random declaration
    Random r = new Random();

    public Question (){
        // on creation randomise these numbers
        number1 = r.nextInt(11) + 1;
        number2 = r.nextInt(11) + 1;
        selector = r.nextInt(4) + 1;
        operatorSelector = r.nextInt(4) + 1;

        // choose an operator
        switch (operatorSelector){
            case 1:
                operator = "+";
                break;
            case 2:
                operator = "-";
                break;
            case 3:
                operator = "÷";
                break;
            case 4:
                operator = "X";
                break;
        }
        // this is for figuring out the answer, to which we give to the corresponding button
        if (operator == "X") {
            answer = number1 * number2;
        }
        else if (operator == "-") {
            answer = number1 - number2;
        }
        else if (operator == "+") {
            answer = number1 + number2;
        }
        else if (operator == "÷") {
            answer = number1 / number2;
        }
        // choose which answer variable has the answer
        switch (selector){
            case 1:
                answer1 = answer;
                answer2 = r.nextInt(23) + 1;
                answer3 = r.nextInt(23) + 1;
                answer4 = r.nextInt(23) + 1;
                break;
            case 2:
                answer2 = answer;
                answer1 = r.nextInt(23) + 1;
                answer3 = r.nextInt(23) + 1;
                answer4 = r.nextInt(23) + 1;
                break;
            case 3:
                answer3 = answer;
                answer2 = r.nextInt(23) + 1;
                answer1 = r.nextInt(23) + 1;
                answer4 = r.nextInt(23) + 1;
                break;
            case 4:
                answer4 = answer;
                answer2 = r.nextInt(23) + 1;
                answer1 = r.nextInt(23) + 1;
                answer3 = r.nextInt(23) + 1;
                break;
        }
    }



}
