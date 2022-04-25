package com.practice.firstSpring.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.practice.firstSpring.interfaces.Car;
import com.practice.firstSpring.interfaces.Engine;

@Component
public class Swift implements Car{
	
	@Autowired
	Engine engine;
	
	@Override
	public String specs() {
		return "HachBack from Suzuki  & engine is "+ engine.engineReturn("v6");
	}

}
