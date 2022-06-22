package kosta.jiho.restaurant.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@javax.persistence.Table(name = "kosta_order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(
            name = "table_id",
            nullable = false,
            foreignKey = @ForeignKey(name = "FK_TABLE_TB_ORDER")
    )
    private Table table;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(insertable = false, updatable = false)
    private Date orderDate;
    @ManyToOne
    @JoinColumn(
            name = "chief_id",
            nullable = false,
            foreignKey = @ForeignKey(name = "FK_CHIEF_TB_ORDER")
    )
    private Chief chief;
    @OneToMany(mappedBy = "order")
    private List<OrderDetail> orderDetails;
    @Enumerated(EnumType.STRING)
    private State state = State.READY;

    public enum State {
        READY,
        COOKING,
        SERVED,
        DONE,
    }
}
