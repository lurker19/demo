/**
������
*/
CREATE TABLE t_house_rent(
rid INT AUTO_INCREMENT PRIMARY KEY ,
lid INT NOT NULL , -- ������ID
rtitle VARCHAR(50) NOT NULL , -- ����
rprice INT DEFAULT 0 ,			-- �۸�
rarea INT DEFAULT 0 ,			-- ���
rpositon VARCHAR(100) NOT NULL ,-- λ��
rdate datetime ,  -- ��������
rpicture VARCHAR(200) ,			-- ͼƬ
rremarks VARCHAR(100)  		-- ��ע
);