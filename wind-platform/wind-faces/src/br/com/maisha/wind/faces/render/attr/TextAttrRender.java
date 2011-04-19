package br.com.maisha.wind.faces.render.attr;

import org.apache.log4j.Logger;
import org.eclipse.core.databinding.AggregateValidationStatus;
import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.beans.BeansObservables;
import org.eclipse.core.databinding.observable.ChangeEvent;
import org.eclipse.core.databinding.observable.IChangeListener;
import org.eclipse.core.databinding.observable.IObservable;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.databinding.swt.ISWTObservable;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.fieldassist.ControlDecoration;
import org.eclipse.jface.fieldassist.FieldDecoration;
import org.eclipse.jface.fieldassist.FieldDecorationRegistry;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import br.com.maisha.terra.lang.Attribute;
import br.com.maisha.terra.lang.ModelReference;
import br.com.maisha.terra.lang.Property;
import br.com.maisha.terra.lang.Property.PresentationType;
import br.com.maisha.terra.lang.PropertyInfo;
import br.com.maisha.wind.controller.model.UserMessage;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class TextAttrRender extends BaseAttrRender {

	/** Log ref. */
	private static final Logger log = Logger.getLogger(TextAttrRender.class);

	/**
	 * 
	 * @see br.com.maisha.wind.faces.render.attr.IAttributeRender#getPresentationType()
	 */
	public PresentationType getPresentationType() {
		return Property.PresentationType.TEXT;
	}

	/**
	 * 
	 * @see br.com.maisha.wind.faces.render.attr.IAttributeRender#render(br.com.maisha.terra.lang.Attribute,
	 *      org.eclipse.swt.widgets.Composite,
	 *      br.com.maisha.terra.lang.ModelReference)
	 */
	public void render(Attribute attr, Composite parent,
			ModelReference modelInstance) {
		log.debug("Starting render for attr [" + attr + "] ");

		// checkNumColumns(parent, attr);

		Label l = createLabel(parent, attr);

		Text text = new Text(parent, SWT.BORDER | SWT.SINGLE);
		text.setData(attr.getRef());
		
		// tooltip
		String tooltip = attr.getPropertyValue(PropertyInfo.TOOLTIP);
		UserMessage um = new UserMessage(null, tooltip, attr.getDomainObject());
		text.setToolTipText(um.getFormattedMessage());

		Integer maxLength = attr.getPropertyValue(PropertyInfo.MAX_LENGTH);
		if (maxLength != null) {
			text.setTextLimit(maxLength);
		}

		final String mask = attr.getPropertyValue(PropertyInfo.MASK);
		if (mask.trim().length() > 0) {
			/*text.addListener(SWT.Verify, new Listener() {
				
				@Override
				public void handleEvent(Event event) {
					
					log.debug("\n\n@@@ Verify Event");
					MessageFormat mf = new MessageFormat("{0, number, "+mask+"}", new Locale("pt", "BR"));
					
					Number n = null;
					try{
						Object[] doxo = mf.parse(event.text);
						n = (Number) doxo[0];
					}catch(Exception e){
						try {
							n = NumberFormat.getInstance(new Locale("pt", "BR")).parse(event.text);
						} catch (ParseException e1) {
							e1.printStackTrace();
						}
					}
					
					
					String result = mf.format(new Object[]{n});
					
					log.debug("@@@ Evaluated to: " + result +"\n\n");
					((Text)event.widget).setText(result);
					event.doit = false;
					
				}
			});*/
		}

		GridData gd = getLayoutData();
		text.setLayoutData(gd);
		setDimensions(gd, attr);

		setColspan(gd, attr);
		setRowspan(gd, attr);

		text.setEnabled(!attr.getPropertyValue(PropertyInfo.DISABLED));

		// configure common bindings
		final DataBindingContext dbctx = configureDataBindings(text, l, attr);

		// configure value binding
		IObservableValue observable = BeansObservables.observeValue(
				modelInstance, attr.getRef());
		dbctx.bindValue(SWTObservables.observeText(text, SWT.Modify),
				observable);
		
		AggregateValidationStatus ag = new AggregateValidationStatus(dbctx, AggregateValidationStatus.MAX_SEVERITY);
		ag.addChangeListener(new IChangeListener() {
			public void handleChange(ChangeEvent event) {
				IObservable obs = event.getObservable();
				for (Object o : dbctx.getBindings()) {
					Binding binding = (Binding) o;
					IStatus status = (IStatus) binding.getValidationStatus().getValue();
					status.toString();
					
					if(binding.getTarget() instanceof ISWTObservable){
						ISWTObservable swtObservable = (ISWTObservable) binding.getTarget();
						Control control = (Control) swtObservable.getWidget();
						ControlDecoration decoration = new ControlDecoration(control, SWT.RIGHT | SWT.BOTTOM);
						FieldDecoration fieldDecoration = FieldDecorationRegistry
					    .getDefault().getFieldDecoration(
					         FieldDecorationRegistry.DEC_ERROR);
						decoration.setImage(fieldDecoration.getImage());
						decoration.setDescriptionText("Erro!");
					}
				}
			}
		});	
	}
}
