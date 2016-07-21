package org.usesoft.gwtrestapp.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;

public class gwtrestapp implements EntryPoint {

	public void onModuleLoad() {
		// TODO Auto-generated method stub
		Label totoLab = new Label("coucou");
		RootPanel.get().add(totoLab);
	}

}
