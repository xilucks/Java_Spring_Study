package hello.siun;

import hello.siun.discount.DiscountPolicy;
import hello.siun.discount.FixDiscountPolicy;
import hello.siun.discount.RateDiscountPolicy;
import hello.siun.member.MemberRepository;
import hello.siun.member.MemberService;
import hello.siun.member.MemberServiceImpl;
import hello.siun.member.MemoryMemberRepository;
import hello.siun.order.OrderService;
import hello.siun.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public OrderService orderService(){
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    @Bean
    public DiscountPolicy discountPolicy(){
        return new RateDiscountPolicy();
    }
}
