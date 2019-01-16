/*
 * generated by Xtext 2.15.0
 */
package xtext.farmbot.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import xtext.farmbot.parser.antlr.internal.InternalMyFarmbotParser;
import xtext.farmbot.services.MyFarmbotGrammarAccess;

public class MyFarmbotParser extends AbstractAntlrParser {

	@Inject
	private MyFarmbotGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalMyFarmbotParser createParser(XtextTokenStream stream) {
		return new InternalMyFarmbotParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Farmbot";
	}

	public MyFarmbotGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyFarmbotGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
