package br.com.maisha.wind.serializer;

import br.com.maisha.wind.services.TerraGrammarAccess;
import br.com.maisha.wind.terra.Array;
import br.com.maisha.wind.terra.Attribute;
import br.com.maisha.wind.terra.AttributeProperty;
import br.com.maisha.wind.terra.DomainObject;
import br.com.maisha.wind.terra.Import;
import br.com.maisha.wind.terra.ObjectProperty;
import br.com.maisha.wind.terra.Operation;
import br.com.maisha.wind.terra.OperationProperty;
import br.com.maisha.wind.terra.PackageDeclaration;
import br.com.maisha.wind.terra.TerraPackage;
import br.com.maisha.wind.terra.Validation;
import br.com.maisha.wind.terra.ValidationRule;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("restriction")
public class AbstractTerraSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected TerraGrammarAccess grammarAccess;
	
	@Inject
	protected ISemanticSequencerDiagnosticProvider diagnosticProvider;
	
	@Inject
	protected ITransientValueService transientValues;
	
	@Inject
	@GenericSequencer
	protected Provider<ISemanticSequencer> genericSequencerProvider;
	
	protected ISemanticSequencer genericSequencer;
	
	
	@Override
	public void init(ISemanticSequencer sequencer, ISemanticSequenceAcceptor sequenceAcceptor, Acceptor errorAcceptor) {
		super.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.genericSequencer = genericSequencerProvider.get();
		this.genericSequencer.init(sequencer, sequenceAcceptor, errorAcceptor);
	}
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == TerraPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case TerraPackage.ARRAY:
				if(context == grammarAccess.getArrayRule()) {
					sequence_Array(context, (Array) semanticObject); 
					return; 
				}
				else break;
			case TerraPackage.ATTRIBUTE:
				if(context == grammarAccess.getAttributeRule()) {
					sequence_Attribute(context, (Attribute) semanticObject); 
					return; 
				}
				else break;
			case TerraPackage.ATTRIBUTE_PROPERTY:
				if(context == grammarAccess.getAttributePropertyRule()) {
					sequence_AttributeProperty(context, (AttributeProperty) semanticObject); 
					return; 
				}
				else break;
			case TerraPackage.DOMAIN_OBJECT:
				if(context == grammarAccess.getDomainObjectRule()) {
					sequence_DomainObject(context, (DomainObject) semanticObject); 
					return; 
				}
				else break;
			case TerraPackage.IMPORT:
				if(context == grammarAccess.getImportRule()) {
					sequence_Import(context, (Import) semanticObject); 
					return; 
				}
				else break;
			case TerraPackage.OBJECT_PROPERTY:
				if(context == grammarAccess.getObjectPropertyRule()) {
					sequence_ObjectProperty(context, (ObjectProperty) semanticObject); 
					return; 
				}
				else break;
			case TerraPackage.OPERATION:
				if(context == grammarAccess.getOperationRule()) {
					sequence_Operation(context, (Operation) semanticObject); 
					return; 
				}
				else break;
			case TerraPackage.OPERATION_PROPERTY:
				if(context == grammarAccess.getOperationPropertyRule()) {
					sequence_OperationProperty(context, (OperationProperty) semanticObject); 
					return; 
				}
				else break;
			case TerraPackage.PACKAGE_DECLARATION:
				if(context == grammarAccess.getPackageDeclarationRule()) {
					sequence_PackageDeclaration(context, (PackageDeclaration) semanticObject); 
					return; 
				}
				else break;
			case TerraPackage.VALIDATION:
				if(context == grammarAccess.getValidationRule()) {
					sequence_Validation(context, (Validation) semanticObject); 
					return; 
				}
				else break;
			case TerraPackage.VALIDATION_RULE:
				if(context == grammarAccess.getValidationRuleRule()) {
					sequence_ValidationRule(context, (ValidationRule) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (values+=STRING values+=STRING*)
	 *
	 * Features:
	 *    values[1, *]
	 */
	protected void sequence_Array(EObject context, Array semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=AttributePropertyName (validValues=Array | value=Value | (value=Value validValues=Array)))
	 *
	 * Features:
	 *    name[1, 1]
	 *    validValues[0, 2]
	 *         EXCLUDE_IF_SET value
	 *    value[0, 2]
	 *         EXCLUDE_IF_SET validValues
	 */
	protected void sequence_AttributeProperty(EObject context, AttributeProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=ValidID ref=ValidID label=STRING properties+=AttributeProperty*)
	 *
	 * Features:
	 *    type[1, 1]
	 *    ref[1, 1]
	 *    label[1, 1]
	 *    properties[0, *]
	 */
	protected void sequence_Attribute(EObject context, Attribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         package=PackageDeclaration 
	 *         imports+=Import* 
	 *         name=ValidID 
	 *         label=STRING 
	 *         properties+=ObjectProperty* 
	 *         attributes+=Attribute* 
	 *         operations+=Operation* 
	 *         validations+=Validation*
	 *     )
	 *
	 * Features:
	 *    package[1, 1]
	 *    imports[0, *]
	 *    name[1, 1]
	 *    label[1, 1]
	 *    properties[0, *]
	 *    attributes[0, *]
	 *    operations[0, *]
	 *    validations[0, *]
	 */
	protected void sequence_DomainObject(EObject context, DomainObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     importedNamespace=QualifiedName
	 *
	 * Features:
	 *    importedNamespace[1, 1]
	 */
	protected void sequence_Import(EObject context, Import semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TerraPackage.Literals.IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TerraPackage.Literals.IMPORT__IMPORTED_NAMESPACE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ObjectPropertyName value=Value)
	 *
	 * Features:
	 *    name[1, 1]
	 *    value[1, 1]
	 */
	protected void sequence_ObjectProperty(EObject context, ObjectProperty semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TerraPackage.Literals.OBJECT_PROPERTY__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TerraPackage.Literals.OBJECT_PROPERTY__NAME));
			if(transientValues.isValueTransient(semanticObject, TerraPackage.Literals.OBJECT_PROPERTY__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TerraPackage.Literals.OBJECT_PROPERTY__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getObjectPropertyAccess().getNameObjectPropertyNameEnumRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getObjectPropertyAccess().getValueValueParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=OperationPropertyName (validValues=Array | value=Value))
	 *
	 * Features:
	 *    name[1, 1]
	 *    validValues[0, 1]
	 *         EXCLUDE_IF_SET value
	 *    value[0, 1]
	 *         EXCLUDE_IF_SET validValues
	 */
	protected void sequence_OperationProperty(EObject context, OperationProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=OperationType name=ValidID label=STRING properties+=OperationProperty*)
	 *
	 * Features:
	 *    type[1, 1]
	 *    name[1, 1]
	 *    label[1, 1]
	 *    properties[0, *]
	 */
	protected void sequence_Operation(EObject context, Operation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=QualifiedName
	 *
	 * Features:
	 *    name[1, 1]
	 */
	protected void sequence_PackageDeclaration(EObject context, PackageDeclaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TerraPackage.Literals.PACKAGE_DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TerraPackage.Literals.PACKAGE_DECLARATION__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (messageKey=STRING expression=EXPRESSION)
	 *
	 * Features:
	 *    messageKey[1, 1]
	 *    expression[1, 1]
	 */
	protected void sequence_ValidationRule(EObject context, ValidationRule semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TerraPackage.Literals.VALIDATION_RULE__MESSAGE_KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TerraPackage.Literals.VALIDATION_RULE__MESSAGE_KEY));
			if(transientValues.isValueTransient(semanticObject, TerraPackage.Literals.VALIDATION_RULE__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TerraPackage.Literals.VALIDATION_RULE__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getValidationRuleAccess().getMessageKeySTRINGTerminalRuleCall_0_0(), semanticObject.getMessageKey());
		feeder.accept(grammarAccess.getValidationRuleAccess().getExpressionEXPRESSIONTerminalRuleCall_2_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (ref=ID rules+=ValidationRule*)
	 *
	 * Features:
	 *    ref[1, 1]
	 *    rules[0, *]
	 */
	protected void sequence_Validation(EObject context, Validation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
