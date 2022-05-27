package com.samsung.rest.dto;

import com.samsung.domain.Message;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MessageDTO{
    public int id;
    public String message_text;
    public AuthorDTO authorDTO;
    public static MessageDTO toDTO(Message message){
        return new MessageDTO(message.getId(),
                message.getMessage_text(),
                AuthorDTO.toDTO(message.getAuthor()));
    }
}
