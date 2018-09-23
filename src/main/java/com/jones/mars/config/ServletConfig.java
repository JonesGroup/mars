package com.jones.mars.config;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.jones.mars.util.DateUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

/**
 * @author yue.su
 * @date 2018年3月28日
 */
@Configuration
public class ServletConfig {

	@Bean
	public MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter  () {
		MappingJackson2HttpMessageConverter jsonConverter =
				new MappingJackson2HttpMessageConverter();
		jsonConverter.setSupportedMediaTypes(MediaType.parseMediaTypes("application/hal+json"));
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
		objectMapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
		// objectMapper.registerModule(new Jackson2HalModule());
		objectMapper.setDateFormat(DateUtil.DEFAULT_FORMAT.get());
		jsonConverter.setObjectMapper(objectMapper);
		return jsonConverter;
	}

}
