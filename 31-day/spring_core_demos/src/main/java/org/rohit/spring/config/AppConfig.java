package org.rohit.spring.config;

import org.rohit.spring.util.FileChecker;
import org.rohit.spring.util.FileUtil;
import org.springframework.context.annotation.Bean;

public class AppConfig {

    @Bean // lifecyle of this FileUtil would be handled by spring IoC container
    public FileUtil util() {
        return new FileUtil();
    }

    @Bean // lifecyle of this FileChecker along with dependency FileUtil, would be handled by Spring IoC container
    public FileChecker checker(FileUtil util) {
        return new FileChecker(util);
    }
}
