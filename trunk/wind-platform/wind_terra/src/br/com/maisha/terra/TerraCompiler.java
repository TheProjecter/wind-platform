package br.com.maisha.terra;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.apache.log4j.Logger;

import br.com.maisha.terra.lang.DomainObject;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class TerraCompiler implements ITerraCompiler {

	/** Log ref. */
	private static final Logger log = Logger.getLogger(TerraCompiler.class);

	/**
	 * 
	 * @see br.com.maisha.terra.ITerraCompiler#compile(java.io.File)
	 */
	public DomainObject compile(File f) throws Exception {
		log.debug("Compiling file [" + f.getAbsolutePath() + "]");
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
	private DomainObject getAST(Reader reader) throws IOException, RecognitionException {

		TerraParserParser tokenParser = new TerraParserParser(getTokenStream(reader));
		tokenParser.domain_object();
		DomainObject obj = tokenParser.domainObject;
		log.debug("Domain Object compiled: " + ToStringBuilder.reflectionToString(obj, ToStringStyle.MULTI_LINE_STYLE));
		reader.close();
		return obj;
	}

	/**
	 * 
	 * @param reader
	 * @return
	 * @throws IOException
	 */
	private TokenStream getTokenStream(Reader reader) throws IOException {

		CharStream charstream = new ANTLRReaderStream(reader);
		TerraParserLexer lexer = new TerraParserLexer(charstream);

		TokenStream tokenStream = new CommonTokenStream(lexer);

		return tokenStream;
	}

}
