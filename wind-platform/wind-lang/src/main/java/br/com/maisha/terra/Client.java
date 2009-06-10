package br.com.maisha.terra;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.List;
import java.util.Map;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import br.com.maisha.terra.lang.DomainObject;

public class Client {

	public Map<String, List<DomainObject>> Parse() throws Exception {

		InputStream is = this.getClass().getResourceAsStream("/sample.do");
		Map<String, List<DomainObject>> mem = getAST(new InputStreamReader(is));
		return mem;
	}

	private Map<String, List<DomainObject>> getAST(Reader reader)
			throws IOException, RecognitionException {
		TerraParser tokenParser = new TerraParser(getTokenStream(reader));
		TerraParser.domain_object_return parserResult = tokenParser
				.domain_object();
		Map<String, List<DomainObject>> mem = tokenParser.memory;
		reader.close();
		return tokenParser.memory;
	}

	private CommonTokenStream getTokenStream(Reader reader) throws IOException {
		TerraLexer lexer = new TerraLexer(new ANTLRReaderStream(reader));
		return new CommonTokenStream(lexer);
	}

}
