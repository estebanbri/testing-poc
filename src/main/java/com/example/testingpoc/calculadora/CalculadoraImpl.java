package com.example.testingpoc.calculadora;

import com.example.testingpoc.servicio.IServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class CalculadoraImpl implements  ICalculadora{

    private IServicio servicio;

    public CalculadoraImpl(IServicio servicio){
        this.servicio = servicio;
    }

    @Override
    public int perform(int a, int b) {
        return servicio.suma(a, b);
    }
}
