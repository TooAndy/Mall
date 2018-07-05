package top.aniss.mall.common;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * @author Andre Wei
 * create 2018-07-04 上午8:11
 */
public class TokenCache {
    private static Logger logger = LoggerFactory.getLogger(TokenCache.class);
    public static final String TOKEN_PREFIX = "token_";

    private static LoadingCache<String, String> localCache =
            CacheBuilder.newBuilder().initialCapacity(1000).maximumSize(10000)
                    .expireAfterAccess(10, TimeUnit.MINUTES)
            .build(new CacheLoader<String, String>() {
                // 默认的数据加载实现, 当调用get取值的时候, 如果没有key对应的值, 就调用该方法加载
                @Override
                public String load(String key) {
                    return "null";
                }
            });
    public static void setKey(String key, String value){
        localCache.put(key, value);
    }

    public static String getKey(String key){
        String value;
        try {
            value = localCache.get(key);
            if ("null".equals(value)){
                return null;
            }
            return value;
        } catch (ExecutionException e){
            logger.error("LocalCache Error", e);
        }
        return null;
    }


}
