package siun.core.order;

import siun.core.member.Grade;
import siun.core.member.Member;
import siun.core.member.MemberService;
import siun.core.member.MemberServiceImpl;

import java.util.Arrays;

public class OrderApp {

    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);

        System.out.println("order = " + order);
    }
}
