package com.cjg.action.vote;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.cjg.action.rootaction.VoteContextRoot;
import com.cjg.domain.Vote;
import com.cjg.domain.Votecontext;

@SuppressWarnings("serial")
public class NewVoteContext extends VoteContextRoot {

	@Override
	public String execute() throws Exception {
		HttpSession session = ServletActionContext.getRequest().getSession();
		// ��session�л��ͶƱ��Ϣ
		Vote vote = (Vote) session.getAttribute("vote");
		// ��ͶƱ������Ϣ��ӵ����ݿ�
		voteService.addVote(vote);
		Integer vote_id = voteService.findIdByTitle(vote);
		// ��ҳ����ͶƱѡ����Ϣ���������ͣ�
		String[] voteContext = context;
		Votecontext votecontext;
		for (int i = 0; i < voteContext.length; i++) {
			votecontext = new Votecontext();
			votecontext.setVoteId(vote_id);
			votecontext.setContext(voteContext[i]);
			votecontext.setCount(0);
			// ��ͶƱѡ����Ϣ��ӵ����ݿ�
			voteContextService.addVoteContext(votecontext);
		}
		return SUCCESS;
	}

}
