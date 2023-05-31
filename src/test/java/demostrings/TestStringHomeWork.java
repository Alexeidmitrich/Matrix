package demostrings;

import demo.demostrings.StringHomeWork;
import org.junit.Assert;
import org.junit.Test;


import static demo.demostrings.StringHomeWork.deleteZero;
import static demo.demostrings.StringHomeWork.sumTicket;

public class TestStringHomeWork {

    @Test
    public void testsumTicket(){
        String number = "123456";
        Assert.assertFalse(sumTicket(number));
        String number1 = "333333";
        Assert.assertTrue(sumTicket(number1));
        String number2 = " 123456";
        Assert.assertFalse(sumTicket(number2));
        String number3 = " 333333";
        Assert.assertTrue(sumTicket(number3));
        String number4 = "333333 ";
        Assert.assertTrue(sumTicket(number4));
        String number5 = " 333333     ";
        Assert.assertTrue(sumTicket(number5));
        String number6 = " ";
        Assert.assertFalse(sumTicket(number6));
        String number7 = null;
        Assert.assertFalse(sumTicket(number7));
        String number8 = "3333333";
        Assert.assertFalse(sumTicket(number8));
        String number9 = "33333";
        Assert.assertFalse(sumTicket(number9));

    }

}
