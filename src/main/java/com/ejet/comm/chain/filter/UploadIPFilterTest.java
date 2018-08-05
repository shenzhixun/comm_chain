package com.ejet.comm.chain.filter;

import org.apache.commons.chain.Context;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ejet.comm.chain.generic.CommandBase;

public class UploadIPFilterTest extends CommandBase {
	
	private static final Logger log = LoggerFactory.getLogger(UploadIPFilterTest.class);
	/**
	 * 返回false ： 则继续  true: 则直接返回，不执行下面链条
	 */
	@Override
	public boolean execute(Context context) throws Exception {
		try{
			
			
		}catch(Exception e) {
			log.error("上传IP数据错误, Error:", e);
		}
		return false;
	}
	
	@Override
	public boolean postprocess(Context context, Exception exception) {
		//发送消息
		return true;
	}
	
	
}
