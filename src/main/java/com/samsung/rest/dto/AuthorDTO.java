package com.samsung.rest.dto;

import com.samsung.domain.Author;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuthorDTO {
    private int id;
    private String name;

    public static AuthorDTO toDTO(Author author){
        return new AuthorDTO(author.getId(), author.getName());
    }
    public static Author toDomainObject(AuthorDTO authorDTO){
        return new Author(authorDTO.getId(), authorDTO.getName());
    }
}
