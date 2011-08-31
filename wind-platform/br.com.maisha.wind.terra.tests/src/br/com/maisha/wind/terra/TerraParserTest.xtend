package br.com.maisha.wind.terra

import org.eclipse.xtext.junit4.InjectWith
import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.XtextRunner
import br.com.maisha.wind.terra.terra.DomainModel
import com.google.inject.Inject
import org.eclipse.xtext.junit.util.ParseHelper
import org.junit.Test
import br.com.maisha.wind.terra.terra.AbstractElement
import br.com.maisha.wind.terra.terra.DomainObject
import org.junit.Assert
import br.com.maisha.wind.terra.terra.Attribute
import br.com.maisha.wind.terra.terra.Operation

@InjectWith(typeof(TerraInjectorProvider))
@RunWith(typeof(XtextRunner))
class TerraParserTest {
	
	
	@Inject
	ParseHelper<DomainObject> parser
	
	
	@Test
	def void parseDomainmodel() {
		val model = parser.parse("
		package br.com.maisha.wind.sample.domain;

		import java.util.Date
		
		domain_object AirPlane \"Air Plane\" {
			
			event_handler: \"evt_hndlr\"
			open_filtering: \"true\"
			
			
			String code \"Code\"{
				x: \"1\"
				y: \"1\"
			}
			
			Integer capacity \"Passengers Capacity\"{
				x: \"1\"
				y: \"2\"
				visibleInEdition: ${this.code}
			}
			
			Integer autonomy \"Autonomy\"{
				x: \"1\"
				y: \"3\"
				colspan: \"1\"
				content: \"content\"
				disabled: \"true\"
				event: \"evt\"
				folder: \"folder\"
				group: \"group\"
				height: \"10\"
				icon: \"icon\"
				manytoone: \"many\"
				mask: \"mask\"
				max_length: \"max_l\"
				min_length: \"min_l\"
				onetomany: \"one_t_many\"
				presentation_type: \"pres_type\"
				range: \"range\"
				required: \"required\"
				rowspan: \"rowspan\"
				sequence: \"seq\"
				toString: \"toS\"
				tooltip: \"tooltip\"
				transient: \"transient\"
				validValues: [\"validValues_0\", \"validValues_1\"]
				validation: \"val\"
				value: \"value\"
				visibleInEdition: \"vis\"
				visibleInGrid: \"visG\"
				width: \"w\"
			}
			
			
			
			Group gpr \"Group\"{
				x: \"1\"
				y: \"4\"
			}
			
			Folder foldr \"Folder\"{
				x: \"1\"
				y: \"5\"
			}
				 
			operation groovy op \"Operation\"{
				disabled: \"false\"
				file: \"file\"
				icon: \"ic\"
				is_filter: \"is_f\"
				tooltip: \"tooltip\"
				validWhen: \"validWhen\"
				validate: \"validate\"
				visible: \"vis\"
			}
		}
		
		") as DomainObject;
			
		
		// check dmo	
		Assert::assertEquals("AirPlane", model.name)
		Assert::assertEquals("Air Plane", model.label)
		
		
		// check attrs
		Assert::assertEquals(5, model.attributes.size)
		val code = model.attributes.get(0);
		val capacity = model.attributes.get(1);
		val autonomy = model.attributes.get(2);
		val gpr = model.attributes.get(3);
		val folder = model.attributes.get(4);
		
		Assert::assertEquals("code", code.ref)
		Assert::assertEquals("Code", code.label)
		
		Assert::assertEquals("capacity", capacity.ref)
		Assert::assertEquals("Passengers Capacity", capacity.label)
		
		Assert::assertEquals("autonomy", autonomy.ref)
		Assert::assertEquals("Autonomy", autonomy.label)
		
		Assert::assertEquals("gpr", gpr.ref)
		Assert::assertEquals("Group", gpr.label)
		
		Assert::assertEquals("foldr", folder.ref)
		Assert::assertEquals("Folder", folder.label)
		
		// check operations
		val op = model.operations.get(0) as Operation;
		Assert::assertEquals("op", op.name)
		Assert::assertEquals("Operation", op.label)
		Assert::assertEquals(8, op.properties.size)
		
	}
	
}