package agenda.business;

import agenda.model.AgendaEntity;
import agenda.model.ResponsavelEntity;
import agenda.model.TarefaEntity;
import java.util.List;

/**
 *
 * @author Ibfir
 */
public interface ITarefaBusiness {

    void salvar(TarefaEntity entity) throws Exception;
    
    void remover(TarefaEntity entity);
    
    List<TarefaEntity> listar();
    
    void enviarAlerta();
    
    void salvarAgenda(AgendaEntity agenda);
    
    void removerAgenda(AgendaEntity agenda);
    
    List<AgendaEntity> listarAgenda();
            
    void salvarResponsavel(ResponsavelEntity entity);
            
}
