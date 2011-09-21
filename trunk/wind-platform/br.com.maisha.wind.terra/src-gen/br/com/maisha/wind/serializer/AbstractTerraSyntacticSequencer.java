package br.com.maisha.wind.serializer;

import br.com.maisha.wind.services.TerraGrammarAccess;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("restriction")
public class AbstractTerraSyntacticSequencer extends AbstractSyntacticSequencer {

	protected TerraGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Array___CommaKeyword_3_0_STRINGTerminalRuleCall_3_1__a;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (TerraGrammarAccess) access;
		match_Array___CommaKeyword_3_0_STRINGTerminalRuleCall_3_1__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getArrayAccess().getCommaKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getArrayAccess().getSTRINGTerminalRuleCall_3_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getSTRINGRule())
			return getSTRINGToken(semanticObject, ruleCall, node);
		return "";
	}
	
	protected String getSTRINGToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\"\"";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Array___CommaKeyword_3_0_STRINGTerminalRuleCall_3_1__a.equals(syntax))
				emit_Array___CommaKeyword_3_0_STRINGTerminalRuleCall_3_1__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     (',' STRING)*
	 */
	protected void emit_Array___CommaKeyword_3_0_STRINGTerminalRuleCall_3_1__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
