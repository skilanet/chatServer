package com.samsung.rest.controller;

import com.samsung.rest.dto.MessageDTO;
import com.samsung.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class MessageController {
    public final MessageService messageService;

    @GetMapping("/book")
    public List<MessageDTO> getAllMessage(){
        List<MessageDTO> collect = messageService.getAll().stream().map(MessageDTO::toDTO).collect(Collectors.toList());
        return collect;
    }

    @PostMapping("/book")
    public MessageDTO insertMessage(){
        return null;
    }
}
