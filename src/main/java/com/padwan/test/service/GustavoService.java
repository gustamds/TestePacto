package com.padwan.test.service;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class GustavoService {

	public List<String> skills() {
		List<String> skills = new ArrayList<>();
        skills.add("Dedicado");
        skills.add("Estudioso");
        skills.add("Competente");
        skills.add("Sociável");
        skills.add("Colaborativo");
        skills.add("Profissional");
        skills.add("Eficaz");
        return skills;
	}

}
