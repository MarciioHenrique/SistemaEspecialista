package uenp.SistemaEspecialista.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Cases")
public class Case {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String prague;
    private int date;
    private int plant_stand;
    private int precip;
    private int temp;
    private int hail;
    private int crop_hist;
    private int area_damaged;
    private int severity;
    private int seed_tmt;
    private int germination;
    private int plant_growth;
    private int leaves;
    private int leafspots_halo;
    private int leafspots_marg;
    private int leafspot_size;
    private int leaf_shread;
    private int leaf_malf;
    private int leaf_mild;
    private int stem;
    private int lodging;
    private int stem_cankers;
    private int canker_lesion;
    private int fruiting_bodies;
    private int external_decay;
    private int mycelium;
    private int int_discolor;
    private int sclerotia;
    private int fruit_pods;
    private int fruit_spots;
    private int seed;
    private int mold_growth;
    private int seed_discolor;
    private int seed_size;
    private int shriveling;
    private int roots;
}
