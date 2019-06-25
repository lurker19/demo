/**
发布表
*/
CREATE TABLE t_house_rent(
rid INT AUTO_INCREMENT PRIMARY KEY ,
lid INT NOT NULL , -- 发布者ID
rtitle VARCHAR(50) NOT NULL , -- 标题
rprice INT DEFAULT 0 ,			-- 价格
rarea INT DEFAULT 0 ,			-- 面积
rpositon VARCHAR(100) NOT NULL ,-- 位置
rdate datetime ,  -- 发布日期
rpicture VARCHAR(200) ,			-- 图片
rremarks VARCHAR(100)  		-- 备注
);