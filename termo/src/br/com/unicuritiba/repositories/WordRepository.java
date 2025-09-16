package br.com.unicuritiba.repositories;

import java.util.ArrayList;

public class WordRepository implements Repository {
	
	private ArrayList<String> words = new ArrayList<String>();

	@Override
	public void save(String item) {
		words.add(item);
	}

	@Override
	public void update(String item, int position) {
		words.set(position, item);
	}

	@Override
	public void delete(String item) {
		words.remove(item);
	}

	@Override
	public String get(int position) {
		return words.get(position);
	}

	@Override
	public ArrayList<String> getAll() {
		return words;
	}

}
