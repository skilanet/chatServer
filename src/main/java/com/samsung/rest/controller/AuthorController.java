package com.samsung.rest.controller;

import com.samsung.domain.Author;
import com.samsung.rest.dto.AuthorDTO;
import com.samsung.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class AuthorController {
    public final AuthorService authorService;

    @GetMapping("/author")
    public List<AuthorDTO> getAllAuthor(){
        return authorService
                .getAll()
                .stream()
                .map(AuthorDTO::toDTO)
                .collect(Collectors.toList());
    }

    @PostMapping("/author")
    public AuthorDTO insertAuthor(@RequestBody AuthorDTO authorDTO){
        Author author = authorService.insert(AuthorDTO.toDomainObject(authorDTO));
        return AuthorDTO.toDTO(author);
    }

    @PostMapping("author/{id}")
    public AuthorDTO updateAuthor(@PathVariable int id,
                                  @RequestParam String name){
        Author update = authorService.update(id, name);
        return AuthorDTO.toDTO(update);
    }

    @DeleteMapping("author/{id}")
    public void deleteAuthor(@PathVariable int id){
        authorService.deleteById(id);
    }

    @GetMapping("author/{id}")
    public AuthorDTO getAuthorById(@PathVariable int id){
        Author serviceById = authorService.getById(id);
        return AuthorDTO.toDTO(serviceById);
    }
}
