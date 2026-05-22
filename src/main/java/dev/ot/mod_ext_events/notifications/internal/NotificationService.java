package dev.ot.mod_ext_events.notifications.internal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.modulith.events.ApplicationModuleListener;
import org.springframework.stereotype.Component;

import dev.ot.mod_ext_events.posts.PostCreated;

@Component
public class NotificationService {

    private static final Logger log = LoggerFactory.getLogger(NotificationService.class);

    @ApplicationModuleListener
    void on(PostCreated event) {
        log.info("Notifying admins: new post {} by {}", event.id(), event.author());
    }
}
