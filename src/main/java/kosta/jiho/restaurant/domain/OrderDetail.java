package kosta.jiho.restaurant.domain;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;

@Entity
//@JsonIgnoreProperties()
//@JsonIdentityInfo(generator = ObjectIdGenerators)
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(
            name = "order_id",
            nullable = false,
            foreignKey = @ForeignKey(name = "FK_ORDER_TB_ORDER_DETAIL")
    )
    private Order order;
    @ManyToOne
    @JoinColumn(
            name = "dish_id",
            nullable = false,
            foreignKey = @ForeignKey(name = "FK_DISH_TB_ORDER_DETAIL")
    )
    private Dish dish;
    private Short quantity;
}
