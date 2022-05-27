package com.samsung.service;

import com.samsung.domain.Message;

import java.util.List;

public interface MessageService {
    Message insert(String nameAuthor, String messageText);

    Message update(int id,
            String nameAuthor, String messageText);

    List<Message> getAll();
    Message getById(int id);
    List<Message> getByText(String messageText);
    void deleteById(int id);
}
