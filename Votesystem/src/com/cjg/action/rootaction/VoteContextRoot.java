package com.cjg.action.rootaction;

import java.util.List;
import java.util.Map;



import com.cjg.domain.*;
import com.cjg.service.VoteContextService;
import com.cjg.service.VoteService;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class VoteContextRoot extends ActionSupport {
	/**
	 * @param context
	 *            ��ѡ�����ݣ���������
	 * @param voteId
	 *            ͶƱ���
	 * @param list
	 * @param list2
	 *            ��װͶƱ�����Ϣ
	 * @param votecontextId
	 *            ͶƱ��ѡ����
	 * @param type
	 *            ͶƱ����
	 * @param publish
	 *            �Ƿ񷢲�
	 * @param map
	 *            ��װͶƱѡ���ż�����
	 */
	protected VoteContextService voteContextService;
	protected VoteService voteService;
	protected String[] context;
	protected Integer voteId;
	protected List<VotingInfo> list2;
	protected Integer votecontextId;
	protected Integer type;
	protected Integer publish;
	protected Map map;

	public Integer getPublish() {
		return publish;
	}

	public void setPublish(Integer publish) {
		this.publish = publish;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getVotecontextId() {
		return votecontextId;
	}

	public void setVotecontextId(Integer votecontextId) {
		this.votecontextId = votecontextId;
	}

	public Integer getVoteId() {
		return voteId;
	}

	public void setVoteId(Integer voteId) {
		this.voteId = voteId;
	}

	public String[] getContext() {
		return context;
	}

	public void setContext(String[] context) {
		this.context = context;
	}

	public VoteContextService getVoteContextService() {
		return voteContextService;
	}

	public void setVoteContextService(VoteContextService voteContextService) {
		this.voteContextService = voteContextService;
	}

	public VoteService getVoteService() {
		return voteService;
	}

	public void setVoteService(VoteService voteService) {
		this.voteService = voteService;
	}

	public Map getMap() {
		return map;
	}

	public void setMap(Map map) {
		this.map = map;
	}

	public List<VotingInfo> getList2() {
		return list2;
	}

	public void setList2(List<VotingInfo> list2) {
		this.list2 = list2;
	}

}
