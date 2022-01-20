package siun.core.order;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import siun.core.discount.FixDiscountPolicy;
import siun.core.discount.RateDiscountPolicy;
import siun.core.member.Grade;
import siun.core.member.Member;
import siun.core.member.MemoryMemberRepository;

import static org.junit.jupiter.api.Assertions.*;

class OrderServiceImplTest {

    @Test
    void createOrder(){
        MemoryMemberRepository memberRepository = new MemoryMemberRepository();
        memberRepository.save(new Member(1L, "name", Grade.VIP));


        OrderServiceImpl orderService = new OrderServiceImpl(memberRepository, new FixDiscountPolicy());
        Order order = orderService.createOrder(1L, "itemA", 10000);
        org.assertj.core.api.Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }

}