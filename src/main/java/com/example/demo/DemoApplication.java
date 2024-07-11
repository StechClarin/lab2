package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
    private static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        logger.info("Spring Boot online shop application started successfully at http://localhost:8080");
    }

    /*@Bean
    public CommandLineRunner demoData(CustomerRepository customerRepository, OrderRepository orderRepository, ProductRepository productRepository, ItemRepository itemRepository) {
        return args -> {
            // Create some customers
            List<Customer> customers = Arrays.asList(
                    Customer.builder()
                            .fullname("Bugs Bunny")
                            .password("New York")
                            .role("user")
                            .balance(59000)
                            .createdAt(LocalDateTime.now())
                            .updatedAt(LocalDateTime.now())
                            .build(),
                    Customer.builder()
                            .fullname("Daffy Duck")
                            .password("Los Angeles")
                            .role("user")
                            .balance(37000)
                            .createdAt(LocalDateTime.now())
                            .updatedAt(LocalDateTime.now())
                            .build(),
                    Customer.builder()
                            .fullname("Porky Pig")
                            .password("Miami")
                            .role("user")
                            .balance(28000)
                            .createdAt(LocalDateTime.now())
                            .updatedAt(LocalDateTime.now())
                            .build()
            );

            customerRepository.saveAll(customers);

            // Create some orders
            List<Order> orders = Arrays.asList(
                    Order.builder()
                            .customer(customers.get(0))
                            .createdAt(LocalDateTime.now())
                            .updatedAt(LocalDateTime.now())
                            .build(),
                    Order.builder()
                            .customer(customers.get(0))
                            .createdAt(LocalDateTime.now())
                            .updatedAt(LocalDateTime.now())
                            .build(),
                    Order.builder()
                            .customer(customers.get(1))
                            .createdAt(LocalDateTime.now())
                            .updatedAt(LocalDateTime.now())
                            .build(),
                    Order.builder()
                            .customer(customers.get(2))
                            .createdAt(LocalDateTime.now())
                            .updatedAt(LocalDateTime.now())
                            .build()
            );

            orderRepository.saveAll(orders);

            // Create some products
            List<Product> products = Arrays.asList(
                    Product.builder()
                            .name("Shirt")
                            .description("Nice shirt")
                            .image("shirt.jpg")
                            .price(200)
                            .createdAt(LocalDateTime.now())
                            .updatedAt(LocalDateTime.now())
                            .build(),
                    Product.builder()
                            .name("Phone")
                            .description("Smartphone")
                            .image("phone.jpg")
                            .price(200)
                            .createdAt(LocalDateTime.now())
                            .updatedAt(LocalDateTime.now())
                            .build(),
                    Product.builder()
                            .name("TV")
                            .description("Smart TV")
                            .image("tv.jpg")
                            .price(300)
                            .createdAt(LocalDateTime.now())
                            .updatedAt(LocalDateTime.now())
                            .build(),
                    Product.builder()
                            .name("Shoes")
                            .description("Running shoes")
                            .image("shoes.jpg")
                            .price(300)
                            .createdAt(LocalDateTime.now())
                            .updatedAt(LocalDateTime.now())
                            .build()
            );

            productRepository.saveAll(products);

            // Create items
            List<Item> items = Arrays.asList(
                    Item.builder()
                            .quantity(2)
                            .price(products.get(0).getPrice())
                            .order(orders.get(0))
                            .product(products.get(0))
                            .createdAt(LocalDateTime.now())
                            .updatedAt(LocalDateTime.now())
                            .build(),
                    Item.builder()
                            .quantity(1)
                            .price(products.get(1).getPrice())
                            .order(orders.get(1))
                            .product(products.get(1))
                            .createdAt(LocalDateTime.now())
                            .updatedAt(LocalDateTime.now())
                            .build(),
                    Item.builder()
                            .quantity(1)
                            .price(products.get(2).getPrice())
                            .order(orders.get(1))
                            .product(products.get(2))
                            .createdAt(LocalDateTime.now())
                            .updatedAt(LocalDateTime.now())
                            .build(),
                    Item.builder()
                            .quantity(1)
                            .price(products.get(3).getPrice())
                            .order(orders.get(1))
                            .product(products.get(3))
                            .createdAt(LocalDateTime.now())
                            .updatedAt(LocalDateTime.now())
                            .build(),
                    Item.builder()
                            .quantity(1)
                            .price(products.get(2).getPrice())
                            .order(orders.get(2))
                            .product(products.get(2))
                            .createdAt(LocalDateTime.now())
                            .updatedAt(LocalDateTime.now())
                            .build(),
                    Item.builder()
                            .quantity(1)
                            .price(products.get(1).getPrice())
                            .order(orders.get(2))
                            .product(products.get(1))
                            .createdAt(LocalDateTime.now())
                            .updatedAt(LocalDateTime.now())
                            .build(),
                    Item.builder()
                            .quantity(1)
                            .price(products.get(3).getPrice())
                            .order(orders.get(2))
                            .product(products.get(3))
                            .createdAt(LocalDateTime.now())
                            .updatedAt(LocalDateTime.now())
                            .build(),
                    Item.builder()
                            .quantity(1)
                            .price(products.get(2).getPrice())
                            .order(orders.get(3))
                            .product(products.get(2))
                            .createdAt(LocalDateTime.now())
                            .updatedAt(LocalDateTime.now())
                            .build(),
                    Item.builder()
                            .quantity(1)
                            .price(products.get(0).getPrice())
                            .order(orders.get(3))
                            .product(products.get(0))
                            .createdAt(LocalDateTime.now())
                            .updatedAt(LocalDateTime.now())
                            .build()
            );

            itemRepository.saveAll(items);

            // Print all orders
            System.out.println("----- All Orders ------");
            for (Order o : orderRepository.findAll()) {
                System.out.println("Order ID: " + o.getId() + " - Total: " + o.getTotal() + "$ - Customer: " + o.getCustomer().getFullname());
                for (Item item : o.getItems()) {
                    System.out.println("\tItem: " + item.getQuantity() + " x " + item.getProduct().getName() + " (" + item.getProduct().getPrice() + "$)");
                }
            }
            System.out.println("-----             ------");
        };
    }*/
}
