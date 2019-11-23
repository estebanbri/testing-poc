package com.example.testingpoc.servicio;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

public class ServicioImpl implements IServicio{

    @Override
    public int suma(int a, int b) {
        System.out.println("Ejecutando servicio externo...");
        return a + b + 1;
    }

}
