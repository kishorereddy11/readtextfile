package com.mindtree.file.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("students")
public class RestController {

	private ResourceLoader resourceLoader;
	private static final String REMOTE_HOST = "1.1.1.1";
	private static final String USERNAME = "";
	private static final String PASSWORD = "";
	private static final int REMOTE_PORT = 22;
	private static final int SESSION_TIMEOUT = 10000;
	private static final int CHANNEL_TIMEOUT = 5000;

	public void setResourceLoader(ResourceLoader resourceLoader) {
		this.resourceLoader = resourceLoader;
	}

	@GetMapping("/import")
	public String mapReapExcelDatatoDB() throws IOException {

		File file = new File("C:\\Users\\M1054492\\Desktop\\Cape support\\CAPE_PS\\sampletest.txt");

		String content = new String(Files.readAllBytes(file.toPath()));

		return content;
	}
}
