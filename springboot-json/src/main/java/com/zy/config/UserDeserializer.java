package com.zy.config;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.zy.pojo.User;

public class UserDeserializer extends JsonDeserializer<User>{

	@Override
	public User deserialize(JsonParser parser, DeserializationContext context) throws IOException, JsonProcessingException {
		// TODO Auto-generated method stub
		JsonNode node = parser.getCodec().readTree(parser);
		String userName= node.get("user-name").asText();
		User user = new User();
		user.setUserName(userName);
		return user;
	}

}
