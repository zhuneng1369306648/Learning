package com.cjg.service;

import java.util.List;

import com.cjg.domain.Admin;



public interface AdminService {
	/**
	 * ��������Admin��Ϣ
	 * 
	 * @return Admin��List���ͣ�
	 */
	public List<Admin> findAll();

	/**
	 * ���ӹ���Ա
	 * 
	 * @param admin
	 *            ����Ա��Ϣ
	 */
	public void addAdmin(Admin admin);

	/**
	 * ͨ���û�����������ҹ���Ա
	 * 
	 * @param name
	 *            �û���
	 * @param password
	 *            ����
	 * @return Admin��Admin���ͣ�
	 */
	public Admin findAdmin(String name, String password);

	/**
	 * �޸�����
	 * 
	 * @param admin
	 *            ����Ա��Ϣ
	 */
	public void changepwd(Admin admin);

	/**
	 * �޸ĵ�¼ʱ��
	 * 
	 * @param admin
	 *            ����Ա��Ϣ
	 */
	public void updatelogintime(Admin admin);

	/**
	 * ͨ��Id���ҹ���Ա
	 * 
	 * @param adminId
	 *            ����ԱId
	 * @return Admin��Admin���ͣ�
	 */
	public Admin findNameById(Integer adminId);

	/**
	 * ͨ������Ա�û������ҹ���Ա
	 * 
	 * @param name
	 *            ����Ա�û���
	 * @return admin(Admin����)
	 */
	public Admin findAdminByName(String name);
}
