package com.cjg.dao;

import java.util.List;

import com.cjg.domain.Vote;



public interface VoteDao {
	/**
	 * ����ͶƱ����
	 * 
	 * @param vote
	 *            ͶƱ��Ϣ
	 */
	public void addVote(Vote vote);

	/**
	 * ͨ��ͶƱ�������ͶƱ���
	 * 
	 * @param vote
	 *            ͶƱ������Ϣ
	 * @return ͶƱ���
	 */
	public Integer findIdByTitle(Vote vote);

	/**
	 * ��������ͶƱ����
	 * 
	 * @return Vote��List���ͣ�
	 */
	public List<Vote> findVote();

	/**
	 * ͨ��ͶƱ��Ų���ͶƱ����
	 * 
	 * @param voteId
	 *            ͶƱ���
	 * @return Vote��Vote���ͣ�
	 */
	public Vote findVoteById(Integer voteId);

	/**
	 * �޸�ͶƱ��Ϣ
	 * 
	 * @param vote
	 *            ͶƱ��Ϣ
	 */
	public void updateVote(Vote vote);

	/**
	 * ͨ��ͶƱ�������ͶƱ
	 * 
	 * @param vote
	 *            ͶƱ��Ϣ
	 * @return Vote��List���ͣ�
	 */
	public List<Vote> findVoteByTitle(Vote vote);

	/**
	 * ͨ��ͶƱ���Ͳ���ͶƱ��
	 * 
	 * @param type
	 *            ͶƱ����
	 * @return ͶƱ��
	 */
	public Long findVoteCountByType(Integer type);

	/**
	 * ����ͶƱ����
	 * 
	 * @return ͶƱ����
	 */
	public Long findVoteCount();
}
