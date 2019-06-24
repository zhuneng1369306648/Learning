package com.cjg.action.admin;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.cjg.action.rootaction.AdminRoot;
import com.cjg.domain.Admin;
import com.cjg.domain.Count;

@SuppressWarnings("serial")
public class Login extends AdminRoot {

	@Override
	public String execute() throws Exception {
		HttpSession session = ServletActionContext.getRequest().getSession();
		if (session.getAttribute("rand") == null) {
			return ERROR;
		}
		// ���ͼ��У����
		String sf = (String) session.getAttribute("rand");
		// ���ͼ��У������ȷ���ж��ʺš������Ƿ���ȷ
		if (sf.equals(safecode)) {
			Admin admin = adminService.findAdmin(name, password);
			if (admin == null) {
				addActionError(getText("loginerror"));
				return ERROR;
			} else {
				// ��admin��Ϣ����session
				session.setAttribute("admin", admin);
				Count count2 = new Count();
				// ���õ�ѡͶƱ����
				count2.setSingleCount(voteService
						.findVoteCountByType(new Integer(1)));
				// ���ö�ѡͶƱ����
				count2.setMultiCount(voteService
						.findVoteCountByType(new Integer(0)));
				// ��������ͶƱ����
				count2.setAllCount(voteService.findVoteCount());
				session.setAttribute("count2", count2);
				// ��õ�ǰϵͳʱ�䲢��ʽ�����������Ա��¼ʱ��
				Date date = Calendar.getInstance().getTime();
				SimpleDateFormat formatter = new SimpleDateFormat(
						"yyyy-MM-dd HH:mm:ss");
				String dateString = formatter.format(date);
				admin.setLogintime(dateString);
				// ���¹���Ա��¼ʱ����Ϣ
				adminService.updatelogintime(admin);
				return SUCCESS;
			}
		} else {
			addActionError(getText("codeerror"));
			return ERROR;
		}
	}
}
