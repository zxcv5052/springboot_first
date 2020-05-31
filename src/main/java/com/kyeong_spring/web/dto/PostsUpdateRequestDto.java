package com.kyeong_spring.web.dto;

import com.kyeong_spring.domain.posts.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class PostsUpdateRequestDto {
    private String content;
    private String title;
    public PostsUpdateRequestDto(Posts entity){
        this.content = entity.getContent();
        this.title = entity.getTitle();
    }
    @Builder
    public PostsUpdateRequestDto(String title, String content)
    {
        this.title = title;
        this.content = content;
    }
}
