/*
 * generated by Xtext 2.15.0
 */
package xtext.farmbot.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class MyFarmbotAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("xtext/farmbot/parser/antlr/internal/InternalMyFarmbot.tokens");
	}
}
