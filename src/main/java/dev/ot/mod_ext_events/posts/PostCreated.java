package dev.ot.mod_ext_events.posts;

import java.util.Set;
import java.util.UUID;

import org.jmolecules.event.annotation.Externalized;

// published to infrastructure outside the application, ie send to kafka
@Externalized("social-posts::#{#this.id()}") 
// event record
public record PostCreated(UUID id, String author, String content, Set<Platform> platforms) {

}
