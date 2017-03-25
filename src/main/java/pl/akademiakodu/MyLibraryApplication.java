package pl.akademiakodu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import pl.akademiakodu.dao.BookDao;
import pl.akademiakodu.dao.PersonDao;
import pl.akademiakodu.dao.UserDao;
import pl.akademiakodu.model.Book;
import pl.akademiakodu.model.Person;
import pl.akademiakodu.model.User;
import pl.akademiakodu.model.UserDetails;

import static com.sun.deploy.util.SessionState.save;
import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication
public class MyLibraryApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = SpringApplication.run(MyLibraryApplication.class, args);

//		BookDao dao = ctx.getBean(BookDao.class);
//		Book book = new Book("Ostatnie Życzenie","Sapkowski Andrzej", "1234");
//		dao.save(book);
//		Book book1 = new Book("Czas Pogardy","Sapkowski Andrzej", "1254");
//		dao.save(book1);
//
//
//		PersonDao dao2 = ctx.getBean(PersonDao.class);
//		Person person = new Person("Jan","Kowalski",54);
//		dao2.save(person);

		UserDao userDao = ctx.getBean(UserDao.class);
		User user = new User("razdwatrzy","12234one","abc@wp.pl");
		UserDetails details = new UserDetails("Jan","Kowalski","Warszawa");
		user.setUserDetails(details);
		userDao.save(user);



		ctx.close();


	}

}
