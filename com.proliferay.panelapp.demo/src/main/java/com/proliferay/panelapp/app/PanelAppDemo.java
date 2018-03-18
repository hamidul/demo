package com.proliferay.panelapp.app;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.application.list.BasePanelApp;
import com.liferay.application.list.PanelApp;
import com.liferay.application.list.constants.PanelCategoryKeys;
import com.liferay.portal.kernel.model.Portlet;
import com.proliferay.panelapp.demo.constants.ComProliferayPanelappDemoPortletKeys;

@Component(
	    immediate = true,
	    property = {
	        "panel.app.order:Integer=200",
	        "panel.category.key=" + PanelCategoryKeys.CONTROL_PANEL_USERS
	    },
	    service = PanelApp.class
	)

public class PanelAppDemo extends BasePanelApp{

	@Override
	public String getPortletId() {
		
		return ComProliferayPanelappDemoPortletKeys.ComProliferayPanelappDemo;
	}
	
	

	@Override
	    @Reference(
	        target = "(javax.portlet.name=" + ComProliferayPanelappDemoPortletKeys.ComProliferayPanelappDemo+ ")",
	        unbind = "-"
	    )
	    public void setPortlet(Portlet portlet) {
	        super.setPortlet(portlet);
	    }

}
