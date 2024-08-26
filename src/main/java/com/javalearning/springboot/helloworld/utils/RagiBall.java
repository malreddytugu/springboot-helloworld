package com.javalearning.springboot.helloworld.utils;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public  class RagiBall implements RagiFlour{

	@Override
	public String getRagiRecipe() {
		return "RagiBall with rayalaseema Chicken curry ";
	}

}
