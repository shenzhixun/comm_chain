package com.ejet.comm.chain.generic;

import org.apache.commons.chain.Context;
import org.apache.commons.chain.Filter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * Filter的执行execute的顺序与Filter出现在Chain中出现的位置一致，
 * 但是执行postprocess顺序与之相反。
 * 
 * 如果连续定义了filter1和filter2，那么execute的执行顺序是：filter1 -> filter2；
 * 
 * 而postprocess的执行顺序是：filter2 -> filter1。
 * 
 * @author ejet
 *
 */
public abstract class CommandBase implements Filter {
	
	protected static Logger Log = LoggerFactory.getLogger(CommandBase.class);
	/**
	 * 如果返回true，那么表示Chain的处理结束, Chain中的其他命令不会被调用；
	 */
	public abstract boolean execute(Context context) throws Exception;
	/**
	 * 
	 * Commons Chain会在执行了Filter的execute方法之后，执行postprocess（不论Chain以何种方式结束）
	 * 
	 */
	public abstract boolean postprocess(Context context, Exception exception);
	
}
