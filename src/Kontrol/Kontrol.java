package Kontrol;

import Koneksi.Koneksi;
import java.awt.Event;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.metainfo.ZkInfo;
import org.zkoss.zk.ui.util.GenericComposer;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Textbox;


public class Kontrol extends GenericForwardComposer{
	private float temporaryValue;
	 private Textbox textInput;
	 private int currentOperator;
	 
	 @Override
	 public void doAfterCompose(Component comp) throws Exception {
	  super.doAfterCompose(comp);
	 Connection();
	 }
	 

	 //public void onClick$test(org.zkoss.zk.ui.event.Event event){
	  //textInput.setText(textInput.getText() + "Connection");
	 //}

	 public void Connection()throws Exception{
	     try {
	     Koneksi conn = new Koneksi();
	     if (conn.getConnection()==null){
	         textInput.setText(textInput.getText() + "Not Connection");
	     }else{
	          textInput.setText(textInput.getText() + "Connection");
	     }
	     } catch (Exception e) {
	      textInput.setText(textInput.getText() + "Driver Not Connection");
	     }
	 }

}
