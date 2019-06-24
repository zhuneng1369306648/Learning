package com.cjg.action.vote;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.cjg.action.rootaction.VoteRoot;
import com.cjg.domain.Vote;

@SuppressWarnings("serial")
public class UpdateVote extends VoteRoot {

	@Override
	public String execute() throws Exception {
		HttpSession session = ServletActionContext.getRequest().getSession();
		// ��session�л��ͶƱ��Ϣ
		Vote vote = (Vote) session.getAttribute("vote");
		// ���ҳ�������е�ͶƱ���ͼ�ͶƱ״̬�����ݿ�����Ϣ�������������
		if (vote.getType().equals(type) && vote.getPublish().equals(publish)) {
			return SUCCESS;
		} else {
			// ���򣬽�ҳ����������Ϣ���µ����ݿ�
			vote.setType(type);
			vote.setPublish(publish);
			voteService.updateVote(vote);
			return SUCCESS;
		}
	}
}
