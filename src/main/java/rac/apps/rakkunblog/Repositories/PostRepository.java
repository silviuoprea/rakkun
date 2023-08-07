package rac.apps.rakkunblog.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import rac.apps.rakkunblog.Entities.Post;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {

}
