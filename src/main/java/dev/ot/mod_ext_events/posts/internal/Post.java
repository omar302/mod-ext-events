package dev.ot.mod_ext_events.posts.internal;

import java.util.Set;
import java.util.UUID;

import dev.ot.mod_ext_events.posts.Platform;

public record Post(UUID id, String author, String content, Set<Platform> platforms) {
}
