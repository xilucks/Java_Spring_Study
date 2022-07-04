package hello.siun;

import hello.siun.member.Grade;
import hello.siun.member.Member;
import hello.siun.member.MemberService;
import hello.siun.member.MemberServiceImpl;
import hello.siun.order.Order;
import hello.siun.order.OrderService;
import hello.siun.order.OrderServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OrderApp {
    public static void main(String[] args) {

//        AppConfig appConfig = new AppConfig();
//        MemberService memberService = appConfig.memberService();
//        OrderService orderService = appConfig.orderService();

        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = ac.getBean("memberService", MemberService.class);
        OrderService orderService = ac.getBean("orderService", OrderService.class);

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.joinMember(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);
        System.out.println("or = " + order);
    }
}
