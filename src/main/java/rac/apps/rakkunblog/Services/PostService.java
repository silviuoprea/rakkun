package rac.apps.rakkunblog.Services;

import rac.apps.rakkunblog.Entities.Post;

public interface PostService {
    Post postPost(Post post);

    Post getPost(Long postId);
}
