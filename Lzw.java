package LZW;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class Lzw {

	public static void main(String[] args) throws IOException {
		//Compressed obj = new Compressed();
		//obj.comp("abaabba");
		Decompressed obj = new Decompressed();
		obj.decomp(4);
	}

}
