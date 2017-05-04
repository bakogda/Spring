package io;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by Bako Gdaniec
 */

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final EmployeeDataRepository repository;
    private final ShiftDataRepository shiftRepository;

    @Autowired
    public DatabaseLoader(EmployeeDataRepository repository, ShiftDataRepository shiftRepository) {
        this.repository = repository;
        this.shiftRepository = shiftRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
        Employees one = new Employees("01", "Bako", "Gdaniec");
        Employees two = new Employees("02", "Martin", "Jefford");
        Employees three = new Employees("03", "Martin", "Jefford");
        Employees four = new Employees("04", "Martin", "Jefford");
        Employees five = new Employees("05", "Martin", "Jefford");
        
        Shift Monday = new Shift("Monday");
        Shift Tuesday = new Shift("Tuesday");
        Shift Wednesday = new Shift("Wednesday");
        Shift Thursday = new Shift("Thursday");
        Shift Friday = new Shift("Friday");
        
        one.setShift(Monday,Tuesday,Wednesday,Thursday,Friday);
        two.setShift(Monday,Tuesday,Wednesday);
        three.setShift(Tuesday,Wednesday,Thursday);
        four.setShift(Wednesday,Thursday,Friday);
        five.setShift(Thursday,Friday);
        
        this.shiftRepository.save(Monday); 
		this.shiftRepository.save(Tuesday);
		this.shiftRepository.save(Wednesday);
		this.shiftRepository.save(Thursday);
		this.shiftRepository.save(Friday);


		this.repository.save(one);
		this.repository.save(two);
		this.repository.save(three);
		this.repository.save(five);
    }
}
