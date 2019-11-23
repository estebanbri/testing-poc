package com.example.testingpoc.calculadora.spy;

import com.example.testingpoc.calculadora.CalculadoraImpl;
import com.example.testingpoc.servicio.ServicioImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class CalculadoraImplTestAnnotations {

    @Spy
    private ServicioImpl servicioImplSpy;

    @InjectMocks
    private CalculadoraImpl calculadoraImpl; // Mockito inject servicioMock itself

    @Test
    public void perform() {
        when(servicioImplSpy.suma(2,3)).thenReturn(5);
        Integer resultado = calculadoraImpl.perform(2,3);
        assertThat(resultado, equalTo(5));
        verify(servicioImplSpy, times(1)).suma(2,3);
    }

}