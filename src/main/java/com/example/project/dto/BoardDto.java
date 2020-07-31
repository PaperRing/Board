package com.example.project.dto;

import com.example.project.domain.entity.BoardEntity;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class BoardDto {

    private Long id;
    private String writer;
    private String title;
    private String content;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedData;

    public BoardEntity toEntity() {
        return BoardEntity.builder()
                .id(id)
                .writer(writer)
                .title(title)
                .content(content)
                .build();
    }

    @Builder
    public BoardDto(Long id, String title, String writer, String content, LocalDateTime createdDate,
                    LocalDateTime modifiedData) {
        this.id = id;
        this.writer = writer;
        this.title = title;
        this.content = content;
        this.createdDate = createdDate;
        this.modifiedData = modifiedData;
    }
}
