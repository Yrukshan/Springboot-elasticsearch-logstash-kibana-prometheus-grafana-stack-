package com.rukshan.moviesapi.movie.dto;

import com.rukshan.moviesapi.movie.model.Genre;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record CreateMovieRequest(
        @NotBlank String imdbId,
        @NotBlank String title,
        @Positive Short year,
        @NotNull Genre genre,
        @NotBlank String country) {
}
