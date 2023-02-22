package Framework.Utils;

import java.util.Locale;
import org.openqa.selenium.WebDriver;
import com.github.javafaker.Faker;

public class FakeGenerator {
	private Faker faker;
	private String firstName;
	private String lastName;
	private String postalCode;
	
	public FakeGenerator() {
		this.faker = new Faker(new Locale("pt-BR"));
	}
	
	public String getFirstName() {
		return firstName = faker.name().firstName();
	}
	
	public String getLastName() {
		return lastName = faker.name().lastName();
	}
	
	public String getPostalCode() {
		return postalCode = faker.address().zipCode();
	}
}
