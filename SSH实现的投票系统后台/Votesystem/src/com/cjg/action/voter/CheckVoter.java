package com.cjg.action.voter;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.cjg.action.rootaction.VoterRoot;
import com.cjg.domain.Vote;
import com.cjg.domain.Voter;

@SuppressWarnings("serial")
public class CheckVoter extends VoterRoot {
	private static final String VOTERERROR = "votererror";

	@Override
	public String execute() throws Exception {
		HttpSession session = ServletActionContext.getRequest().getSession();
		// ��session��õ�ǰͶƱ���
		Integer vid = ((Vote) session.getAttribute("vote2")).getVoteId();
		// ��ͶƱ��ż���ǰ�û�Ip����ͶƱ����Ϣ
		String ip = ServletActionContext.getRequest().getRemoteAddr();
		setIp(ip);
		Voter voter = voterService.findVoterByIp(ip, vid);
		// ���Ϊ�գ�˵����ǰͶƱ��δͶ��Ʊ
		if (voter == null)
			return SUCCESS;
		else {
			return VOTERERROR;
		}
	}
}
