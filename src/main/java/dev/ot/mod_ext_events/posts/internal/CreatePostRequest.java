package dev.ot.mod_ext_events.posts.internal;

import java.util.Set;

import dev.ot.mod_ext_events.posts.Platform;

public record CreatePostRequest(String author, String content, Set<Platform> platforms) {

}
