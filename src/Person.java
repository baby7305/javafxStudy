import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Created by Administrator on 2018/1/17.
 */
public class Person {
	private StringProperty firstName = new SimpleStringProperty(this, "firstName", "");

	//Returns the StringProperty object
	public StringProperty firstNameProperty() {
		return firstName;
	}

	//Return the firstName value (ie. "Bucky")
	public String getFirstName() {
		return firstName.get();
	}

	//Set the firstName value
	public void setFirstName(String firstName) {
		this.firstName.set(firstName);
	}

}
