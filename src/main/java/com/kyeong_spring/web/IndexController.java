package com.kyeong_spring.web;

import com.kyeong_spring.config.auth.LoginUser;
import com.kyeong_spring.config.auth.dto.SessionUser;
import com.kyeong_spring.service.posts.PostsService;
import com.kyeong_spring.web.dto.PostsResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpSession;

@RequiredArgsConstructor
@Controller
public class IndexController {
    private final HttpSession httpSession;
    private final PostsService postsService;

    @GetMapping("/")
    public String index(Model model, @LoginUser SessionUser user){
        model.addAttribute("posts",  postsService.findAllDesc());

        if(user != null){
            model.addAttribute("userName", user.getName());
        }
        return "index";
    }

    @GetMapping("/posts/update/{id}")
    public String postsUpdate(@PathVariable Long id, Model model){
        PostsResponseDto dto = postsService.findById(id);
        model.addAttribute("posts", dto);
        return "posts-update";
    }
    @GetMapping("/posts/save")
    public String postsSave(){
        return "posts-save";
    }
}
