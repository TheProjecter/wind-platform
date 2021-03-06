package br.com.maisha.terra;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import br.com.maisha.terra.lang.DomainObject;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class TerraCompiler implements ITerraCompiler {

	/**
	 * 
	 * @see br.com.maisha.terra.ITerraCompiler#compile(java.io.File)
	 */
	public DomainObject compile(File f) throws Exception {
		InputStream is = new FileInputStream(f);
		return compile(is);
	}

	/**
	 * 
	 * @see br.com.maisha.terra.ITerraCompiler#compile(java.io.InputStream)
	 */
	public DomainObject compile(InputStream is) throws Exception {
		return getAST(new InputStreamReader(is));
	}

	/**
	 * 
	 * @param reader
	 * @return
	 * @throws IOException
	 * @throws RecognitionException
	 */
	private DomainObject getAST(Reader reader) throws IOException,
			RecognitionException {
		TerraParser tokenParser = new TerraParser(getTokenStream(reader));
		tokenParser.domain_object();
		DomainObject obj = tokenParser.domainObject;
		reader.close();
		return obj;
	}

	/**
	 * 
	 * @param reader
	 * @return
	 * @throws IOException
	 */
	private CommonTokenStream getTokenStream(Reader reader) throws IOException {
		TerraLexer lexer = new TerraLexer(new ANTLRReaderStream(reader));
		return new CommonTokenStream(lexer);
	}

}
