import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    ArrayList<Person> people = new ArrayList<Person>();
    Person p1 = new Person("Seth", 22, "Blue");
    Person p2 = new Person("Zach", 21, "Orange");
    Person p3 = new Person("Julia", 21, "Rose Gold");
    Person p4 = new Person("Ryan", 22, "Red");
    Person p5 = new Person("MJ", 22, "Purple");

    people.add(p1);
    people.add(p2);
    people.add(p3);
    people.add(p4);
    people.add(p5);

    try {
      FileWriter writeFile;
      writeFile = new FileWriter("data.txt");
      BufferedWriter output = new BufferedWriter(writeFile);

      for(int i=0; i<people.size(); i++) {
        output.write(people.get(i).getName());
        output.newLine();
        output.write(Integer.toString(people.get(i).getAge()));
        output.newLine();
        output.write(people.get(i).getColor());
        output.newLine();

        output.flush();
      }
      output.close();
    }
    catch(IOException exception) {
      exception.printStackTrace();
    }
    try {
      FileReader myFile;
      myFile = new FileReader("data.txt");
      String name = "", age = "", color = "";
      BufferedReader reader = new BufferedReader(myFile);

      while (reader.ready()) {
        name = reader.readLine();
        age = reader.readLine();
        color = reader.readLine();
        Person thePerson = new Person(name, Integer.parseInt(age), color);
        System.out.printf("%-10s %-10s %-10s %n", name, age, color);
      }
      reader.close();
    }
    catch(IOException except) {
      except.printStackTrace();
    }
  }
}