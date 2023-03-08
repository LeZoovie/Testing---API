package com.AdoptAFloof.AdoptAFloof.Available_Floofs;

//import jakarta.persistence.Column;
import javax.persistence.Column;

import java.util.Set;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;
//import lombok.Data;


//@EnableWebMvc
//@EnableSwagger2
@SpringBootApplication

@Entity
@Table(name="Available_Floofs")
public class Available_Floofs {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int Available_Floofs_id;
  
  @Column(columnDefinition = "age of cat")
  private int age;
  
  @Column(columnDefinition = "name")
  private String name;
  
  @Column(columnDefinition = "Cats_Temperament")
  private String Temperament;
}
