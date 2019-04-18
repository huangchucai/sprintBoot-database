package hello.services;

import org.springframework.stereotype.Component;

import javax.inject.Inject;
@Component
public class OrderService {
    private UserService userService;
    // 依赖注入  OrderService 依赖于 UserService
    @Inject
    public OrderService(UserService userService) {
        this.userService = userService;
    }

    public void placeOrder(Integer userId, String item) {
        userService.getUserById(userId);
    }
}
