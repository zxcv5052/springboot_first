package com.kyeong_spring.web.dto;

import com.kyeong_spring.domain.posts.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsSaveRequestDto {
    private String title;
    private String content;
    private String author;

    @Builder
    public PostsSaveRequestDto(String title, String content, String author)
    {
        this.title = title;
        this.content = content;
        this.author = author;
    }
    public Posts toEntity()
    {
        return Posts.builder()
                .title(title)
                .author(author)
                .content(content)
                .build();
    }
}
