package com.cjg.action.vote;

import java.util.List;

import com.cjg.action.rootaction.VoteContextRoot;
import com.cjg.domain.Vote;
import com.cjg.domain.Votecontext;

@SuppressWarnings("serial")
public class DelVoteContext extends VoteContextRoot {
	private static final String DELCONTEXTERROR = "delContextError";

	@Override
	public String execute() throws Exception {
		Vote vote = new Vote();
		vote.setVoteId(voteId);
		// ͨ��ͶƱID����ͶƱѡ����Ϣ����װ��list
		List<Votecontext> list = voteContextService
				.findVoteContextByVoteId(vote);
		System.out.println("==========" + list.size());
		// �����ӦĳͶƱID��ͶƱѡ����С�ڻ����2�򲻿ɼ���ɾ��
		if (list.size() > 2) {
			Votecontext voteContext = new Votecontext();
			voteContext.setVotecontextId(votecontextId);
			voteContextService.delVoteContext(voteContext);
			return SUCCESS;
		} else {
			addActionError(getText("lessthantwo"));
			return DELCONTEXTERROR;
		}
	}
}
