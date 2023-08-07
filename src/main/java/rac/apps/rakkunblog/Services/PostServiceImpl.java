package rac.apps.rakkunblog.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rac.apps.rakkunblog.Entities.Post;
import rac.apps.rakkunblog.Repositories.PostRepository;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private PostRepository postRepository;

    @Override
    public Post postPost(Post post) {
        return postRepository.save(post);
    }

    @Override
    public Post getPost(Long postId) {
        Optional<Post> post = postRepository.findById(postId);
        return post.get();
    }
}
