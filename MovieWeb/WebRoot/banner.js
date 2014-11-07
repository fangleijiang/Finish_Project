
imgUrl1="/MovieWeb/images/1.jpg";
imgtext1="01";
imgLink1=escape("/MovieWeb/customer/player.jsp");
imgUrl2="/MovieWeb/images/2.jpg";
imgtext2="02";
imgLink2=escape("/MovieWeb/customer/player.jsp");
imgUrl3="/MovieWeb/images/3.jpg";
imgtext3="03";
imgLink3=escape("/MovieWeb/customer/player.jsp");
imgUrl4="/MovieWeb/images/4.jpg";
imgtext4="04";
imgLink4=escape("/MovieWeb/customer/player.jsp");
imgUrl5="/MovieWeb/images/5.jpg";
imgtext5="05";
imgLink5=escape("/MovieWeb/customer/player.jsp");


 var focus_width=550;
 var focus_height=300;
 var text_height=0;
 var swf_height = focus_height+text_height;
 
 var pics=imgUrl1+"|"+imgUrl2+"|"+imgUrl3+"|"+imgUrl4+"|"+imgUrl5;
 var links=imgLink1+"|"+imgLink2+"|"+imgLink3+"|"+imgLink4+"|"+imgLink5;
 var texts=imgtext1+"|"+imgtext2+"|"+imgtext3+"|"+imgtext4+"|"+imgtext5;
 
 document.write('<object classid="clsid:d27cdb6e-ae6d-11cf-96b8-444553540000" codebase="http://fpdownload.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=6,0,0,0" width="'+ focus_width +'" height="'+ swf_height +'">');
 document.write('<param name="allowScriptAccess" value="sameDomain"><param name="movie" value="focus.swf"><param name="quality" value="high"><param name="bgcolor" value="#F0F0F0">');
 document.write('<param name="menu" value="false"><param name=wmode value="opaque">');
 document.write('<param name="FlashVars" value="pics='+pics+'&links='+links+'&texts='+texts+'&borderwidth='+focus_width+'&borderheight='+focus_height+'&textheight='+text_height+'">');
 document.write('<embed src="pixviewer.swf" wmode="opaque" FlashVars="pics='+pics+'&links='+links+'&texts='+texts+'&borderwidth='+focus_width+'&borderheight='+focus_height+'&textheight='+text_height+'" menu="false" bgcolor="#F0F0F0" quality="high" width="'+ focus_width +'" height="'+ focus_height +'" allowScriptAccess="sameDomain" type="application/x-shockwave-flash" pluginspage="http://www.macromedia.com/go/getflashplayer" />');  document.write('</object>');