package uenp.SistemaEspecialista.DTO;

public class CaseResponseDTO {
    private String praga;
    private String descricao;
    private Float similaridade;

    public CaseResponseDTO(String praga, String descricao, Float similaridade) {
        this.praga = praga;
        this.descricao = descricao;
        this.similaridade = similaridade;
    }

    public String getPraga() {
        return praga;
    }

    public String getDescricao() {
        return descricao;
    }

    public Float getSimilaridade() {
        return similaridade;
    }
}
