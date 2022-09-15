package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/lars-eirik")
	public String hello() {
		return "<html>\n"
				+ "<pre>\n"
				+ "            __,__\n"
				+ "   .--.  .-\"     \"-.  .--.\n"
				+ "  / .. \\/  .-. .-.  \\/ .. \\\n"
				+ " | |  '|  /   Y   \\  |'  | |\n"
				+ " | \\   \\  \\ 0 | 0 /  /   / |\n"
				+ "  \\ '- ,\\.-\"`` ``\"-./, -' /\n"
				+ "   `'-' /_   ^ ^   _\\ '-'`\n"
				+ "       |  \\._   _./  |\n"
				+ "       \\   \\ `~` /   /\n"
				+ "        '._ '-=-' _.'\n"
				+ "           '~---~'\n"
				+ "</pre>\n"
				+ "</html>";
	}

}
