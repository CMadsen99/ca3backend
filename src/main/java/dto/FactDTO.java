
package dto;

/**
 *
 * @author Acer
 */
public class FactDTO {
    private String _id;
    private String text;
    private String updatedAt;
    private String createdAt;
    private String type;

    public FactDTO(String _id, String text, String updatedAt, String createdAt, String type) {
        this._id = _id;
        this.text = text;
        this.updatedAt = updatedAt;
        this.createdAt = createdAt;
        this.type = type;
    }

    
    public String getId() {
        return _id;
    }

    public void setId(String _id) {
        this._id = _id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
    
}
