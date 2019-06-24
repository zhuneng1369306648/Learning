package com.cjg.action.vote;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.cjg.action.rootaction.VoteContextRoot;
import com.cjg.domain.Vote;
import com.cjg.domain.Votecontext;

@SuppressWarnings("serial")
public class ShowVotingContext extends VoteContextRoot {

	@SuppressWarnings("unchecked")
	@Override
	public String execute() throws Exception {
		HttpSession session = ServletActionContext.getRequest().getSession();
		// ��session�л��ͶƱ��Ϣ����Ҫ��ͶƱ���
		Vote vote = (Vote) session.getAttribute("vote2");
		// ͨ��ͶƱ��Ų��Ҷ�ӦͶƱѡ����Ϣ
		List<Votecontext> list = voteContextService
				.findVoteContextByVoteId(vote);
		map = new HashMap();
		for (int i = 0; i < list.size(); i++) {
			// ��ͶƱѡ���ż����ݴ���map
			map.put(list.get(i).getVotecontextId(), list.get(i).getContext());
		}
		// ��map��ͶƱ���ʹ��͸���Ӧҳ��
		setMap(map);
		setType(vote.getType());
		return SUCCESS;
	}
}
