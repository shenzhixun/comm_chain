package com.ejet.comm.chain.filter;

import org.apache.commons.chain.Context;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ejet.comm.chain.generic.CommandBase;


public class MailSenderFilterTest extends CommandBase {
	
	private static final Logger log = LoggerFactory.getLogger(MailSenderFilterTest.class);
	
	/**
	 * 返回false ： 则继续  true: 则直接返回，不执行下面链条
	 */
	@Override
	public boolean execute(Context context) throws Exception {
		log.info("======== 邮件通知消息 =========");
		try{
			
		}catch(Exception e) {
			//miResponse = new MiMessage("2000", "解析消息内容错误, Error:" + MiUtil.getError(e));
		}
		return false;
	}
	
	@Override
	public boolean postprocess(Context context, Exception exception) {
		// TODO Auto-generated method stub
		//发送消息
		
		return true;
	}
	
	
}
