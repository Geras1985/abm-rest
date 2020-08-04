package am.abm.abm.enities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name = "Orders")
public class Order extends Base {


    private Date orderDate;

    @ManyToOne
    @JoinColumn(name="employee_Id", nullable = false)
    Employee employee;

    @ManyToOne
    @JoinColumn(name="user_Id", nullable = false)
    User user;

    @ManyToOne
    @JoinColumn(name="shipper_Id", nullable = false)
    Shipper shipper;

    public Order() {}
}
