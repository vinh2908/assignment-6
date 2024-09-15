
package assignment6;
import java.util.Date;


public abstract class Person implements IPerson{
    String id;
    String fullName;
    Date dateOfBirth;
    

public Person(String id, String fullName, Date dateOfBirth){
    this.id = id;
    this.fullName = fullName;
    this.dateOfBirth = dateOfBirth;
}
public String getId(){
    return id;
}
public void setId(String id){
    this.id =id;
}
public String getfullName(){
    return fullName;
}
public void setfullname(String fullName){
    this.fullName= fullName;
}
public Date getDateOfBirth(){
    return dateOfBirth;
}
public void setDateOfBirth(){
    this.dateOfBirth= dateOfBirth;
}
public abstract void displayInfo();
}
