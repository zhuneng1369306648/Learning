package com.cjg.dao;

import java.util.List;

import com.cjg.domain.Vote;
import com.cjg.domain.Votecontext;



public interface VoteContextDao {
	/**
	 * ���ͶƱѡ����Ϣ
	 * @param voteContext ͶƱѡ����Ϣ
	 */
	public void addVoteContext(Votecontext voteContext);
	/**
	 * ͨ��ͶƱ��Ų���ͶƱѡ��
	 * @param vote ͶƱ��Ϣ
	 * @return Votecontext��List���ͣ�
	 */
	public List<Votecontext> findVoteContextByVoteId(Vote vote);
	/**
	 * ɾ��ָ����һ��ͶƱѡ����Ϣ
	 * @param voteContext ͶƱѡ����Ϣ
	 */
	public void delVoteContext(Votecontext voteContext);
	/**
	 * ����һ��ͶƱѡ����Ϣ
	 * @param voteContext ͶƱѡ����Ϣ
	 */
	public void addOneVoteContext(Votecontext voteContext);
	/**
	 * ����ͶƱѡ����Ϣ
	 * @param voteContext ͶƱѡ����Ϣ
	 */
	public void updateVoteContext(Votecontext voteContext);
	/**
	 * ͨ��ͶƱѡ���Ų���ͶƱѡ����Ϣ
	 * @param voteContext ͶƱѡ����Ϣ
	 * @return Votecontext��Votecontext���ͣ�
	 */
	public Votecontext findVCCountByVCId(Votecontext voteContext);
	/**
	 * ͨ��ͶƱ��Ų��Ҷ�Ӧ�ñ������ͶƱ��
	 * @param voteId ͶƱ���
	 * @return ͶƱ��
	 */
	public Long findTotalCountByVoteId(Integer voteId);
}
