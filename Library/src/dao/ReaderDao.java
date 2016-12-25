package dao;
import java.util.List;
import entity.Reader;

public interface ReaderDao {
	public Reader QueryReader(String readerid);
	public List<Reader> QueryReaders(String readerid, String readername);
	public void DeleteReader(Reader reader);
	public void UpdateReader(Reader reader);
}
