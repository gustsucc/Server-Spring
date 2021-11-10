package example.demo;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PruebaApplication {
		
	public static void main(String[] args) {
		SpringApplication.run(PruebaApplication.class, args);
	}
/*
	@Bean
	public CommandLineRunner demo(RepoUsuarios repository) {
  	  return (args) -> {
		Usuario t = new Usuario("Octavio","1234");
		repository.save(t);
	  };	
}*/
}
