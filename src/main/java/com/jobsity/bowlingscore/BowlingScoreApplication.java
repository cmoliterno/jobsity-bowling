package com.jobsity.bowlingscore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jobsity.bowlingscore.objects.Board;

import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
public class BowlingScoreApplication implements CommandLineRunner  {
	
	@Autowired
	private Board myBoard;

	public static void main(String[] args) {
		SpringApplication.run(BowlingScoreApplication.class, args);
	}

	@Override
    public void run(String... args) {
        myBoard.loadScreens("score.dat");
        
        myBoard.printScore();
    }
}
