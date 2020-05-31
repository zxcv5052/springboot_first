package com.kyeong_spring.service.posts;

import com.kyeong_spring.domain.posts.Posts;
import com.kyeong_spring.domain.posts.PostsRepository;
import com.kyeong_spring.web.dto.PostsListResponseDto;
import com.kyeong_spring.web.dto.PostsResponseDto;
import com.kyeong_spring.web.dto.PostsSaveRequestDto;
import com.kyeong_spring.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class PostsService {
    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto requestDto){
        return postsRepository.save(requestDto.toEntity()).getId();
    }

    @Transactional
    public Long update(Long id, PostsUpdateRequestDto requestDto){
        Posts posts = postsRepository.findById(id).orElseThrow(()->new IllegalAccessError("해당 사용자가 존재 하지 않습니다. id =" + id));

        posts.update(requestDto.getTitle(), requestDto.getContent());

        return id;
    }

    public PostsResponseDto findById(Long id)
    {
        Posts entity = postsRepository.findById(id).orElseThrow(()->new IllegalArgumentException("해다 사용자가 없습니다. id ="+id));

        return new PostsResponseDto(entity);
    }

    @Transactional
    public List<PostsListResponseDto> findAllDesc(){
        return postsRepository.findAllDesc().stream()
                .map(PostsListResponseDto::new)
                .collect(Collectors.toList());
    }
}
