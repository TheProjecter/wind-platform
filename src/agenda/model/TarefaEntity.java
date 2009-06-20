package agenda.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Ibfir
 */
@Entity
@SequenceGenerator(name = "tarefa_entity_seq", initialValue = 1, allocationSize=1, sequenceName="tarefa_seq")
public class TarefaEntity implements Serializable{

    @Id
    @Column(name="pk_tarefa")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tarefa_entity_seq")
    private long id;
    
    @Column(length = 80, nullable = false)
    private String titulo;
    
    @Column(name="col_data_inicio")
    @Temporal(value = TemporalType.DATE)
    private Date inicio;
    
    @Column
    @Temporal(value = TemporalType.DATE)
    private Date fim;
    
    @Column
    private boolean alerta;
    
    @Column(length = 800, nullable = false)
    private String descricao;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="fk_agenda")
    private AgendaEntity agenda;
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="fk_responsavel")
    private ResponsavelEntity responsavel;
    
    public boolean isAlerta() {
        return alerta;
    }

    public void setAlerta(boolean alerta) {
        this.alerta = alerta;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getFim() {
        return fim;
    }

    public void setFim(Date fim) {
        this.fim = fim;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public AgendaEntity getAgenda() {
        return agenda;
    }

    public void setAgenda(AgendaEntity agenda) {
        this.agenda = agenda;
    }

    public ResponsavelEntity getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(ResponsavelEntity responsavel) {
        this.responsavel = responsavel;
    }
    
    

    
    
}
