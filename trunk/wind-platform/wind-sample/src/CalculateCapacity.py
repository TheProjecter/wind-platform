from types import *
import time

class CalculateCapacity:

	def __init__(self, ctx, api):
		self.ctx = ctx
		self.model = ctx.instance
		self.api = api

	def execute(self):
		if type(self.model.weight) is NoneType:
			api.warn(self.model.meta, "airplane.passengerscapacity.weight.required", ["Peso"])
			return self.ctx
			
		self.model.capacity = int(self.model.weight / 10)
		api.info(self.model.meta, "airplane.passengerscapacity.success", [])
		#self.model.meta.getAttribute("code").getProperties().get("required").setValue("false")
		
		ctx.monitor.worked(10)
		time.sleep(2)
		ctx.monitor.worked(10)
		time.sleep(2)
		ctx.monitor.worked(10)
		time.sleep(2)
		ctx.monitor.worked(10)
		
		return self.ctx
