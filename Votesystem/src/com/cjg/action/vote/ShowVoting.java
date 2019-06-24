package com.cjg.action.vote;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.cjg.action.rootaction.VoteRoot;
import com.cjg.domain.Vote;

@SuppressWarnings("serial")
public class ShowVoting extends VoteRoot {
	private static final String VOTECLOSE = "voteclose";

	@Override
	public String execute() throws Exception {
		// ͨ��ͶƱ��Ų���ͶƱ��Ϣ
		Vote vote2 = voteService.findVoteById(voteId);
		// ���publish!=1,˵��ͶƱ״̬Ϊδ����
		if (vote2.getPublish() != 1) {
			return VOTECLOSE;
		} else {
			HttpSession session = ServletActionContext.getRequest()
					.getSession();
			// ���ͶƱ״̬Ϊ���ţ���ͶƱ��Ϣ����session�ġ�vote����
			session.setAttribute("vote2", vote2);
			return SUCCESS;
		}
	}
}
