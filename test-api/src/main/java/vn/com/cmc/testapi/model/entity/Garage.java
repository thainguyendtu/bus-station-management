package vn.com.cmc.testapi.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "nha_xe")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Garage {

    @Id
    @Column(name = "ma_nha_xe", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToMany(mappedBy = "garage")
    private List<Bus> busList = new ArrayList<>();

    @Column(name = "ten_nha_xe", nullable = false, length = 50, unique = true)
    private String name;

    @Column(name = "nam_thanh_lap", nullable = false)
    private Integer foundedYear;
}
