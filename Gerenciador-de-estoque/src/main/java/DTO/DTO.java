package DTO;
import lombok.Data;
@Data
public abstract class DTO {
    public String id;    
    public abstract Object builder();
}
