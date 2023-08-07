package rac.apps.rakkunblog.Controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import rac.apps.rakkunblog.Resources.Post;

@RestController
public class PostController {
    private final AtomicLong postId = new AtomicLong();
    private static final String postContent = "Post contains : %s";
    private final AtomicLong userId = new AtomicLong();
    private static final String postTitle = "Title : %s";

    @GetMapping("/post")
    public Post post(@RequestParam(value = "text", defaultValue = "World") String content) {
        if (postId.get() % 2 == 0)
            return new Post(postId.incrementAndGet(), 500, postTitle, "Baby Rac");
        return new Post(postId.incrementAndGet(), userId.incrementAndGet(), "Rac Daddy",
                String.format(postContent, content));
    }
}
