package br.com.maisha.wind.controller.listener;

import br.com.maisha.terra.lang.ModelReference;
import br.com.maisha.wind.controller.model.ExecutionContext;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 *
 */
public interface DomainObjectEventHandler {

	/**
	 * 
	 * @param ctx
	 * @return
	 */
	ExecutionContext<ModelReference> beforeObjectOpen(ExecutionContext<ModelReference> ctx);

	/**
	 * 
	 * @param ctx
	 * @return
	 */
	ExecutionContext<ModelReference> afterObjectOpen(ExecutionContext<ModelReference> ctx);

	/**
	 * 
	 * @param ctx
	 * @return
	 */
	ExecutionContext<ModelReference> beforeObjectClose(ExecutionContext<ModelReference> ctx);

	/**
	 * 
	 * @param ctx
	 * @return
	 */
	ExecutionContext<ModelReference> afterObjectClose(ExecutionContext<ModelReference> ctx);

}
