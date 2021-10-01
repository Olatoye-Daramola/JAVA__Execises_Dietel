package SchoolProject.src.db;

import SchoolProject.src.models.School;

import java.util.ArrayList;
import java.util.List;

public class SchoolDb {
    private List<School> schools = new ArrayList<>();

    public void add(School school) {
        schools.add(school);
    }

    public void delete(School school) {
        schools.remove(school);
    }

    public School findById(long id) {
        return schools.get( (int) id);
    }

    public List<School> getAllSchool() {
        return schools;
    }
}
