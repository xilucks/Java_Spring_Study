package hello.siun.order;

public interface OrderService {
    Order createOrder(Long memberId, String itemName, int itemPrice);

}
