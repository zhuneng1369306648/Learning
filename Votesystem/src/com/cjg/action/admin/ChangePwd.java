package com.cjg.action.admin;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.cjg.action.rootaction.AdminRoot;
import com.cjg.domain.Admin;

@SuppressWarnings("serial")
public class ChangePwd extends AdminRoot {
	private static final String PWDERROR = "pwderror";

	@Override
	public String execute() throws Exception {
		HttpSession session = ServletActionContext.getRequest().getSession();
		// ��session��õ�ǰ��¼����Ա��Ϣ
		Admin admin = (Admin) session.getAttribute("admin");
		// �жϾ������Ƿ���ȷ
		if (admin.getPassword().equals(password)) {
			admin.setPassword(newpwd1);
			// ���¹���Ա������Ϣ
			adminService.changepwd(admin);
			return SUCCESS;
		} else
			addActionError(getText("oldpswerror"));
		return PWDERROR;
	}

}
