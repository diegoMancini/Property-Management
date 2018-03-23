package user;

import property.Property;

import java.util.ArrayList;
import java.util.List;

public class Person {

   private String id;
   private String name;
   private String surname;
   private String email;
   private String password;
   private String phone;
   private List<Property> properties;
   private boolean logged;

   public Person(String id, String name, String surname, String email, String password, String phone) {
      this.id = id;
      this.name = name;
      this.surname = surname;
      this.email = email;
      this.password = password;
      this.phone = phone;
      properties = new ArrayList<Property>();
      logged = false;
   }

   public String getId() {
      return id;
   }

   public String getName() {
      return name;
   }

   public String getSurname() {
      return surname;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public String getPhone() {
      return phone;
   }

   public void setPhone(String phone) {
      this.phone = phone;
   }

   public List<Property> getProperties() {
      return properties;
   }

   public void addProperty(Property aProperty) {
      properties.add(aProperty);
   }

   public void removeProperty(Property aProperty) {
      properties.remove(aProperty);
   }

   public boolean isLogged() {
      return logged;
   }

   public void setLogged(boolean logged) {
      this.logged = logged;
   }
}
