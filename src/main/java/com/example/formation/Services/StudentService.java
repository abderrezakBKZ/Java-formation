package com.example.formation.Services;

import com.example.formation.Models.Nationality;
import com.example.formation.Models.Student;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService {

    public List<Student> inMemoryStudents () {
        return List.of(
                new Student("Hamid", "Boutela", Nationality.SPANISH),
                new Student("Angela", "Davids", Nationality.BRITISH),
                new Student("Hoa", "Nakamura", Nationality.JAPANESSE)
        );
    }

    public Student bestStudent () {
        return new Student("Youcef", "Davids", Nationality.BRITISH);
    }
}
