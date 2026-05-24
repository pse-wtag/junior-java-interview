/**
 * Write a Java method that accepts a List<String> of names and returns a List<String> containing only the names that appear more than 2 times in the input list.
 */
void main() {
    IO.println(addingNames());
}

List<String> name = new ArrayList<>();

List<String> addingNames() {
    name.add(null);
    name.add("John");
    name.add("Paul");
    name.add("Sam");
    name.add("Dora");
    name.add("John");
    name.add("Paul");
    name.add("Smith");
    name.add("John");
    name.add("Paul");

    return name;
}