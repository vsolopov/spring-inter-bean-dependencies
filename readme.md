Inter bean dependency - the spring dependency is wrapped by CGLib proxy. It allows to cache the internal dependencies and use the same bean on every invocation.

Note: If you use a @Component instead of the @Configuration - you will get "lite beans". (Will be created without proxy and internal dependencies caching). In this way, you can use the "private" access modifier for methods annotated with @Bean.
