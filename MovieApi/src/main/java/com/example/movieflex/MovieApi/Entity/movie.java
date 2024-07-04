package com.example.movieflex.MovieApi.Entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Set;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int movieId;
    @Column(nullable = false,length = 100)
    @NotBlank(message = "please provide movie title")
    private String title;
    @Column(nullable = false,length = 200)
    @NotBlank(message = "Please provide director name")
    private String director;
    @Column(nullable = false,length =100)
    @NotBlank(message = "Please provide studio name")
    private String studio;
    @Column(nullable = false)
    private int relaseYear;
    @Column(nullable = false)
    @NotBlank(message = "Please provide poster name")
    private String poster;

    @ElementCollection
    @CollectionTable(name="movie_cast")
    private Set<String> movieCast;


}
