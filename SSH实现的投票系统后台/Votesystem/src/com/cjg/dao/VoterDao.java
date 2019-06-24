package com.cjg.dao;

import com.cjg.domain.Voter;

public interface VoterDao {
	/**
	 * ����ͶƱ����Ϣ
	 * @param voter ͶƱ����Ϣ
	 */
	public void addVoter(Voter voter);
	/**
	 * ͨ��IP��ͶƱ��Ų���ͶƱ��
	 * @param ip IP
	 * @param voteId ͶƱ���
	 * @return Voter��Voter���ͣ�
	 */
	public Voter findVoterByIp(String ip,Integer voteId);
}
