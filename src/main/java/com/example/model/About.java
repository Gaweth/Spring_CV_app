package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class About {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
  private String about;
  private String birthday;
  private String website;
  private String phone;
  private int age;
  private String degree;
  private String email;
  private String freelancer;
  private String city;


    public About(){

    }

  public About(Long id, String about, String birthday, String website, String phone, int age, String degree, String email, String freelancer, Long aboutId, String city){

  }

    public About(Long id, String about, String birthday, String website, String phone, int age, String degree, String email, String freelancer, String city) {
        this.id = id;
        this.about = about;
        this.birthday = birthday;
        this.website = website;
        this.phone = phone;
        this.age = age;
        this.degree = degree;
        this.email = email;
        this.freelancer = freelancer;
        this.city=city;

    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFreelancer() {
        return freelancer;
    }

    public void setFreelancer(String freelancer) {
        this.freelancer = freelancer;
    }
}
