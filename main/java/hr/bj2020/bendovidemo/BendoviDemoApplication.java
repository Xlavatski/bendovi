package hr.bj2020.bendovidemo;

import hr.bj2020.bendovidemo.model.Bend;
import hr.bj2020.bendovidemo.repository.BendRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BendoviDemoApplication implements CommandLineRunner {
	@Autowired
	private BendRepo bendRepo;
	public static void main(String[] args) {
		SpringApplication.run(BendoviDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/* Bend b1 = new Bend(1, "Rolling Stones");
		bendRepo.save(b1);
		Bend b2 = new Bend(2, "AC/DC");
		bendRepo.save(b2);
		Bend b3 = new Bend(3, "Metalica");
		bendRepo.save(b3);
		Bend b4 = new Bend(4, "Nirvana");
		bendRepo.save(b4);
		Bend b5 = new Bend(5, "Iron Mainden");
		bendRepo.save(b5);
		Bend b6 = new Bend(6, "Pink Floyd");
		bendRepo.save(b6);
		Bend b7 = new Bend(7, "Cream");
		bendRepo.save(b7);
		Bend b8 = new Bend(8, "Iggy Pop");
		bendRepo.save(b8);
		Bend b9 = new Bend(9, "Queen");
		bendRepo.save(b9);
		Bend b10 = new Bend(10, "KISS");
		bendRepo.save(b10);  */

		Bend b1 = new Bend("Rolling Stones");
		bendRepo.save(b1);
		Bend b2 = new Bend( "AC/DC");
		bendRepo.save(b2);
		Bend b3 = new Bend("Metalica");
		bendRepo.save(b3);
		Bend b4 = new Bend( "Nirvana");
		bendRepo.save(b4);
		Bend b5 = new Bend( "Iron Mainden");
		bendRepo.save(b5);
		Bend b6 = new Bend( "Pink Floyd");
		bendRepo.save(b6);
		Bend b7 = new Bend( "Cream");
		bendRepo.save(b7);
		Bend b8 = new Bend( "Iggy Pop");
		bendRepo.save(b8);
		Bend b9 = new Bend( "Queen");
		bendRepo.save(b9);
		Bend b10 = new Bend( "KISS");
		bendRepo.save(b10);
	}
}
