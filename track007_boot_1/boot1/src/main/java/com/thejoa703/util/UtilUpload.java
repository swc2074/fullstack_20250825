package com.thejoa703.util;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

@Component
public class UtilUpload {
	
	@Value("${resource.path}") private String resourcePath;
	
	public String fileUpload(MultipartFile file) throws IOException {
		UUID uid = UUID.randomUUID();
		String save = uid.toString() + "_" + file.getOriginalFilename();
		
		
		File target = new File(resourcePath, save);
		FileCopyUtils.copy(file.getBytes(), target);
				return save;
		
	}
	

}
