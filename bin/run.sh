#!/bin/bash
java -cp classes:src/test/resources/junit-4.12.jar:src/test/resources/hamcrest-core-1.3.jar org.junit.runner.JUnitCore is.ru.stringcalculator.CalculatorTest || { echo 'failed'; exit 1; }