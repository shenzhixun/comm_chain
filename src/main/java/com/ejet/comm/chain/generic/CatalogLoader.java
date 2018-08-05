package com.ejet.comm.chain.generic;

import java.io.File;

import org.apache.commons.chain.Catalog;
import org.apache.commons.chain.config.ConfigParser;
import org.apache.commons.chain.impl.CatalogFactoryBase;
/**
 * 执行链配置
 * 
 * @author ShenYijie
 * @Description: TODO(  )
 * @date 2018年8月6日
 *
 */
public class CatalogLoader {
	
	private final String configFile;
	private ConfigParser parser;
	private Catalog catalog;

	public CatalogLoader(String configfile) {
		this.configFile = configfile;
		parser = new ConfigParser();
	}
	
	public Catalog getCatalog() throws Exception {
		if (catalog == null) {
			if(isFileExist(configFile)){
				java.net.URL url = new File(configFile).toURI().toURL();
				parser.parse(url);
			}
		}
		catalog = CatalogFactoryBase.getInstance().getCatalog();
		return catalog;
	}
	
	public boolean isFileExist(String filePath) {
        if (isBlank(filePath)) {
            return false;
        }

        File file = new File(filePath);
        return (file.exists() && file.isFile());
    }
	
	
	public boolean isBlank(String str) {
		return (str == null || str.trim().length() == 0);
	}
	
	
	

}
