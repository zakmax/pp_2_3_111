package ru.dao;

//import org.springframework.stereotype.Component;
//import org.springframework.web.bind.annotation.GetMapping;
//import ru.models.Person;
//
//import java.util.ArrayList;
//import java.util.List;

//@Component
//public class PersonDAO {
//    private static int PEOPLE_COUNT;
//    private List<Person> people;
//
//    {
//        people = new ArrayList<>();
//
//        people.add(new Person(++PEOPLE_COUNT, "Tom"));
//        people.add(new Person(++PEOPLE_COUNT, "Bob"));
//        people.add(new Person(++PEOPLE_COUNT, "Mike"));
//        people.add(new Person(++PEOPLE_COUNT, "Katy"));
//    }
//
//    public List<Person> index() {
//
//        return people;
//    }
//
//    public Person show(int id) {
//
//        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
//
//    @GetMapping("/new")
//    public String newPerson(Model model ){
//        model.add
//        }
//
//        @GetMapping()
//        public void save( Person person) {
//        people.add(person);
//        }
//    }
//}