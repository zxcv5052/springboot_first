package com.kyeong_spring.web.dto;

import com.kyeong_spring.domain.posts.Posts;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class PostsListResponseDto {

    private Long id;
    private String title;
    private String content;
    private LocalDateTime modifiedDate;

    public PostsListResponseDto(Posts entitiy){
        this.id = entitiy.getId();
        this.title = entitiy.getTitle();
        this.content = entitiy.getContent();
        this.modifiedDate = entitiy.getModifiedDate();
    }
}
