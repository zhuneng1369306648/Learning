package com.cjg.domain;

@SuppressWarnings("serial")
public class VotingInfo implements java.io.Serializable{
	/**
	 * @param context
	 *            ͶƱ��ѡ������
	 * @param count
	 *            ͶƱ��
	 * @param percent
	 *            ������ѡ��ͶƱ��ռ��ͶƱ��������ͶƱ�����ٷֱ�
	 */
	private String context;
	private Integer count;
	private String percent;

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public String getPercent() {
		return percent;
	}

	public void setPercent(String percent) {
		this.percent = percent;
	}
}
