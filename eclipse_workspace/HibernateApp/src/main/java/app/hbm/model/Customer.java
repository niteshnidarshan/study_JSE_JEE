package app.hbm.model;



import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

//@Entity(name = "student_table") //Entity refers to table now & it will map this class to 'student_table'
@Entity //Here Entity refers to class name Customer and will use 'Student' table if @Table not defines any table name
//@Table //Optional
//@Table (name = "custom_table") //It will map custom_table with this class
public class Customer {

	@Id //make this primary key
	private int id;
	
	//@Column(name = "student_name")//Will alter the column name as student_name & map to this class property
	private String name;
	private int age;
	
	@Transient //Will not allow to persist this column value
	private int height;
	
	/**
	 * 
	 * OneToMany also creates a mapping table like "PARENT_CHILD" where maintains their id columns for relationship.
	 * Suppose a customer just registered himself & do not prefer to provide address now then Address will be null that time - So in this situation cascade is used - due to this hibernate do not throw error & do not insert any relationship in parent_child relationship table. 
	 * 
	 * Four types of cascade 
	 *  1) None - (DETACH) ----Default
	 *  2) All - (ALL)
	 *  3) All-DELETE-ORPHAN  - (MERGE)
	 *  4) SAVE - (PERSIST)
	 *  5) SAVE-UPDATE - (REFRESH)
	 *  6) DELETE - (REMOVE)
	 *  
	 *  
	 *  FetchType [Deafault value is LAZY id fetch attribute is not used] - This 'fetch' attribute is used for fetching the record
	 *  FetchType.LAZY - It means by default if relationship column is there, then a user has to manually fetch many(relation) field with collection.
	 *  FetchType.EAGER - Here no need to write manual code to show relationship(many) table value. Hibernate will fetch all the related table values also with Left Outer Join in fetch query. 
	 * 
	 */
	@OneToMany(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)//Cascade attribute tells the hibernate to apply a parent operation on child object also. default is 'NONE'
	private List<Address> address;
	
	public List<Address> getAddresses() {
		return address;
	}
	public void setAddresses(List<Address> address) {
		this.address = address;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
