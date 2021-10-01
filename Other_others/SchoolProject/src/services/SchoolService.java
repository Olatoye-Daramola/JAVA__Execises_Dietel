package SchoolProject.src.services;

//All methods in an interface are public

import SchoolProject.src.exceptions.SchoolNotFoundException;
import SchoolProject.src.models.School;

import java.util.List;

public interface SchoolService {
    void add(School school);
    void delete(School school);
    School update(long id, School school) throws SchoolNotFoundException;
    School findById(long id) throws SchoolNotFoundException;
    List<School> getAllSchool();
}
