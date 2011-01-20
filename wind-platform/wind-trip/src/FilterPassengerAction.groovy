import org.osgi.framework.BundleContext;


class FilterPassengerAction{

	def ctx
	def api
	def model

	FilterPassengerAction(ctx, api){
		this.ctx = ctx
		this.api = api
		this.model = ctx.instance
	}
	
	Object execute(){
		
		ctx.setGridData(api.filter("trip_control", model, "from passenger p where p.name = :name ", "Paulo Freitas"));
				
		return ctx
	}
	
	
}