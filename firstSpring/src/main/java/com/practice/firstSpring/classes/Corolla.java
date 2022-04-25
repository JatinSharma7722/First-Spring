package com.practice.firstSpring.classes;

import org.springframework.beans.factory.annotation.Autowired;
import com.practice.firstSpring.interfaces.Car;
import com.practice.firstSpring.interfaces.Engine;

import org.springframework.stereotype.Component;

@Component
public class Corolla implements Car {
	
	@Autowired
	Engine engine;
	@Override
	public String specs() {
		return "Sedan from Toyota & engine is "+ engine.engineReturn("v8");
	}

}
