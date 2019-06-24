package com.zy.config;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.zy.pojo.User;

public class UserSerializer extends JsonSerializer<User>{

	@Override
	public void serialize(User user, JsonGenerator generator, SerializerProvider provider) throws IOException {
		// TODO Auto-generated method stub
		generator.writeStartObject();
		generator.writeStringField("user-name", user.getUserName());
		generator.writeEndObject();
	}

}
