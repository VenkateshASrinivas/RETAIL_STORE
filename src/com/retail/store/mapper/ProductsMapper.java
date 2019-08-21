package com.retail.store.mapper;

import java.io.IOException;
import java.util.List;

import javax.json.JsonArray;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.retail.store.model.Products;

/**
 * The Class ProductsMapper.
 */
public class ProductsMapper {

	/**
	 * Products mapper.
	 *
	 * @param jsonArray
	 *            the json array
	 * @return the list
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	public static List<Products> productsMapper(JsonArray jsonArray) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		return mapper.readValue(jsonArray.toString(), new TypeReference<List<Products>>() {
		});
	}
}
