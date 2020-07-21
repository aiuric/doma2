package com.qcells.gradledoma2;

import com.qcells.gradledoma2.service.HttpManagingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 예전에는 @Configuration을 사용해서 JavaConfig용 클래스임을 컴파일러에 알리고
// @Bean을 사용하여 Bean 생성 method에 붙이며 생성된 Bean을 등록함

@SpringBootApplication
// @SpringBootApplication은 @ComponentScan, @EnableAutoConfiguration을 이미 포함

// @ComponentScan: 이 클래스의 패키지 내부에 있는
//   @Component
//   @Configuration
//   @Repository
//   @Service
//   @Controller
//   @RestController
// 붙은 class 검색하여 Bean으로 등록

// @EnableAutoConfiguration: spring-boot-autoconfigure > META-INF > spring.factories에
// 정의된 데이터를 읽어서 자바 설정 파일(@Configuration)들을 Bean으로 등록

public class GradleDoma2Application implements CommandLineRunner {

    // field injection is not recommended
    // static 이면 field injection도 안됨!
    //@Autowired
    //HttpManagingService service;

    final HttpManagingService httpManagingservice;

    // constructor injection (DI container가 알아서 주입)
    @Autowired
    public GradleDoma2Application(HttpManagingService httpManagingservice) {
        this.httpManagingservice = httpManagingservice;
    }

    public static void main(String[] args) {
        SpringApplication.run(GradleDoma2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        httpManagingservice.printMessage(args);
    }

}
