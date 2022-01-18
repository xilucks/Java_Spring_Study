package siun.core.discount;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import siun.core.member.Grade;
import siun.core.member.Member;

@Component
public class RateDiscountPolicy implements DiscountPolicy{
    private int discountPercent = 10;


    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP){
            return price * discountPercent /100;
        }else{
            return 0;
        }
    }
}
