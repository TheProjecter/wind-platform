from types import *
import time

class CalculateCapacity:

	def __init__(self, ctx, api):
		self.ctx = ctx
		self.model = ctx.instance
		self.api = api

	def execute(self):
		self.model.capacity = int(self.model.weight / 10)
		
		#self.model.meta.getAttribute("code").getProperties().get("required").setValue("false")
		
		ctx.monitor.worked(10)
		time.sleep(2)
		ctx.monitor.worked(10)
		
		#api.save("flight_control", self.model)
		
		time.sleep(2)
		ctx.monitor.worked(10)
		time.sleep(2)
		ctx.monitor.worked(10)
		
		api.info(self.model.meta, "airplane.passengerscapacity.success", [])
		return self.ctx
