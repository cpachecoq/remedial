package ec.edu.ups.mensaje;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class MensajeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MensajeApplication.class, args);
	}

	@RestController
	@RequestMapping("/message")
	class MessageController {

		@GetMapping
		public String getMessage() {
			// Devolver un mensaje en formato JSON
			return "{\"mensaje\":\"Hola UPS\"}";
		}
	}
}
