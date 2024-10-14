package hello.hellospring;

import hello.hellospring.repository.MemberRepository;
import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    private final MemberRepository memberRepository;

    @Autowired
    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository);
    }
}

 /*   @Bean
    public TimeTraceAop timeTraceAop() {
        return new TimeTraceAop();
    }*/

    // 이거 하는 대신 @Component 를 TimeTraceAop에 주입하였다. 동일하게 사용가능.


   // @Bean
    //public MemberRepository memberRepository() {
       // return new MemoryMemberRepository();
       // return new JdbcMemberRepository(dataSource);
       //  return new JdbcTemplateMemberRepository(dataSource);
       // return new JpaMemberRepository(em);
   // }
