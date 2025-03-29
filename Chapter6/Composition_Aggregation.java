public class Composition_Aggregation {

  //Black Diamond at the Owner's Side (Contains a)

  public static void main(String[] args){
    Address myAddress = new Address("Jalan Impian Emas Satu", "Johor Bahru", "Malaysia");
    Person persona = new Person(myAddress);

    System.out.println(persona.getName().getFullName() + " is Living in " + persona.getAddress().getFullAddress());
  }
  
}

class Person{

  private Name name; //Composition
  private Address address; //Aggregation

  public Person(Address address){ // it will be passed to prove aggregation
    this.address = address;
    name = new Name("Ahmed ", "AL-Gabaly");
  }

  public Name getName(){
    return name;
  }

  public Address getAddress(){
    return address;
  }
}

class Name{

private String firstName;
private String lastName;

public Name(String firstName, String lastName){
  this.firstName = firstName;
  this.lastName = lastName;
}

public String getFullName(){
  return (firstName + lastName);
}

}

class Address{

  private String street;
  private String city;
  private String country;

  public Address(String street, String city, String country){
    this.street = street;
    this.city = city;
    this.country = country;
  }

  public String getFullAddress(){
    return (street + ", " + city + ", " + country);
  }

}
