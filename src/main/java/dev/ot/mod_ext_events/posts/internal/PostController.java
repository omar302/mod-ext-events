package dev.ot.mod_ext_events.posts.internal;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    private final PostService posts;

    PostController(PostService posts) {
        this.posts = posts;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Post create(@RequestBody CreatePostRequest request) {
        return posts.createPost(request.author(), request.content(), request.platforms());
    }
}
