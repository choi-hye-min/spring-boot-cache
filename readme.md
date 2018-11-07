# Sprign boot Cache Test
참고주소 : https://heowc.github.io/2018/02/05/spring-boot-cache/

```
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.1.0.RELEASE)

2018-11-07 13:04:42.916  INFO 60398 --- [           main] c.e.cachetest.CacheTestApplicationTests  : Starting CacheTestApplicationTests on arthurui-MacBook-Pro.local with PID 60398 (started by arthur in /Users/arthur/IdeaProjects/cache-test)
2018-11-07 13:04:42.918  INFO 60398 --- [           main] c.e.cachetest.CacheTestApplicationTests  : No active profile set, falling back to default profiles: default
2018-11-07 13:04:44.607  INFO 60398 --- [           main] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 'applicationTaskExecutor'
2018-11-07 13:04:45.018  INFO 60398 --- [           main] c.e.cachetest.CacheTestApplicationTests  : Started CacheTestApplicationTests in 2.72 seconds (JVM running for 3.732)
2018-11-07 13:04:48.387  INFO 60398 --- [           main] c.e.cachetest.CacheTestApplicationTests  : 소요시간: 3115ms
2018-11-07 13:04:48.393  INFO 60398 --- [           main] c.e.cachetest.CacheTestApplicationTests  : 소요시간: 1ms
2018-11-07 13:04:51.402  INFO 60398 --- [           main] c.e.cachetest.CacheTestApplicationTests  : 소요시간: 3005ms
2018-11-07 13:04:51.405  INFO 60398 --- [           main] c.e.cachetest.CacheTestApplicationTests  : 소요시간: 1ms
2018-11-07 13:04:51.410  INFO 60398 --- [           main] c.e.cachetest.SimpleBookRepository       : --- cache clear a
2018-11-07 13:04:54.415  INFO 60398 --- [           main] c.e.cachetest.CacheTestApplicationTests  : 소요시간: 3007ms
2018-11-07 13:04:54.420  INFO 60398 --- [       Thread-2] o.s.s.concurrent.ThreadPoolTaskExecutor  : Shutting down ExecutorService 'applicationTaskExecutor'
```