package com.samsung.service;

import com.samsung.domain.Author;
import com.samsung.domain.Message;
import com.samsung.repository.AuthorRepository;
import com.samsung.repository.MessageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MessageServiceImpl implements MessageService {
    private final AuthorRepository authorRepository;
    private final MessageRepository messageRepository;
    @Override
    public Message insert(String nameAuthor, String messageTex) {
        Author author = authorRepository.findByName(nameAuthor);
        if(author == null){
            Author.builder()
                    .name(nameAuthor)
                    .build();
        }
        Message message = Message.builder()
                .message_text(messageTex)
                .author(author)
                .build();
        return messageRepository.save(message);
    }

    @Override
    public Message update(int id, String nameAuthor, String messageText) {
        Author author = Author.builder()
                .name(nameAuthor)
                .build();
        if(author == null) {
            Author.builder()
                    .name(nameAuthor)
                    .build();
        }
        Message message = Message.builder()
                .id(id)
                .message_text(messageText)
                .author(author)
                .build();
        return messageRepository.save(message);
    }

    @Override
    public List<Message> getAll() {
        return messageRepository.findAll();
    }

    @Override
    public Message getById(int id) {
        return messageRepository.getById(id);
    }

    @Override
    public List<Message> getByText(String messageText) {
        return messageRepository.findByName(messageText);
    }

    @Override
    public void deleteById(int id) {
        messageRepository.deleteById(id);
    }
}
