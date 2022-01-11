package siun.core;

import siun.core.discount.DiscountPolicy;
import siun.core.discount.FixDiscountPolicy;
import siun.core.discount.RateDiscountPolicy;
import siun.core.member.MemberService;
import siun.core.member.MemberServiceImpl;
import siun.core.member.MemoryMemberRepository;
import siun.core.order.OrderService;
import siun.core.order.OrderServiceImpl;

public class AppConfig {
    //어플리케이션 전체를 설정하고 구성

    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository());
    }

    private MemoryMemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    public OrderService orderService(){
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    public DiscountPolicy discountPolicy(){
        return new RateDiscountPolicy();
    }


}
