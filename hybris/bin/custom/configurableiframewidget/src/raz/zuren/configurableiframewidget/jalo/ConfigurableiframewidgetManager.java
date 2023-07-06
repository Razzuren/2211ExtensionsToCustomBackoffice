package raz.zuren.configurableiframewidget.jalo;

import raz.zuren.configurableiframewidget.constants.ConfigurableiframewidgetConstants;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;

public class ConfigurableiframewidgetManager extends GeneratedConfigurableiframewidgetManager
{
	@SuppressWarnings("unused")
	private static final Logger log = Logger.getLogger( ConfigurableiframewidgetManager.class.getName() );
	
	public static final ConfigurableiframewidgetManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (ConfigurableiframewidgetManager) em.getExtension(ConfigurableiframewidgetConstants.EXTENSIONNAME);
	}
	
}
