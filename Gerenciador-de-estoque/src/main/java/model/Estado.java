/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Data
@Getter @Setter @NoArgsConstructor
public class Estado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeEstado;
    private String siglaEstado;
    
    public Estado(String nomeEstado, String siglaEstado) {
        this.nomeEstado = nomeEstado;
        this.siglaEstado = siglaEstado;
    }
    
    @Override
    public String toString() {
        return "model.Estado[ id=" + id + " ]";
    }
    
}
