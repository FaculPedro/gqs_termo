package br.com.unicuritiba.repositories;

import java.util.ArrayList;

public interface Repository {
	
	public void save(String item);
	
	public void update(String item, int position);
	
	public void delete(String item);
	
	public String get(int position);
	
	public ArrayList<String> getAll();
	
}
