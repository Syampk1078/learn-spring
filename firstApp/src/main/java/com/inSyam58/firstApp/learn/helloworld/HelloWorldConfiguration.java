package com.inSyam58.firstApp.learn.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person (String name, int age, Address address) { }

record Address (String state, String Country) { };

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Syam";
	}
	
	@Bean
	public int age() {
		return 22;
	}
	
	@Bean
	public Person person() {
		return new Person("Damu",21, new Address("Telangana","India"));
	}
	
	@Bean
	@Primary
	public Person person2MethodCall() {
		return new Person(name(),age(), address());
	}
	
	@Bean
	public Person person3Parameters(int age, Address address) {
		return new Person("Prasad", age, address);
	}

	@Bean
	public Person person4Qualifier(int age, @Qualifier("custom") Address address) {
		return new Person("Prasad", age, address);
	}

	@Primary
	@Bean(name = "address2")
	public Address address() {
		return new Address("Andhra","India");
	}

	@Qualifier("custom")
	@Bean(name = "address3")
	public Address address2() {
		return new Address("Pune","India");
	}
	
}
