package com.kodilla.testing.loop;

import static org.junit.Assert.*;
import org.junit.Test;

public class testLoopAndConditionalBreakpoints {

    @Test
    public void testLoop(){
        //Given
        long sum = 0;

        //When
        for(int n = 0; n < 1000; n++) {
            sum += n;
            System.out.println("["+n+"] Sum equals:"+sum);
        }

        //Then
        assertEquals(499500,sum);


    }
}
