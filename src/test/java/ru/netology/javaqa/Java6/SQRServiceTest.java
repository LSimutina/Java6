package ru.netology.javaqa.Java6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/qsrt.cvs")

    public void testNumberOfSquares(int expected,int slideStart, int slideEnd){
        SQRService service=new SQRService();
        int actual=service.calcSQR(slideStart, slideEnd);

        Assertions.assertEquals(expected, actual);
    }

}
