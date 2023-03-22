package vn.com.cmc.testapi.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "lich_trinh_xe")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BusSchedule implements Serializable {

    @EmbeddedId
    private BusesFK busesFK;

    @Column(name = "ten_tai_xe", length = 30)
    private String driverName;

    @Column(name = "ngay_xuat_ben")
    private Date departureDate;

    @Column(name = "gio_xuat_ben", length = 5)
    private String departureTime;

    @Column(name = "so_luong_hanh_khach")
    private Integer numberOfPassengers;
}
