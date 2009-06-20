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
 * TODO javadoc
 * @author Paulo Freitas (pfreitas1@gmail.com)
 */
@Entity
@Table(name="tb_agenda")
@SequenceGenerator(name="agenda_entity_seq", sequenceName="agenda_seq", 
allocationSize=1, initialValue=1)
public class AgendaEntity {

    @Id
    @Column(name="pk_agenda")
    @GeneratedValue(generator="agenda_entity_seq", 
    strategy=GenerationType.SEQUENCE)
    private long id;
    
    @Column(length=80, nullable=false)
    private String nome;
    
    @Column(length=40, nullable=false)
    private String tipo;

    @OneToMany(mappedBy="agenda", cascade=CascadeType.ALL)
    private Set<TarefaEntity> tarefas = 
            new HashSet<TarefaEntity>();

    public Set<TarefaEntity> getTarefas() {
        return tarefas;
    }

    public void setTarefas(Set<TarefaEntity> tarefas) {
        this.tarefas = tarefas;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String toString(){
        return this.getNome();
    }
    
}
