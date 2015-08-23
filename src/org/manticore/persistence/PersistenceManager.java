package org.manticore.persistence;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

import org.apache.commons.io.FileUtils;
import org.manticore.model.User;

import com.google.gson.Gson;

public class PersistenceManager {
	private static PersistenceManager instance = new PersistenceManager();
	private String dbFileName = "db.json";
	private Gson gson = new Gson();
	
	public static PersistenceManager getInstance() {
		return instance;
	}
	public void createUser(User u) throws IOException {
		String json = gson.toJson(u);
		FileUtils.write(new File(dbFileName), json);
	}
}