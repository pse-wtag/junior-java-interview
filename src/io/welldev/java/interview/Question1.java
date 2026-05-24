/**
 * Find all the names that start with the letter 'j/J', Male and the age above 18 and return the name in uppercase
 */
void main() {
  List<Person> people = populateNames();
}

public List<Person> populateNames() {
  return List.of(
          new Person("John", Gender.MALE, 30),
          new Person("jane", Gender.FEMALE, 25),
          new Person("Paul", Gender.MALE, 10),
          new Person("jamile", Gender.MALE, 19),
          new Person("jamie", Gender.MALE, 10),
          new Person("Smith", Gender.OTHER, 30)
  );
}

record Person(String name, Gender gender, Integer age) {
  public Person {
    Objects.requireNonNull(gender);
    if (name.isBlank()) {
      throw new IllegalArgumentException("Name must not be null");
    }
    if (age < 0) {
      throw new IllegalArgumentException("Age must be positive");
    }
  }
  public String uppercaseName() {
    return name().toUpperCase();
  }
}

enum Gender {
  MALE,
  FEMALE,
  OTHER
}

