package br.com.maisha.terra;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;
import java.util.Map;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import br.com.maisha.terra.lang.TerraClass;

public class Client {

	public static void main(String[] args) throws IOException,
			RecognitionException {
		new Client().processFile(args[0]);

	}

	private void processFile(String filePath) throws IOException,
			RecognitionException {
		Map<String, List<TerraClass>> mem = getAST(new FileReader(filePath));
		System.out.println(mem);
	}

	private Map<String, List<TerraClass>> getAST(Reader reader) throws IOException,
			RecognitionException {
		TerraParser tokenParser = new TerraParser(getTokenStream(reader));
		TerraParser.domain_object_return parserResult = tokenParser
				.domain_object();
		Map<String, List<TerraClass>> mem = tokenParser.memory;
		reader.close();
		return tokenParser.memory;
	}

	private CommonTokenStream getTokenStream(Reader reader) throws IOException {
		TerraLexer lexer = new TerraLexer(new ANTLRReaderStream(reader));
		return new CommonTokenStream(lexer);
	}

}
