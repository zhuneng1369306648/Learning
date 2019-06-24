package com.cjg.action.voter;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.cjg.action.rootaction.VoterRoot;
import com.cjg.domain.Vote;
import com.cjg.domain.Voter;

@SuppressWarnings("serial")
public class AddVoter extends VoterRoot {

	@Override
	public String execute() throws Exception {
		HttpSession session = ServletActionContext.getRequest().getSession();
		// ��session��õ�ǰͶƱ���
		Integer vid = ((Vote) session.getAttribute("vote2")).getVoteId();
		Voter voter = new Voter();
		voter.setIp(getIp());
		voter.setVoteId(vid);
		// ����ǰͶƱ��Ip����ǰͶƱ��Ŵ������ݿ�
		voterService.addVoter(voter);
		return SUCCESS;
	}

}
