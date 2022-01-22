package siun.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import siun.core.discount.DiscountPolicy;
import siun.core.discount.FixDiscountPolicy;
import siun.core.discount.RateDiscountPolicy;
import siun.core.member.MemberService;
import siun.core.member.MemberServiceImpl;
import siun.core.member.MemoryMemberRepository;
import siun.core.order.OrderService;
import siun.core.order.OrderServiceImpl;

@Configuration
public class AppConfig {
    //어플리케이션 전체를 설정하고 구성
    //설정 정보, 구성 정보
    //Test
    @Bean
    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public MemoryMemberRepository memberRepository() {
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
