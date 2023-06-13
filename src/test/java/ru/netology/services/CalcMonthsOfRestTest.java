package ru.netology.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.services.CalcMonthsOfRest;

public class CalcMonthsOfRestTest {

    @Test
   void MonthsOfRest () {
        CalcMonthsOfRest service= new CalcMonthsOfRest();

    ///public static void main(String[] args) {

     int income = 10000;
     int expense = 3000;
     int threshold = 20000;

     int expected = 3;
     int actual = service.calculate(income, expense, threshold);
     Assertions.assertEquals(expected,actual);
        /// boolean passed = expected == actual;
        ///System.out.println("Количество месяцев для отдыха - " + passed);



    }
}


