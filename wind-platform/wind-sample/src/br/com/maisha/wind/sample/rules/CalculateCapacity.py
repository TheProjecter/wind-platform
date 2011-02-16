from types import *
import time

class CalculateCapacity:

	ctx
	model
	
	def execute(self):
		model.capacity = int(self.model.weight / 10)
		
		ctx.monitor.worked(10)
		time.sleep(2)
		ctx.monitor.worked(10)
		
		time.sleep(2)
		ctx.monitor.worked(10)
