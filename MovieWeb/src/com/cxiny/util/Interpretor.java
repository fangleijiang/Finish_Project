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
			interProtorModel.setQueryTypeBanner( "ԭ��") ;
		}
		else if("2".equals(interProtorModel.getQueryTypeBanner())){
			interProtorModel.setQueryTypeBanner( "���Ӿ�") ;
		}
		else if("3".equals(interProtorModel.getQueryTypeBanner())){
			interProtorModel.setQueryTypeBanner( "��Ӱ") ;
		}
		else if("4".equals(interProtorModel.getQueryTypeBanner())){
			interProtorModel.setQueryTypeBanner( "����") ;
		}
		else if("5".equals(interProtorModel.getQueryTypeBanner())){
			interProtorModel.setQueryTypeBanner( "У԰") ;
		}*/
		
		
		
		if(interProtorModel.getQueryTypeField()==null){
			interProtorModel.setQueryTypeField("");
		}
	
		
		
		if(interProtorModel.getQueryTypeType()==null){
			interProtorModel.setQueryTypeType("");
		}/*else if("11".equals(interProtorModel.getQueryTypeType())){
			interProtorModel.setQueryTypeType("����");
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
		/*else if("ԭ��".equals(interProtorModel.getQueryTypeBanner())){
			interProtorModel.setQueryTypeBanner( "1") ;
		}
		else if("���Ӿ�".equals(interProtorModel.getQueryTypeBanner())){
			interProtorModel.setQueryTypeBanner( "2") ;
		}
		else if("��Ӱ".equals(interProtorModel.getQueryTypeBanner())){
			interProtorModel.setQueryTypeBanner( "") ;
		}
		else if("����".equals(interProtorModel.getQueryTypeBanner())){
			interProtorModel.setQueryTypeBanner( "4") ;
		}
		else if("У԰".equals(interProtorModel.getQueryTypeBanner())){
			interProtorModel.setQueryTypeBanner( "5") ;
		}*/
		
		
		
		if(interProtorModel.getQueryTypeField()==null){
			interProtorModel.setQueryTypeField("");
		}
	
		
		
		if(interProtorModel.getQueryTypeType()==null){
			interProtorModel.setQueryTypeType("");
		}/*else if("����".equals(interProtorModel.getQueryTypeType())){
			interProtorModel.setQueryTypeType("11");
		}*/
		
		return interProtorModel;
	}
}