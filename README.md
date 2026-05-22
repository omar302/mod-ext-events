# mod-ext-events

## packages
Spring Web,
Spring Modulith,
Spring Data JDBC,
PostgreSQL Driver,
Docker Compose Support,
Spring for Apache Kafka

## test
$ curl -X POST http://localhost:8080/api/posts   -H 'Content-Type: application/json'   -d '{
    "author": "dan",
    "content": "hello modulith",
    "platforms": ["TWITTER", "LINKEDIN", "BLUESKY"]
  }'

## output

Notifying admins: new post 83ece2d0-cf3f-41af-852a-c59c6d96377c by dan

Kafka [social-posts] key=83ece2d0-cf3f-41af-852a-c59c6d96377c value={"id":"83ece2d0-cf3f-41af-852a-c59c6d96377c","author":"dan","content":"hello modulith","platforms":["TWITTER","LINKEDIN","BLUESKY"]}