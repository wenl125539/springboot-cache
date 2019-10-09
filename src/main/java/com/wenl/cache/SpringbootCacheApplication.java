package com.wenl.cache;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * 快速体验缓存
 *  1.开启基于注解的缓存 @EnableCaching
 *  2.标注缓存注解 即可
 *      @Cacheable 针对方法配置，根据方法的请求参数对其结果进行缓存
 *              cacheNames/Value :指定缓存组件的名字
 *              key:缓存数据使用key 默认使用方法参数的值  可用SpEL表达式
 *              keyGenerator:key的生成器，可以自己指定key的生成器的组件id
 *                  key/keyGenerator二选一
 *              cacheManager:指定缓存管理器，或者cacheResolver指定获取解析器
 *              condition:指定符合条件的情况下才缓存：可用SpEL表达式
 *              unless:与condition相反  满足条件不缓存
 *              sync:是否使用异步模式
 *
 *      @CacheEvict 清空缓存
 *      @CachePut   保证方法被执行并将结果缓存
 *
 *      @Caching (      包含三个注解  组合注解
 *          cacheable = {
 *            @Cacheable（...）
 *            @Cacheable（...）
 *          },
 *          cacheEvict = {
 *              @CacheEvict(...)
 *              @CacheEvict(...)
 *          },
 *          put = {
 *              @CachePut（...）
 *              @CachePut（...）
 *              @CachePut（...）
 *          }
 *      )
 */
@MapperScan("com.wenl.cache.mapper")//指定扫描mapper接口所在的包
@SpringBootApplication
@EnableCaching
public class SpringbootCacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootCacheApplication.class, args);
    }

}
