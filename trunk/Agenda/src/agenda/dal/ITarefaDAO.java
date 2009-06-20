/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package agenda.dal;

import agenda.model.TarefaEntity;
import java.util.List;

/**
 *
 * @author Ibfir
 */
public interface ITarefaDAO {

    void salvar(TarefaEntity entity);
    
    void remover(TarefaEntity entity);
    
    List<TarefaEntity> listarTodas();
    
    List<TarefaEntity> listarTitulo(String titulo);
    
    
    
}
