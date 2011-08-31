package br.com.maisha.wind.terra;

import br.com.maisha.wind.terra.TerraInjectorProvider;
import br.com.maisha.wind.terra.terra.Attribute;
import br.com.maisha.wind.terra.terra.DomainObject;
import br.com.maisha.wind.terra.terra.Operation;
import br.com.maisha.wind.terra.terra.OperationProperty;
import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.junit.util.ParseHelper;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@InjectWith(TerraInjectorProvider.class)
@RunWith(XtextRunner.class)
public class TerraParserTest {
  
  @Inject
  private ParseHelper<DomainObject> parser;
  
  @Test
  public void parseDomainmodel() throws Exception {
    {
      DomainObject _parse = this.parser.parse("\n\t\tpackage br.com.maisha.wind.sample.domain;\n\n\t\timport java.util.Date\n\t\t\n\t\tdomain_object AirPlane \"Air Plane\" {\n\t\t\t\n\t\t\tevent_handler: \"evt_hndlr\"\n\t\t\topen_filtering: \"true\"\n\t\t\t\n\t\t\t\n\t\t\tString code \"Code\"{\n\t\t\t\tx: \"1\"\n\t\t\t\ty: \"1\"\n\t\t\t}\n\t\t\t\n\t\t\tInteger capacity \"Passengers Capacity\"{\n\t\t\t\tx: \"1\"\n\t\t\t\ty: \"2\"\n\t\t\t\tvisibleInEdition: ${this.code}\n\t\t\t}\n\t\t\t\n\t\t\tInteger autonomy \"Autonomy\"{\n\t\t\t\tx: \"1\"\n\t\t\t\ty: \"3\"\n\t\t\t\tcolspan: \"1\"\n\t\t\t\tcontent: \"content\"\n\t\t\t\tdisabled: \"true\"\n\t\t\t\tevent: \"evt\"\n\t\t\t\tfolder: \"folder\"\n\t\t\t\tgroup: \"group\"\n\t\t\t\theight: \"10\"\n\t\t\t\ticon: \"icon\"\n\t\t\t\tmanytoone: \"many\"\n\t\t\t\tmask: \"mask\"\n\t\t\t\tmax_length: \"max_l\"\n\t\t\t\tmin_length: \"min_l\"\n\t\t\t\tonetomany: \"one_t_many\"\n\t\t\t\tpresentation_type: \"pres_type\"\n\t\t\t\trange: \"range\"\n\t\t\t\trequired: \"required\"\n\t\t\t\trowspan: \"rowspan\"\n\t\t\t\tsequence: \"seq\"\n\t\t\t\ttoString: \"toS\"\n\t\t\t\ttooltip: \"tooltip\"\n\t\t\t\ttransient: \"transient\"\n\t\t\t\tvalidValues: [\"validValues_0\", \"validValues_1\"]\n\t\t\t\tvalidation: \"val\"\n\t\t\t\tvalue: \"value\"\n\t\t\t\tvisibleInEdition: \"vis\"\n\t\t\t\tvisibleInGrid: \"visG\"\n\t\t\t\twidth: \"w\"\n\t\t\t}\n\t\t\t\n\t\t\t\n\t\t\t\n\t\t\tGroup gpr \"Group\"{\n\t\t\t\tx: \"1\"\n\t\t\t\ty: \"4\"\n\t\t\t}\n\t\t\t\n\t\t\tFolder foldr \"Folder\"{\n\t\t\t\tx: \"1\"\n\t\t\t\ty: \"5\"\n\t\t\t}\n\t\t\t\t \n\t\t\toperation groovy op \"Operation\"{\n\t\t\t\tdisabled: \"false\"\n\t\t\t\tfile: \"file\"\n\t\t\t\ticon: \"ic\"\n\t\t\t\tis_filter: \"is_f\"\n\t\t\t\ttooltip: \"tooltip\"\n\t\t\t\tvalidWhen: \"validWhen\"\n\t\t\t\tvalidate: \"validate\"\n\t\t\t\tvisible: \"vis\"\n\t\t\t}\n\t\t}\n\t\t\n\t\t");
      final DomainObject model = ((DomainObject) _parse);
      String _name = model.getName();
      Assert.assertEquals("AirPlane", _name);
      String _label = model.getLabel();
      Assert.assertEquals("Air Plane", _label);
      EList<Attribute> _attributes = model.getAttributes();
      int _size = _attributes.size();
      Assert.assertEquals(5, _size);
      EList<Attribute> _attributes_1 = model.getAttributes();
      Attribute _get = _attributes_1.get(0);
      final Attribute code = _get;
      EList<Attribute> _attributes_2 = model.getAttributes();
      Attribute _get_1 = _attributes_2.get(1);
      final Attribute capacity = _get_1;
      EList<Attribute> _attributes_3 = model.getAttributes();
      Attribute _get_2 = _attributes_3.get(2);
      final Attribute autonomy = _get_2;
      EList<Attribute> _attributes_4 = model.getAttributes();
      Attribute _get_3 = _attributes_4.get(3);
      final Attribute gpr = _get_3;
      EList<Attribute> _attributes_5 = model.getAttributes();
      Attribute _get_4 = _attributes_5.get(4);
      final Attribute folder = _get_4;
      String _ref = code.getRef();
      Assert.assertEquals("code", _ref);
      String _label_1 = code.getLabel();
      Assert.assertEquals("Code", _label_1);
      String _ref_1 = capacity.getRef();
      Assert.assertEquals("capacity", _ref_1);
      String _label_2 = capacity.getLabel();
      Assert.assertEquals("Passengers Capacity", _label_2);
      String _ref_2 = autonomy.getRef();
      Assert.assertEquals("autonomy", _ref_2);
      String _label_3 = autonomy.getLabel();
      Assert.assertEquals("Autonomy", _label_3);
      String _ref_3 = gpr.getRef();
      Assert.assertEquals("gpr", _ref_3);
      String _label_4 = gpr.getLabel();
      Assert.assertEquals("Group", _label_4);
      String _ref_4 = folder.getRef();
      Assert.assertEquals("foldr", _ref_4);
      String _label_5 = folder.getLabel();
      Assert.assertEquals("Folder", _label_5);
      EList<Operation> _operations = model.getOperations();
      Operation _get_5 = _operations.get(0);
      final Operation op = ((Operation) _get_5);
      String _name_1 = op.getName();
      Assert.assertEquals("op", _name_1);
      String _label_6 = op.getLabel();
      Assert.assertEquals("Operation", _label_6);
      EList<OperationProperty> _properties = op.getProperties();
      int _size_1 = _properties.size();
      Assert.assertEquals(8, _size_1);
    }
  }
}