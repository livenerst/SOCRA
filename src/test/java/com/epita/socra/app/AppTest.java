package com.epita.socra.app;

import com.epita.socra.app.tools.RomanConverter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.epita.socra.app.tools.IOAdapter;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test.
     */

    private RomanConverter romanConverter;

    @Before
    public void setup(){
        romanConverter = new RomanConverter();
    }

    @Test
    public void givenNothing_WhenRunningMain_ThenCheckOutputs(){
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("");
        App app = new App(mock);
        app.run(romanConverter);

        verify(mock).write("");
    }

    @Test
    public void givenOne_WhenRunningMain_ThenCheckOutputs(){
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("1");
        App app = new App(mock);
        app.run(romanConverter);

        verify(mock).write("I");
    }

    @Test
    public void givenTwo_WhenRunningMain_ThenCheckOutputs(){
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("2");
        App app = new App(mock);
        app.run(romanConverter);

        verify(mock).write("II");
    }

    @Test
    public void givenTen_WhenRunningMain_ThenCheckOutputs(){
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("10");
        App app = new App(mock);
        app.run(romanConverter);

        verify(mock).write("X");
    }

    @Test
    public void givenTwentyseven_WhenRunningMain_ThenCheckOutputs(){
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("27");
        App app = new App(mock);
        app.run(romanConverter);

        verify(mock).write("XXVII");
    }

    @Test
    public void givenMinusFour_WhenRunningMain_ThenCheckOutputs(){
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("-4");
        App app = new App(mock);
        app.run(romanConverter);

        verify(mock).write("");
    }

    @Test
    public void givenHundred_WhenRunningMain_ThenCheckOutputs(){
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("100");
        App app = new App(mock);
        app.run(romanConverter);

        verify(mock).write("C");
    }

    @Test
    public void givenThreeHundredSeventyFour_WhenRunningMain_ThenCheckOutputs(){
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("374");
        App app = new App(mock);
        app.run(romanConverter);

        verify(mock).write("CCCLXXIV");
    }

    @Test
    public void givenThousand_WhenRunningMain_ThenCheckOutputs(){
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("1000");
        App app = new App(mock);
        app.run(romanConverter);

        verify(mock).write("M");
    }

    @Test
    public void givenThousandFiveHundredNinetyTwo_WhenRunningMain_ThenCheckOutputs(){
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("1592");
        App app = new App(mock);
        app.run(romanConverter);

        verify(mock).write("MDXCII");
    }
}
