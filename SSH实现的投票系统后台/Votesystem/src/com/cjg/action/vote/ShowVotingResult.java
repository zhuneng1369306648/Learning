package com.cjg.action.vote;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.cjg.action.rootaction.VoteContextRoot;
import com.cjg.domain.Vote;
import com.cjg.domain.Votecontext;
import com.cjg.domain.VotingInfo;

@SuppressWarnings("serial")
public class ShowVotingResult extends VoteContextRoot {

	@SuppressWarnings("unchecked")
	@Override
	public String execute() throws Exception {
		HttpSession session = ServletActionContext.getRequest().getSession();
		list2 = new ArrayList();
		// ��session���ͶƱ���
		Integer vid = ((Vote) session.getAttribute("vote2")).getVoteId();
		// �����ݿ��ѯ�õ���ӦͶƱ�����ͶƱ��
		Long totalcount = voteContextService.findTotalCountByVoteId(vid);
		// ��ͶƱ������session�ġ�totalcount��
		session.setAttribute("totalcount", totalcount);
		Vote vote = new Vote();
		vote.setVoteId(vid);
		// ͨ��ͶƱ��Ų��Ҷ�Ӧ�ñ�ŵ���ѡ������
		List<Votecontext> list = voteContextService
				.findVoteContextByVoteId(vote);
		for (int i = 0; i < list.size(); i++) {
			// �����ѡ��ͶƱ�����������ռ����ѡ���ӦͶƱ����Ʊ���İٷֱ�
			Integer count = list.get(i).getCount();
			BigDecimal bd = new BigDecimal((double) count / totalcount);
			double per = bd.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
			NumberFormat percentFormat = NumberFormat.getPercentInstance();
			String percent = percentFormat.format(per);
			VotingInfo votingInfo = new VotingInfo();
			// ������ѡ������
			votingInfo.setContext(list.get(i).getContext());
			votingInfo.setCount(count);
			// ���ðٷֱ�
			votingInfo.setPercent(percent);
			list2.add(votingInfo);
		}
		setList2(list2);
		return SUCCESS;
	}
}
