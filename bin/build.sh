#!/bin/bash
javac -d classes src/main/java/is/ru/stringcalculator/Calculator.java
javac -cp src/test/resources/junit-4.12.jar/:classes -d classes src/test/java/is/ru/stringcalculator/CalculatorTest.java
echo 'built'
