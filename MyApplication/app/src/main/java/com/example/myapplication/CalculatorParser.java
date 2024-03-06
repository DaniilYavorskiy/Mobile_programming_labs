package com.example.myapplication;

import java.util.Stack;

public class CalculatorParser {
    private final String expression;

    public CalculatorParser(String expression) {
        this.expression = expression;
    }

    public Double calculate() {
        char[] tokens = expression.toCharArray();

        Stack<Double> numbers = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            if (Character.isDigit(tokens[i])) {
                StringBuilder sb = new StringBuilder();

                while (i < tokens.length && (Character.isDigit(tokens[i]) || tokens[i] == '.')) {
                    if (tokens[i] == '.' && !Character.isDigit(tokens[i + 1])) {
                        throw new ArithmeticException();
                    }
                    sb.append(tokens[i++]);
                }

                numbers.push(Double.parseDouble(sb.toString()));
                i--;
            } else if (tokens[i] == '+' || tokens[i] == '-') {
                while (!operators.isEmpty() && (operators.peek() == '*' || operators.peek() == '/')) {
                    numbers.push(applyOperator(operators.pop(), numbers.pop(), numbers.pop()));
                }
                operators.push(tokens[i]);
            } else if (tokens[i] == '*' || tokens[i] == '/') {
                while (!operators.isEmpty() && (operators.peek() == '*' || operators.peek() == '/')) {
                    numbers.push(applyOperator(operators.pop(), numbers.pop(), numbers.pop()));
                }
                operators.push(tokens[i]);
            }
        }

        while (!operators.isEmpty()) {
            numbers.push(applyOperator(operators.pop(), numbers.pop(), numbers.pop()));
        }

        return numbers.pop();
    }

    private static double applyOperator(char operator, double operand2, double operand1) {
        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                if (operand2 == 0) {
                    throw new ArithmeticException();
                }
                return operand1 / operand2;
            default:
                return 0;
        }
    }
}