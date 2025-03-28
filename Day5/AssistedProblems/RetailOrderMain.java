class Order {
    String orderId;
    String orderDate;

    Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    String getOrderStatus() {
        return "Order placed on " + orderDate;
    }
}

class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    String getOrderStatus() {
        return "Order shipped. Tracking Number: " + trackingNumber;
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    String getOrderStatus() {
        return "Order delivered on " + deliveryDate;
    }
}

public class RetailOrderMain {
    public static void main(String[] args) {
        Order o = new Order("ORD001", "2025-04-01");
        ShippedOrder s = new ShippedOrder("ORD002", "2025-04-02", "TRK123456");
        DeliveredOrder d = new DeliveredOrder("ORD003", "2025-04-03", "TRK654321", "2025-04-05");

        System.out.println("Order Status 1: " + o.getOrderStatus());
        System.out.println("Order Status 2: " + s.getOrderStatus());
        System.out.println("Order Status 3: " + d.getOrderStatus());
    }
}

