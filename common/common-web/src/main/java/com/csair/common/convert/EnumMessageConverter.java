package com.csair.common.convert;

import java.io.IOException;
import java.lang.reflect.Type;

import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.GenericHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;

public class EnumMessageConverter extends AbstractHttpMessageConverter<Enum<?>> implements GenericHttpMessageConverter<Enum<?>>{

	@Override
	protected boolean supports(Class<?> clazz) {
		return true;
	}

	@Override
	protected Enum<?> readInternal(Class<? extends Enum<?>> clazz, HttpInputMessage inputMessage)
			throws IOException, HttpMessageNotReadableException {
		return null;
	}

	@Override
	protected void writeInternal(Enum<?> t, HttpOutputMessage outputMessage)
			throws IOException, HttpMessageNotWritableException {
		
	}

	@Override
	public boolean canRead(Type type, Class<?> contextClass, MediaType mediaType) {
		 return super.canRead(contextClass, mediaType);
	}

	@Override
	public Enum<?> read(Type type, Class<?> contextClass, HttpInputMessage inputMessage)
			throws IOException, HttpMessageNotReadableException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean canWrite(Type type, Class<?> contextClass, MediaType mediaType) {
		 return super.canWrite(contextClass, mediaType);
	}

	@Override
	public void write(Enum<?> t, Type type, MediaType contentType, HttpOutputMessage outputMessage)
			throws IOException, HttpMessageNotWritableException {
		// TODO Auto-generated method stub
		
	}



}
