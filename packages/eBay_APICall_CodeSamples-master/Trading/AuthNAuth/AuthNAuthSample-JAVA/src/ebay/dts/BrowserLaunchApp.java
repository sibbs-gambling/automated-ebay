/*
 * © 2010-2013 eBay Inc., All Rights Reserved
 * Licensed under CDDL 1.0 -  http://opensource.org/licenses/cddl1.php
 */

package ebay.dts;
/*
 * BrowserLaunchApp.java
 */
import org.jdesktop.application.Application;
import org.jdesktop.application.SingleFrameApplication;

public class BrowserLaunchApp extends SingleFrameApplication {

    /**
     * At startup create and show the main frame of the application.
     */
    @Override protected void startup() {
        show(new BrowserLaunchView(this));
    }

    /**
     * This method is to initialize the specified window by injecting resources.
     * Windows shown in our application come fully initialized from the GUI
     * builder, so this additional configuration is not needed.
     */
    @Override protected void configureWindow(java.awt.Window root) {
    }

    /**
     * A convenient static getter for the application instance.
     * @return the instance of BrowserLaunchApp
     */
    public static BrowserLaunchApp getApplication() {
        return Application.getInstance(BrowserLaunchApp.class);
    }

    /**
     * Main method launching the application.
     */
    public static void main(String[] args) {
        launch(BrowserLaunchApp.class, args);
    }
}
