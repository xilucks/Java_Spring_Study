package hello.siun.order;

import hello.siun.member.Grade;
import hello.siun.member.Member;
import hello.siun.member.MemberService;
import hello.siun.member.MemberServiceImpl;

public class OrderApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.joinMember(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);
        System.out.println("or = " + order);
    }
}
