package com.cjg.domain;

@SuppressWarnings("serial")
public class VoteInfo implements java.io.Serializable{
	/**
	 * @param voteId
	 *            ����
	 * @param title
	 *            ͶƱ����
	 * @param createdate
	 *            ͶƱ����ʱ��
	 * @param publish
	 *            �Ƿ񿪷ű�ʶ
	 * @param type
	 *            ͶƱ����
	 * @param adminname
	 *            ͶƱ�������û���
	 */
	private Integer voteId;
	private String title;
	private String createdate;
	private String publish;
	private String type;
	private String adminname;

	public String getAdminname() {
		return adminname;
	}

	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}

	public String getCreatedate() {
		return createdate;
	}

	public void setCreatedate(String createdate) {
		this.createdate = createdate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getVoteId() {
		return voteId;
	}

	public void setVoteId(Integer voteId) {
		this.voteId = voteId;
	}

	public String getPublish() {
		return publish;
	}

	public void setPublish(String publish) {
		this.publish = publish;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
