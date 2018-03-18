package com.proliferay.panelapp.demo.portlet;

import com.proliferay.panelapp.demo.constants.ComProliferayPanelappDemoPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;
//http://www.liferaysavvy.com/2014/03/cross-site-request-forgery-csrf.html
//https://stackoverflow.com/questions/14849127/not-able-to-open-a-portlet-in-liferay-dialog
//http://www.liferay.com/dtd/liferay-portlet-app_7_0_0.dtd
/**
 * @author liferay
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.hidden",
		"com.liferay.portlet.instanceable=true",
		"com.liferay.portlet.add-default-resource=true",
		"javax.portlet.display-name=Pannel APP Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + ComProliferayPanelappDemoPortletKeys.ComProliferayPanelappDemo,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class ComProliferayPanelappDemoPortlet extends MVCPortlet {
}