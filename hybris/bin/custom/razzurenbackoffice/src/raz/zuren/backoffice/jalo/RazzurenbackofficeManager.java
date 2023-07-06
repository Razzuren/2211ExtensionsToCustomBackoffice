package raz.zuren.backoffice.jalo;

import raz.zuren.backoffice.constants.RazzurenbackofficeConstants;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;

public class RazzurenbackofficeManager extends GeneratedRazzurenbackofficeManager
{
	@SuppressWarnings("unused")
	private static final Logger log = Logger.getLogger( RazzurenbackofficeManager.class.getName() );
	
	public static final RazzurenbackofficeManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (RazzurenbackofficeManager) em.getExtension(RazzurenbackofficeConstants.EXTENSIONNAME);
	}
	
}
