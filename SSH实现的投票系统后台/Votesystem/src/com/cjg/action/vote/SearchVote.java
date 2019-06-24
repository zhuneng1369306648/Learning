package com.cjg.action.vote;

import java.util.ArrayList;
import java.util.List;

import com.cjg.action.rootaction.VoteRoot;
import com.cjg.domain.Admin;
import com.cjg.domain.Vote;
import com.cjg.domain.VoteInfo;

@SuppressWarnings("serial")
public class SearchVote extends VoteRoot {
	private static final String SEARCHNULL = "searchnull";

	@SuppressWarnings("unchecked")
	@Override
	public String execute() throws Exception {
		Vote vote = new Vote();
		vote.setTitle(title);
		// ͨ���������ͶƱ��Ϣ
		List<Vote> list = voteService.findVoteByTitle(vote);
		// list==null˵��û�ҵ�
		if (list == null) {
			addActionError(getText("novalidvote"));
			return SEARCHNULL;
		} else {
			list2 = new ArrayList();
			for (int i = 0; i < list.size(); i++) {
				Admin admin = adminService.findNameById(list.get(i)
						.getAdminId());
				VoteInfo vInfo = new VoteInfo();
				// ���ͶƱ��Ϣ��publish==1����ʾͶƱ״̬Ϊ����
				if (list.get(i).getPublish() == 1)
					vInfo.setPublish(getText("open"));
				else
					vInfo.setPublish(getText("close"));
				// ���ͶƱ��Ϣ��type==1����ʾͶƱ����Ϊ��ѡ
				if (list.get(i).getType() == 1)
					vInfo.setType(getText("singgleselect"));
				else
					vInfo.setType(getText("multiselect"));
				vInfo.setAdminname(admin.getName());
				vInfo.setCreatedate(list.get(i).getCreatedate());
				vInfo.setTitle(list.get(i).getTitle());
				vInfo.setVoteId(list.get(i).getVoteId());
				// �����ҳ�ͶƱ��Ϣ��װ��list2
				list2.add(vInfo);
			}
			// ��list2���͵�ҳ��
			setList2(list2);
			return SUCCESS;
		}
	}
}
