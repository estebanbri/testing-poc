package com.example.testingpoc.calculadora.mock;

import com.example.testingpoc.calculadora.CalculadoraImpl;
import com.example.testingpoc.servicio.IServicio;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class CalculadoraImplTestAnnotations {

    @Mock
    private IServicio servicioMock;

    @InjectMocks
    private CalculadoraImpl calculadoraImpl; // Mockito inject servicioMock itself

    @Test
    public void perform() {
        when(servicioMock.suma(2,3)).thenReturn(5);
        Integer resultado = calculadoraImpl.perform(2,3);
        assertThat(resultado, equalTo(5));
        verify(servicioMock, times(1)).suma(2,3);
    }

}