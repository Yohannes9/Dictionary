package com.kafi.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class Kitecho  {
	
	private JdbcTemplate jtemplate;
		public JdbcTemplate getJtemplate() {
		return jtemplate;
	}
	public void setJtemplate(JdbcTemplate jtemplate) {
		this.jtemplate = jtemplate;
	}
		public Kitecho() {
			
		}
		public void findAll()
		{	
		}		
		public Words findRecord(String kafi)
		{
		String SQL = "select * from dikshineeri where Kafi = ?";
		Words word=new Words();
	    word = jtemplate.queryForObject(SQL, 
        new Object[]{kafi}, new WordsMapper());
        return word;				
		}
		public void deleteRecord(Words obj)
		{
				
		}
		public void addRecord(Words obj) 
		{
				
			
		}
		public void updateRecord(Words obj)
		{
			
		}
	
}
