package vn.com.cmc.testapi.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "xe")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Bus {

    @Id
    @Column(name = "ma_xe", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "ma_loai_xe", nullable = false)
    private BusRange busRange;

    @ManyToOne
    @JoinColumn(name = "ma_nha_xe", nullable = false)
    private Garage garage;

    @Column(name = "hang_san_xuat", nullable = false, length = 20)
    private String vehicleCompany;

    @Column(name = "bien_so", nullable = false, length = 10)
    private String licensePlate;

    @Column(name = "han_kiem_dinh", nullable = false)
    private Date inspectionTerm;
}
