package Action;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import entity.Reader;
import domain.ReaderLogin;
import domain.impl.ReaderLoginImpl;

public class ReaderLoginAction extends ActionSupport{
	public String login() {
		return SUCCESS;
		
	}
	
}
