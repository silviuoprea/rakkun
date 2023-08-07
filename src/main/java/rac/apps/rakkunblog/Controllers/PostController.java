package rac.apps.rakkunblog.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import rac.apps.rakkunblog.Entities.Post;
import rac.apps.rakkunblog.Services.PostService;

@RestController
public class PostController {

    @Autowired
    private PostService postService;

    @PostMapping("/add/")
    public Post postPost(@RequestBody Post post) {
        return postService.postPost(post);
    }

    @GetMapping("/post/{postId}")
    public Post getPost(@PathVariable("postId") Long postId) {
        return postService.getPost(postId);
    }
}
