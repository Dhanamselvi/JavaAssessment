package com.example.Mapping;

import com.example.Mapping.Models.Manufactures;
import com.example.Mapping.Models.Model;
import com.example.Mapping.Reposteries.ManufacturesRepo;
import com.example.Mapping.Reposteries.ModelRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MappingApplication implements CommandLineRunner {

	@Autowired
	ManufacturesRepo manufacturesRepo;
	
	@Autowired
	ModelRepo modelRepo;

	public static void main(String[] args) {
		SpringApplication.run(MappingApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
	
	Manufactures data=new Manufactures(1,"Honda");
	
	// Inserting the record in the Manufactures table.
	manufacturesRepo.save(data);
	
		// Now try to mapped above record with muliple models
		Model model1=new Model(1,"AYZ",data);
		Model model2=new Model(2,"ZET",data);
		modelRepo.save(model1);
		modelRepo.save(model2);

	}
}
