package com.javalearning.springboot.helloworld.utils;

import org.springframework.stereotype.Component;

@Component
public class RagiPorridge implements RagiFlour {

	@Override
	public String getRagiRecipe() {
		return "Ragi Porridge with Jaggaery with cashew and dry grapes with Desi cow Ghee";
	}

	
}
