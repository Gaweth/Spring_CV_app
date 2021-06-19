package com.example.model;

import org.apache.jasper.tagplugins.jstl.core.Url;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String category;
    private String client;
    @DateTimeFormat(fallbackPatterns = "DD-MM-YYYY")
    private Date projectDate;
    private String projectUrl;
    private String aboutProject;

    public Portfolio(){

    }


    public Portfolio(Long id, String category, String client, Date projectDate, String projectUrl, String aboutProject) {
        this.id = id;
        this.category = category;
        this.client = client;
        this.projectDate = projectDate;
        this.projectUrl = projectUrl;
        this.aboutProject = aboutProject;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public Date getProjectDate() {
        return projectDate;
    }

    public void setProjectDate(Date projectDate) {
        this.projectDate = projectDate;
    }

    public String getProjectUrl() {
        return projectUrl;
    }

    public void setProjectUrl(String projectUrl) {
        this.projectUrl = projectUrl;
    }

    public String getAboutProject() {
        return aboutProject;
    }

    public void setAboutProject(String aboutProject) {
        this.aboutProject = aboutProject;
    }
}
