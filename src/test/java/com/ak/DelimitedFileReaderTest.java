package com.ak;

import java.io.IOException;
import java.io.Reader;
import java.io.UncheckedIOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.junit.Test;

public class DelimitedFileReaderTest {

	@Test
	public void readsRecords(){
		this.createFileReader().evalOutDatedVersions();
	}

	private DelimitedFileReader createFileReader(){
		try{
			final Path path = Paths.get("src/main/resources", "input.txt");
			final Reader reader = Files.newBufferedReader(path, Charset.forName("UTF-8"));
			return new DelimitedFileReader(reader, ",");
		}catch(final IOException e){
			throw new UncheckedIOException(e);
		}
	}
}
