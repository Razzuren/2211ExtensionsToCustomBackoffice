/*
 * Copyright (c) 2020 SAP SE or an SAP affiliate company. All rights reserved
 */
package raz.zuren.configurableiframewidget.widgets;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.annotation.WireVariable;
import org.zkoss.zul.Label;

import com.hybris.cockpitng.util.DefaultWidgetController;

import raz.zuren.configurableiframewidget.services.ConfigurableiframewidgetService;


public class ConfigurableiframewidgetController extends DefaultWidgetController
{
	private static final long serialVersionUID = 1L;
	private Label label;

	@WireVariable
	private transient ConfigurableiframewidgetService configurableiframewidgetService;

	@Override
	public void initialize(final Component comp)
	{
		super.initialize(comp);
		label.setValue(configurableiframewidgetService.getHello() + " ConfigurableiframewidgetController");
	}
}
