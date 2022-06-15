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

    //constructor
    public Question (){
        // on creation randomise these numbers
        this.number1 = r.nextInt(11) + 1;
        this.number2 = r.nextInt(11) + 1;
        this.selector = r.nextInt(4) + 1;
        this.operatorSelector = r.nextInt(4) + 1;

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
            number1 = r.nextInt(11)+1;
            number2 = r.nextInt(number1) + 1;
            answer = number1 - number2;
            // ensure that number two is smaller then number one
            if (answer < 0){
                // use the number 2 as the highest number it can be
                number2 = r.nextInt(number2);
                answer = number1 - number2;
            }
        }
        else if (operator == "+") {
            answer = number1 + number2;
        }
        else if (operator == "÷") {
            number1 = r.nextInt(11)+1;
            number2 = r.nextInt(number1) + 1;
            while(number1 % 2 != 0){
                number1 = r.nextInt(11) + 1;
            }
            while(number2 % 2 != 0){
                number2 = r.nextInt(number1) + 1;
                // check to make sure the number is able to divide cleanly into number 1
                if(number1 % number2 != 0){
                    number2 = r.nextInt(number1) + 1;
                }
            }
            answer = number1 / number2;
        }
        // choose which answer variable has the answer
        switch (selector){
            case 1:
                this.answer1 = answer;
                this.answer2 = r.nextInt(23) + 1;
                this.answer3 = r.nextInt(23) + 1;
                this.answer4 = r.nextInt(23) + 1;
                break;
            case 2:
                this.answer2 = answer;
                this.answer1 = r.nextInt(23) + 1;
                this.answer3 = r.nextInt(23) + 1;
                this.answer4 = r.nextInt(23) + 1;
                break;
            case 3:
                this.answer3 = answer;
                this.answer2 = r.nextInt(23) + 1;
                this.answer1 = r.nextInt(23) + 1;
                this.answer4 = r.nextInt(23) + 1;
                break;
            case 4:
                this.answer4 = answer;
                this.answer2 = r.nextInt(23) + 1;
                this.answer1 = r.nextInt(23) + 1;
                this.answer3 = r.nextInt(23) + 1;
                break;
        }
    }



}
