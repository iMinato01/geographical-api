import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"Controllers", "Services", "Objects"})
@SpringBootApplication
public class GeographicApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(GeographicApiApplication.class, args);
	}

}
