package com.kyeong_spring.web.dto;

import com.kyeong_spring.domain.posts.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class PostsUpdateRequestDto {
    private String content;
    private String title;
    private String author;
    public PostsUpdateRequestDto(Posts entity){
        this.content = entity.getContent();
        this.title = entity.getTitle();
        this.author = entity.getAuthor();
    }
    @Builder
    public PostsUpdateRequestDto(String title, String content, String author)
    {
        this.title = title;
        this.content = content;
        this.author = author;
    }
}
