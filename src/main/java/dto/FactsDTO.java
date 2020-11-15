package dto;

/**
 *
 * @author Acer
 */
public class FactsDTO {
    private String cType;
    private String cText;
    private String dType;
    private String dText;

    public FactsDTO(FactDTO cDTO, FactDTO dDTO) {
        this.cType = cDTO.getType();
        this.cText = cDTO.getText();
        this.dType = dDTO.getType();
        this.dText = dDTO.getText();
    }
    
    
    
}
