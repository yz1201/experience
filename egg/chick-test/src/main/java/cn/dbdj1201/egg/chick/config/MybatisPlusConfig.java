package cn.dbdj1201.egg.chick.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: yz1201
 * @Date: 2021/4/25 20:51
 */
@Configuration
@MapperScan({"cn.dbdj1201.egg.chick.dao"})
public class MybatisPlusConfig {

    /**
     * mybatis-plus的分页插件
     *
     * @return P
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }

}
