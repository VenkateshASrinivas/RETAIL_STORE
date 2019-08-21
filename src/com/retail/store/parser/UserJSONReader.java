package com.retail.store.parser;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonReader;

import com.retail.store.mapper.UserMapper;
import com.retail.store.model.User;

/**
 * The Class UserJSONReader.
 */
public class UserJSONReader {

	/** The Constant USER_DATA_FILE. */
	public static final String USER_DATA_FILE = "user.json";

	/**
	 * Reader.
	 *
	 * @return the list
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	public static List<User> reader() throws IOException {
		FileInputStream m_objFilerStream = new FileInputStream(USER_DATA_FILE);
		// create JsonReader object
		JsonReader jsonReader = Json.createReader(m_objFilerStream);
		// get JsonObject from jsonArray
		JsonArray jsonArray = jsonReader.readArray();
		jsonReader.close();
		m_objFilerStream.close();
		return UserMapper.userMapper(jsonArray);
	}

}
