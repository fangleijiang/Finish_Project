/**
 * 
 */
package com.cxiny.util;

/**
 * @author cxiny
 *
 */
public class Interpretor {
	
	public InterPretorModel getInterpretor(InterPretorModel interProtorModel){

		
		if(interProtorModel.getQueryName()==null){
			interProtorModel.setQueryName("");
		}
		
		
		if(interProtorModel.getQueryRole()==null){
			interProtorModel.setQueryRole("");
		}
		
		
		
		
		if(interProtorModel.getQueryTypeBanner()==null){
			interProtorModel.setQueryTypeBanner( "");
		}
		/*else if("1".equals(interProtorModel.getQueryTypeBanner())){
			interProtorModel.setQueryTypeBanner( "原创") ;
		}
		else if("2".equals(interProtorModel.getQueryTypeBanner())){
			interProtorModel.setQueryTypeBanner( "电视剧") ;
		}
		else if("3".equals(interProtorModel.getQueryTypeBanner())){
			interProtorModel.setQueryTypeBanner( "电影") ;
		}
		else if("4".equals(interProtorModel.getQueryTypeBanner())){
			interProtorModel.setQueryTypeBanner( "综艺") ;
		}
		else if("5".equals(interProtorModel.getQueryTypeBanner())){
			interProtorModel.setQueryTypeBanner( "校园") ;
		}*/
		
		
		
		if(interProtorModel.getQueryTypeField()==null){
			interProtorModel.setQueryTypeField("");
		}
	
		
		
		if(interProtorModel.getQueryTypeType()==null){
			interProtorModel.setQueryTypeType("");
		}/*else if("11".equals(interProtorModel.getQueryTypeType())){
			interProtorModel.setQueryTypeType("剧情");
		}*/
		
		return interProtorModel;
	}
	
	public InterPretorModel setInterpretor(InterPretorModel interProtorModel){

		
		if(interProtorModel.getQueryName()==null){
			interProtorModel.setQueryName("");
		}
		
		
		if(interProtorModel.getQueryRole()==null){
			interProtorModel.setQueryRole("");
		}
		
		
		
		
		if(interProtorModel.getQueryTypeBanner()==null){
			interProtorModel.setQueryTypeBanner("");
		}
		/*else if("原创".equals(interProtorModel.getQueryTypeBanner())){
			interProtorModel.setQueryTypeBanner( "1") ;
		}
		else if("电视剧".equals(interProtorModel.getQueryTypeBanner())){
			interProtorModel.setQueryTypeBanner( "2") ;
		}
		else if("电影".equals(interProtorModel.getQueryTypeBanner())){
			interProtorModel.setQueryTypeBanner( "") ;
		}
		else if("综艺".equals(interProtorModel.getQueryTypeBanner())){
			interProtorModel.setQueryTypeBanner( "4") ;
		}
		else if("校园".equals(interProtorModel.getQueryTypeBanner())){
			interProtorModel.setQueryTypeBanner( "5") ;
		}*/
		
		
		
		if(interProtorModel.getQueryTypeField()==null){
			interProtorModel.setQueryTypeField("");
		}
	
		
		
		if(interProtorModel.getQueryTypeType()==null){
			interProtorModel.setQueryTypeType("");
		}/*else if("剧情".equals(interProtorModel.getQueryTypeType())){
			interProtorModel.setQueryTypeType("11");
		}*/
		
		return interProtorModel;
	}
}