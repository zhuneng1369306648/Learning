package com.cjg.domain;

@SuppressWarnings("serial")
public class Count implements java.io.Serializable{
	/**
	 * @param singleCount
	 *            ��ѡͶƱ�������
	 * @param multiCount
	 *            ��ѡͶƱ�������
	 * @param allCount
	 *            ����ͶƱ�������
	 */
	private Long singleCount;
	private Long multiCount;
	private Long allCount;

	public Long getAllCount() {
		return allCount;
	}

	public void setAllCount(Long allCount) {
		this.allCount = allCount;
	}

	public Long getMultiCount() {
		return multiCount;
	}

	public void setMultiCount(Long multiCount) {
		this.multiCount = multiCount;
	}

	public Long getSingleCount() {
		return singleCount;
	}

	public void setSingleCount(Long singleCount) {
		this.singleCount = singleCount;
	}

}
