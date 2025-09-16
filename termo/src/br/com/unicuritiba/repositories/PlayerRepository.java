package br.com.unicuritiba.repositories;

import java.util.ArrayList;

public class PlayerRepository implements Repository {
	
	private ArrayList<String> players = new ArrayList<String>();

	@Override
	public void save(String item) {
		players.add(item);
	}

	@Override
	public void update(String item, int position) {
		players.set(position, item);
	}

	@Override
	public void delete(String item) {
		players.remove(item);
	}

	@Override
	public String get(int position) {
		return players.get(position);
	}

	@Override
	public ArrayList<String> getAll() {
		return players;
	}

}
