package com.epita.socra.app;

import com.epita.socra.app.tools.ArabicConverter;
import com.epita.socra.app.tools.IOAdapter;
import com.epita.socra.app.tools.RomanConverter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class ArabicTests {

    private ArabicConverter arabicConverter;

    @Before
    public void setup(){
        arabicConverter = new ArabicConverter();
    }

    @Test
    public void givenOne_WhenRunningMain_ThenCheckOutputs(){
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("I");
        App app = new App(mock);
        app.run(arabicConverter);

        verify(mock).write("1");
    }

    @Test
    public void givenTwo_WhenRunningMain_ThenCheckOutputs(){
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("II");
        App app = new App(mock);
        app.run(arabicConverter);

        verify(mock).write("2");
    }

    @Test
    public void givenFour_WhenRunningMain_ThenCheckOutputs(){
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("IV");
        App app = new App(mock);
        app.run(arabicConverter);

        verify(mock).write("4");
    }

    @Test
    public void given15_WhenRunningMain_ThenCheckOutputs(){
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("XV");
        App app = new App(mock);
        app.run(arabicConverter);

        verify(mock).write("15");
    }

    @Test
    public void givenhundredtwenty_WhenRunningMain_ThenCheckOutputs(){
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("CXX");
        App app = new App(mock);
        app.run(arabicConverter);

        verify(mock).write("120");
    }

    @Test
    public void given752_WhenRunningMain_ThenCheckOutputs(){
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("DCCLII");
        App app = new App(mock);
        app.run(arabicConverter);

        verify(mock).write("752");
    }

    @Test
    public void given2752_WhenRunningMain_ThenCheckOutputs(){
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("MMDCCLII");
        App app = new App(mock);
        app.run(arabicConverter);

        verify(mock).write("2752");
    }
    @Test
    public void given2952_WhenRunningMain_ThenCheckOutputs(){
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("MMCMLII");
        App app = new App(mock);
        app.run(arabicConverter);

        verify(mock).write("2952");
    }
    @Test
    public void given2452_WhenRunningMain_ThenCheckOutputs(){
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("MMCDLII");
        App app = new App(mock);
        app.run(arabicConverter);

        verify(mock).write("2452");
    }
}
