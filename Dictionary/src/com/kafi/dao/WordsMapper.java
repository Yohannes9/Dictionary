package com.kafi.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class WordsMapper implements RowMapper<Words> {
	public Words mapRow(ResultSet rs, int rowNum) throws SQLException {
		Words word = new Words();
		word.setId(rs.getInt("id"));
		word.setKafi(rs.getString("Kafi"));
		word.setWc(rs.getString("WC"));
		//String in=rs.getString("Amaari");
		//System.out.println(in);
		word.setAmmari(rs.getString("Amaari"));
		
		
		word.setIngliizo(rs.getString("Ingliizo"));
		
		return word;
	}
}
