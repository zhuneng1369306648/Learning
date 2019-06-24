package com.cjg.action.vote;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.cjg.action.rootaction.VoteContextRoot;
import com.cjg.domain.Vote;
import com.cjg.domain.Votecontext;

@SuppressWarnings("serial")
public class ShowVote extends VoteContextRoot {
	private static final String SHOWVOTE = "showvote";

	@SuppressWarnings("unchecked")
	@Override
	public String execute() throws Exception {
		HttpSession session = ServletActionContext.getRequest().getSession();
		// ��session�л��ͶƱ��Ϣ
		Vote vote = (Vote) session.getAttribute("vote");
		// ͨ��ͶƱ��Ų���ͶƱ��ѡ����Ϣ������list
		List<Votecontext> list = voteContextService
				.findVoteContextByVoteId(vote);
		map = new HashMap();
		for (int i = 0; i < list.size(); i++) {
			map.put(list.get(i).getVotecontextId(), list.get(i).getContext());
		}
		setMap(map);
		// ������ͶƱ��ѡ����Ϣ��list����session�ġ�list��
		session.setAttribute("list", list);
		// ��ͶƱ���ͣ�״̬���͵���Ӧҳ��
		// setFlag(flag);
		setType(vote.getType());
		return SHOWVOTE;
	}

}
