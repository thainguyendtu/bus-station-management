package vn.com.cmc.testapi.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "loai_xe")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BusRange {

    @Id
    @Column(name = "ma_loai_xe", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToMany(mappedBy = "busRange")
    private List<Bus> busList = new ArrayList<>();

    @Column(name = "mo_ta_loai_xe", nullable = false, length = 1000)
    private String description;

    @Column(name = "so_luong_cho_ngoi", nullable = false)
    private Integer numberOfSeats;
}
