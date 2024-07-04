package com.example.movieflex.MovieApi.DtoService;

import jakarta.validation.constraints.NotBlank;
import lombok.*;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class moivedto {
    private int movieId;
    @NotBlank(message = "Please provide title name")
    private String title;
    @NotBlank(message = "please provide director name")
    private String director;
    @NotBlank(message = "please provide studio name")
    private String studio;
    @NotBlank(message = "please provide movie relased year")
    private int relaseYear;
    @NotBlank(message = "Please upload your movie poster")
    private String Poster;

    private Set<String> movieCast;
    @NotBlank(message = "please provide movie poster url")
    private String PosterUrl;


}
