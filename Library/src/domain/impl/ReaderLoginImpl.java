package domain.impl;

import entity.Reader;
import domain.ReaderLogin;

import dao.ReaderDao;
import dao.impl.ReaderDaoImpl;

public class ReaderLoginImpl implements ReaderLogin{
	
	private ReaderDao readerDao = new ReaderDaoImpl();
	public boolean login(Reader reader){ 
		Reader tmpReader = readerDao.QueryReader(reader.getReaderid());
		if(tmpReader != null && reader.getPassword().equals(tmpReader.getPassword())){
			reader.setReaderid(reader.getReaderid());
			return true;
		}
		return false;
	}
}
