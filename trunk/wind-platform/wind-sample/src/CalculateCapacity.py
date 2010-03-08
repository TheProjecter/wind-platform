
class CalculateCapacity:

	def __init__(self, ctx, api):
		self.ctx = ctx
		self.model = ctx.instance
		self.api = api

	def execute(self):
		self.model.capacity = int(self.model.weight / 10)
		api.info("airplane.passengerscapacity.success")
		#self.model.meta.getAttribute("code").getProperties().get("required").setValue("false")
		return self.ctx
