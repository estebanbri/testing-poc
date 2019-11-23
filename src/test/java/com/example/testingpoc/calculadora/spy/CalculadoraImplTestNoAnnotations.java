package com.example.testingpoc.calculadora.spy;

import com.example.testingpoc.calculadora.CalculadoraImpl;
import com.example.testingpoc.servicio.IServicio;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculadoraImplTestNoAnnotations {

    private IServicio servicioMock;

    private CalculadoraImpl calculadoraImpl;

    @Before
    public void setUp(){
        servicioMock = mock(IServicio.class);
        calculadoraImpl = new CalculadoraImpl(servicioMock); // manual inject mock
    }

    @Test
    public void perform() {
        when(servicioMock.suma(2,3)).thenReturn(5);
        Integer resultado = calculadoraImpl.perform(2,3);
        assertThat(resultado, equalTo(5));
    }
}
