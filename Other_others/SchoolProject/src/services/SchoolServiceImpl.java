package SchoolProject.src.services;

import SchoolProject.src.db.SchoolDb;
import SchoolProject.src.exceptions.SchoolNotFoundException;
import SchoolProject.src.models.School;

import java.util.List;

public class SchoolServiceImpl implements SchoolService {
    private SchoolDb schoolDb;

    @Override
    public void add(School school) {
        schoolDb.add(school);
    }

    @Override
    public void delete(School school) {
        schoolDb.delete(school);
    }

    @Override
    public School update(long id, School school) throws SchoolNotFoundException {
//        To be completed later for the sake of sanity and to stay within the scope of Chapter 11
        return school;
    }

    @Override
    public School findById(long id) throws SchoolNotFoundException {
        School foundSchool = schoolDb.findById(id);
        if (foundSchool == null) {
            throw new SchoolNotFoundException("School with this id not found in database");
        }
        return foundSchool;
    }

    @Override
    public List<School> getAllSchool() {
        return schoolDb.getAllSchool();
    }
}
