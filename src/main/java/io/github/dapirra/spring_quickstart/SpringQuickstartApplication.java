package io.github.dapirra.spring_quickstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@SpringBootApplication
@RestController
public class SpringQuickstartApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringQuickstartApplication.class, args);
	}

	@GetMapping("/")
	public RedirectView redirectWithUsingRedirectView(
			RedirectAttributes attributes) {
		return new RedirectView("/hello");
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}
}
