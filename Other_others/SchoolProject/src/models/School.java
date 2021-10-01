package SchoolProject.src.models;

import java.util.ArrayList;
import java.util.List;

//Creating Retrieving Updating Deleting = CRUD

public class School {
    private long id;
    private String name;
    private String description;
    private SchoolType schoolType;
    private List<Class> classes = new ArrayList<>();
    private List<Staff> staffs = new ArrayList<>();
    private List<Student> students = new ArrayList<>();
    private Address address;
}
