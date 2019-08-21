package com.retail.store.parser;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonReader;

import com.retail.store.mapper.ProductsMapper;
import com.retail.store.model.Products;

/**
 * The Class ProductsJSONReader.
 */
public class ProductsJSONReader {

	/** The Constant PRODUCTS_DATA_FILE. */
	public static final String PRODUCTS_DATA_FILE = "products.json";

	/**
	 * Reader.
	 *
	 * @return the list
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	public static List<Products> reader() throws IOException {
		FileInputStream m_objFilerStream = new FileInputStream(PRODUCTS_DATA_FILE);
		// create JsonReader object
		JsonReader jsonReader = Json.createReader(m_objFilerStream);
		// get JsonObject from jsonArray
		JsonArray jsonArray = jsonReader.readArray();
		// we can close IO resource and JsonReader now
		jsonReader.close();
		m_objFilerStream.close();
		return ProductsMapper.productsMapper(jsonArray);
	}
}
