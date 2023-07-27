package com.jpa_hibernate.quest_jpa_1;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Film {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String title;
  private String mainActor;
  private Date releaseDate;

  public Film(String title,String mainActor,String releaseDate) {
    this.title = title;
    this.mainActor = mainActor;
    this.releaseDate = Date.valueOf(releaseDate);
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getMainActor() {
    return mainActor;
  }

  public void setMainActor(String mainActor) {
    this.mainActor = mainActor;
  }

  public Date getReleaseDate() {
    return releaseDate;
  }

  public void setReleaseDate(Date releaseDate) {
    this.releaseDate = releaseDate;
  }

}
