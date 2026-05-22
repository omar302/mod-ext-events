package dev.ot.mod_ext_events.posts.internal;

import java.util.Set;
import java.util.UUID;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dev.ot.mod_ext_events.posts.Platform;
import dev.ot.mod_ext_events.posts.PostCreated;

@Service
public class PostService {

    private final ApplicationEventPublisher events;

    PostService(ApplicationEventPublisher events) {
        this.events = events;
    }

    @Transactional
    Post createPost(String author, String content, Set<Platform> platforms) {
        var post = new Post(UUID.randomUUID(), author, content, platforms);
        events.publishEvent(new PostCreated(post.id(), post.author(), post.content(), post.platforms()));
        return post;
    }

}
