/**
 * 
 */
package com.cxiny.util;

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

/**
 * @author cxiny
 *
 */
public class ExportDB {
	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure();
		SchemaExport export = new SchemaExport(cfg);
		export.create(true, true);
		System.out.println("���ݿ⵼���ɹ�");
	}
}
