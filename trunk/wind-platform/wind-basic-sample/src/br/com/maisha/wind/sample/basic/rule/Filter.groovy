import  br.com.maisha.terra.lang.ValidValue;

class Filter{

	def ctx
	def model
	def meta


	def execute(){
		meta.attribute("sexo").getProperty("validValues").addValidValue(new ValidValue("Added"));
	
		def list = ctx.select(meta, "select b from basic b");
		ctx.setGridData(list);
	}
	
	
}