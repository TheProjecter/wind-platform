from types import *

class CalculateCapacity:

	def __init__(self, ctx, api):
		self.ctx = ctx
		self.model = ctx.instance
		self.api = api

	def execute(self):
		if type(self.model.weight) is NoneType:
			api.warn("airplane.passengerscapacity.weight.required")
			return self.ctx
			
		self.model.capacity = int(self.model.weight / 10)
		api.info("airplane.passengerscapacity.success")
		#self.model.meta.getAttribute("code").getProperties().get("required").setValue("false")
		return self.ctx
