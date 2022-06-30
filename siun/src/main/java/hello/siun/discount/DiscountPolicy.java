package hello.siun.discount;

import hello.siun.member.Member;

public interface DiscountPolicy {
    int discount(Member member, int price);
}
