/*
 * $Id: IWBundleStarter.java,v 1.1 2005/01/14 00:48:31 tryggvil Exp $
 * Created on 14.1.2005
 *
 * Copyright (C) 2005 Idega Software hf. All Rights Reserved.
 *
 * This software is the proprietary information of Idega hf.
 * Use is subject to license terms.
 */
package com.idega.setup;

import com.idega.core.view.DefaultViewNode;
import com.idega.core.view.ViewManager;
import com.idega.idegaweb.IWBundle;
import com.idega.idegaweb.IWBundleStartable;
import com.idega.idegaweb.IWMainApplication;


/**
 * 
 *  Last modified: $Date: 2005/01/14 00:48:31 $ by $Author: tryggvil $
 * 
 * @author <a href="mailto:tryggvil@idega.com">tryggvil</a>
 * @version $Revision: 1.1 $
 */
public class IWBundleStarter implements IWBundleStartable {

	/* (non-Javadoc)
	 * @see com.idega.idegaweb.IWBundleStartable#start(com.idega.idegaweb.IWBundle)
	 */
	public void start(IWBundle starterBundle) {
		//Registering the views:
		if(starterBundle!=null){
			IWMainApplication iwma = starterBundle.getApplication();
			//IWMainApplication iwma = IWMainApplication.getDefaultIWMainApplication();
			ViewManager viewManager = ViewManager.getInstance(iwma);
			
			DefaultViewNode firstSetupPage = new DefaultViewNode("setup",viewManager.getApplicationRoot());
			firstSetupPage.setJspUri(starterBundle.getJSPURI("setup1.jsp"));
		}
	}

	/* (non-Javadoc)
	 * @see com.idega.idegaweb.IWBundleStartable#stop(com.idega.idegaweb.IWBundle)
	 */
	public void stop(IWBundle starterBundle) {
		// TODO Auto-generated method stub
	}
}
