package uenp.SistemaEspecialista.DTO;

public class CaseRequestDTO {
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

    public CaseRequestDTO(int date, int plant_stand, int precip, int temp, int hail, int crop_hist, int area_damaged,
            int severity, int seed_tmt, int germination, int plant_growth, int leaves, int leafspots_halo,
            int leafspots_marg, int leafspot_size, int leaf_shread, int leaf_malf, int leaf_mild, int stem,
            int lodging, int stem_cankers, int canker_lesion, int fruiting_bodies, int external_decay, int mycelium,
            int int_discolor, int sclerotia, int fruit_pods, int fruit_spots, int seed, int mold_growth,
            int seed_discolor, int seed_size, int shriveling, int roots) {
        this.date = date;
        this.plant_stand = plant_stand;
        this.precip = precip;
        this.temp = temp;
        this.hail = hail;
        this.crop_hist = crop_hist;
        this.area_damaged = area_damaged;
        this.severity = severity;
        this.seed_tmt = seed_tmt;
        this.germination = germination;
        this.plant_growth = plant_growth;
        this.leaves = leaves;
        this.leafspots_halo = leafspots_halo;
        this.leafspots_marg = leafspots_marg;
        this.leafspot_size = leafspot_size;
        this.leaf_shread = leaf_shread;
        this.leaf_malf = leaf_malf;
        this.leaf_mild = leaf_mild;
        this.stem = stem;
        this.lodging = lodging;
        this.stem_cankers = stem_cankers;
        this.canker_lesion = canker_lesion;
        this.fruiting_bodies = fruiting_bodies;
        this.external_decay = external_decay;
        this.mycelium = mycelium;
        this.int_discolor = int_discolor;
        this.sclerotia = sclerotia;
        this.fruit_pods = fruit_pods;
        this.fruit_spots = fruit_spots;
        this.seed = seed;
        this.mold_growth = mold_growth;
        this.seed_discolor = seed_discolor;
        this.seed_size = seed_size;
        this.shriveling = shriveling;
        this.roots = roots;
    }

}
