package com.ekocbiyik.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by enbiya on 23.08.2017.
 */

@Entity
@Table(name = "t_course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "course_id")
    private int courseId;

    @Column(name = "course_name")
    private String courseName;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "courses")
    private Set<Personel> personels = new HashSet<>();

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Set<Personel> getPersonels() {
        return personels;
    }

    public void setPersonels(Set<Personel> personels) {
        this.personels = personels;
    }
}