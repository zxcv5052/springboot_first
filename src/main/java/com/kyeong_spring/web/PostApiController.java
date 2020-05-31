package com.kyeong_spring.web;

import com.kyeong_spring.web.dto.PostsResponseDto;
import com.kyeong_spring.web.dto.PostsSaveRequestDto;
import com.kyeong_spring.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.kyeong_spring.service.posts.PostsService;

@RequiredArgsConstructor
@RestController
public class PostApiController {
    private final PostsService postsService;
    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto)
    {
        return postsService.save(requestDto);
    }

    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id , @RequestBody PostsUpdateRequestDto requestDto){
        return postsService.update(id, requestDto);
    }

    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findById(@PathVariable Long id){
        return postsService.findById(id);
    }

    @DeleteMapping("/api/v1/posts{id}")
    public Long delete(@PathVariable Long id){
        postsService.delete(id);
        return id;
    }
}
