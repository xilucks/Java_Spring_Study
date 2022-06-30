package hello.siun.order;

import hello.siun.discount.DiscountPolicy;
import hello.siun.discount.FixDiscountPolicy;
import hello.siun.member.Member;
import hello.siun.member.MemberRepository;
import hello.siun.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService{
    
    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();
    
    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
