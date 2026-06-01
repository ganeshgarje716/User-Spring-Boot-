package com.ganesh;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.ganesh.entity.User;
import com.ganesh.repository.UserRepository;

@SpringBootApplication
public class SpringBootUserApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootUserApplication.class, args);
	}
	
	
	
	@Autowired
	UserRepository UR;
	
	

	@Override
	public void run(String... args) throws Exception {
		
		
		//1
		
//      User u=new User("Ganesh", "ganesh@gmail.com", "1212", "8857013765", "Pune", 21);
//		
//		UR.save(u);
		
		

//		List<User> users = List.of(
//			    
//			    new User("Rahul", "rahul@gmail.com", "1111", "9876543210", "Mumbai", 24),
//			    new User("Amit", "amit@gmail.com", "2222", "9876543211", "Nagpur", 23),
//			    new User("Sneha", "sneha@gmail.com", "3333", "9876543212", "Nashik", 22),
//			    new User("Priya", "priya@gmail.com", "4444", "9876543213", "Pune", 25),
//			    new User("Rohit", "rohit@gmail.com", "5555", "9876543214", "Kolhapur", 26),
//			    new User("Pooja", "pooja@gmail.com", "6666", "9876543215", "Satara", 24),
//			    new User("Vikas", "vikas@gmail.com", "7777", "9876543216", "Solapur", 27),
//			    new User("Anjali", "anjali@gmail.com", "8888", "9876543217", "Aurangabad", 23),
//			    new User("Kiran", "kiran@gmail.com", "9999", "9876543218", "Sangli", 28),
//
//			    new User("Suresh", "suresh@gmail.com", "1010", "9876543219", "Pune", 30),
//			    new User("Meena", "meena@gmail.com", "2020", "9876543220", "Mumbai", 29),
//			    new User("Ajay", "ajay@gmail.com", "3030", "9876543221", "Nagpur", 31),
//			    new User("Neha", "neha@gmail.com", "4040", "9876543222", "Nashik", 22),
//			    new User("Arjun", "arjun@gmail.com", "5050", "9876543223", "Pune", 24),
//			    new User("Kavita", "kavita@gmail.com", "6060", "9876543224", "Kolhapur", 27),
//			    new User("Nitin", "nitin@gmail.com", "7070", "9876543225", "Satara", 26),
//			    new User("Shweta", "shweta@gmail.com", "8080", "9876543226", "Solapur", 25),
//			    new User("Deepak", "deepak@gmail.com", "9090", "9876543227", "Aurangabad", 32),
//			    new User("Komal", "komal@gmail.com", "1213", "9876543228", "Sangli", 23),
//
//			    new User("Akash", "akash@gmail.com", "1313", "9876543229", "Pune", 22),
//			    new User("Rani", "rani@gmail.com", "1414", "9876543230", "Mumbai", 21),
//			    new User("Mahesh", "mahesh@gmail.com", "1515", "9876543231", "Nagpur", 33),
//			    new User("Reshma", "reshma@gmail.com", "1616", "9876543232", "Nashik", 24),
//			    new User("Sagar", "sagar@gmail.com", "1717", "9876543233", "Pune", 26),
//			    new User("Vaishali", "vaishali@gmail.com", "1818", "9876543234", "Kolhapur", 28),
//			    new User("Prashant", "prashant@gmail.com", "1919", "9876543235", "Satara", 29),
//			    new User("Monika", "monika@gmail.com", "2021", "9876543236", "Solapur", 27),
//			    new User("Yogesh", "yogesh@gmail.com", "2121", "9876543237", "Aurangabad", 30),
//			    new User("Tejaswini", "tejaswini@gmail.com", "2223", "9876543238", "Sangli", 22),
//
//			    new User("Abhishek", "abhishek@gmail.com", "2323", "9876543239", "Pune", 25),
//			    new User("Bhagyashree", "bhagya@gmail.com", "2424", "9876543240", "Mumbai", 24),
//			    new User("Chetan", "chetan@gmail.com", "2525", "9876543241", "Nagpur", 28),
//			    new User("Divya", "divya@gmail.com", "2626", "9876543242", "Nashik", 23),
//			    new User("Eknath", "eknath@gmail.com", "2727", "9876543243", "Pune", 35),
//			    new User("Farida", "farida@gmail.com", "2828", "9876543244", "Kolhapur", 29),
//			    new User("Gaurav", "gaurav@gmail.com", "2929", "9876543245", "Satara", 27),
//			    new User("Harshada", "harshada@gmail.com", "3031", "9876543246", "Solapur", 26),
//			    new User("Imran", "imran@gmail.com", "3131", "9876543247", "Aurangabad", 31),
//			    new User("Jyoti", "jyoti@gmail.com", "3232", "9876543248", "Sangli", 25),
//
//			    new User("Kunal", "kunal@gmail.com", "3334", "9876543249", "Pune", 24),
//			    new User("Lata", "lata@gmail.com", "3434", "9876543250", "Mumbai", 30),
//			    new User("Manoj", "manoj@gmail.com", "3535", "9876543251", "Nagpur", 28),
//			    new User("Nisha", "nisha@gmail.com", "3636", "9876543252", "Nashik", 23),
//			    new User("Omkar", "omkar@gmail.com", "3737", "9876543253", "Pune", 22),
//			    new User("Prachi", "prachi@gmail.com", "3838", "9876543254", "Kolhapur", 24),
//			    new User("Qasim", "qasim@gmail.com", "3939", "9876543255", "Satara", 29),
//			    new User("Rutuja", "rutuja@gmail.com", "4041", "9876543256", "Solapur", 21),
//			    new User("Sameer", "sameer@gmail.com", "4141", "9876543257", "Aurangabad", 27),
//			    new User("Tanvi", "tanvi@gmail.com", "4242", "9876543258", "Sangli", 23)
//			);
//
//			UR.saveAll(users);
		
		
		
		
		//2
		
//		System.out.println(UR.count());
		
		
		
		//3
		
//		Optional<User> id = UR.findById(1);
//		
//		System.err.println(id.get());
		
		
		
		
		//4
		
//		UR.findAllById(Arrays.asList(1,3,5,7,9,10,20,30,40,50,60,70,80,90)).forEach(i->System.err.println(i));
		
		
		
		
		//5
		
//		UR.findAll().forEach(i->System.err.println(i));
		
		
		
		//6
		
//		System.err.println(UR.existsById(20));
		
		
		
		//7
		 
//	    UR.save(new User("Rahul", "rahul@gmail.com", "9999", "9876543210", "Hydrabad", 24));
		
		
		
		
		//8
		
//		UR.deleteById(51);
		
		
		
		//9
		
//		UR.deleteAllById(Arrays.asList(52,60,70,80,90,100));
		

		
		//10
		
//		UR.deleteAll();
		
		
		
		//11 Sorting
		
//		UR.findAll(Sort.by("name").descending()).forEach(i->System.err.println(i));
		
		
		
		
		//12 Pagination
		
		int pageNo=9;
		
		UR.findAll(PageRequest.of(pageNo - 1, 10)).getContent().forEach(i->System.err.println(i));
		
		
		
		
		
		
		
		
	}

}
