package com.geekster.bidirectional_m_m.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {
    @Id
    private Integer studentId;
    private String studentName;

    @ManyToMany
    @JoinTable(name = "student_course_mapping", joinColumns =  @JoinColumn(name = "fk_student_id"), inverseJoinColumns = @JoinColumn(name = "fk_course_id"))
    List<Course> courses;
}
