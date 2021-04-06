class Person {
  String name;
  int age;
  String color;

  Person(String theName, int theAge, String theColor) {
    name = theName;
    age = theAge;
    color = theColor;
  }
  String getName() {
    return name;
  }
  int getAge() {
    return age;
  }
  String getColor() {
    return color;
  }
}