package agenda.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author Paulo Freitas (pfreitas1@gmail.com)
 */
@Entity
@Table(name="tb_responsavel")
@SequenceGenerator(name="responsavel_entity_seq", sequenceName="responsavel_seq", 
allocationSize=1, initialValue=1)
public class ResponsavelEntity {

    @Id
    @Column(name="pk_responsavel")
    @GeneratedValue(generator="responsavel_entity_seq", 
    strategy=GenerationType.SEQUENCE)
    private long id;
    
    @Column(length=80, nullable=false)
    private String nome;
    
    @OneToMany(mappedBy="responsavel", cascade=CascadeType.ALL)
    private Set<TarefaEntity> tarefas = 
            new HashSet<TarefaEntity>();
    
    @Column(length=60)
    private String email;
    
    @Column
    private boolean recebeAlerta;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isRecebeAlerta() {
        return recebeAlerta;
    }

    public void setRecebeAlerta(boolean recebeAlerta) {
        this.recebeAlerta = recebeAlerta;
    }

    public Set<TarefaEntity> getTarefas() {
        return tarefas;
    }

    public void setTarefas(Set<TarefaEntity> tarefas) {
        this.tarefas = tarefas;
    }
    
    
    
}
