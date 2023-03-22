package vn.com.cmc.testapi.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "tuyen_xe")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Buses {

    @Id
    @Column(name = "ma_tuyen", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ten_tuyen", nullable = false, length = 50, unique = true)
    private String name;

    @Column(name = "don_gia", nullable = false)
    private BigDecimal price;
}
