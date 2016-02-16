# Install the Subclipse Plugin #

  * Start Eclipse, from the menu bar, select "Help -> Install New Software..."

  * In the Install dialog, click on "Add…" An "Add Repository" dialog pops up. Enter a name for the plugin ("Subclipse" will do), and the URL for updates: http://subclipse.tigris.org/update_1.6.x. Click "OK".

  * The new site should now appear in the list of sites on the Install dialog.

  * In the Search Results dialog, select the checkboxes for all the modules and click "Next".

  * Check Install Details and click “Next”.

  * The license agreement for the plugin appears. Read it, and if you agree, select "Accept terms of the license agreement" and click "Next". Click "Finish".

  * If you get a warning that the plugin is not signed, choose to install it anyway by clicking "Install All"

  * Restart Eclipse.

  * After Eclipse restarts, you need to import the project from Google code. From the menu bar, select "File -> Import…"

  * In the Import dialog, select "Checkout Projects from SVN" and click “Next”.


  * In the Checkout dialog, Select “Create a new repository location” and click “Next”.

  * Input this source URL into the location and click “Next”.
    * For project members, the URL for demo project is https://sinaweibo-honeycomb.googlecode.com/svn/branches/demo/
    * For non-members, the URL for demo project is http://sinaweibo-honeycomb.googlecode.com/svn/branches/demo/

  * Input this Uri into the location: https://sinaweibo-honeycomb.googlecode.com/svn/trunk/, and click “Next”.

  * Select the root folder and click “Next”.

  * Select “Check out as a project in the workspace”, choose a local name and click “Next”.

  * Choose a local path to save the workspace and click “Finish”.

  * The project will appear in your workspace now.