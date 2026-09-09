package dev.ykhan.mevsai.config;

import dev.ykhan.mevsai.service.ChatGPTService;
import dev.ykhan.mevsai.service.GoogleSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StartupRunner implements CommandLineRunner {

    @Autowired
    private ChatGPTService chatGPTService;

    @Autowired
    private GoogleSearchService googleSearchService;

    @Override
    public void run(String... args) throws Exception {

    }
}
