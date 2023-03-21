package datastructure.stack;

import datastructure.stack.Brackets;
import org.junit.Assert;
import org.junit.Test;



public class BracketsTest {


    @Test
    public void bracketsTest(){
        Brackets<Character> ch = new Brackets<>();
        Assert.assertTrue(ch.task("()[]{}"));
        Assert.assertFalse(ch.task("()[{}"));
        Assert.assertTrue(ch.task(""));
    }


    @Test
    public void investedBracketsTest(){
        Brackets<Character> ch = new Brackets<>();
        Assert.assertTrue(ch.task("[{()}]"));
    }

}
