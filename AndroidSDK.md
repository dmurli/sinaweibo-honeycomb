# Install Android SDK #

http://code.google.com/android/download.html

Select the one for your operating system.

The file you download is a ZIP file on Windows or a tar-zipped file for Linux. Extract the archive file to a directory where you want to install Android, and make a note of the directory name (you'll need it later).


## Adding Platforms and Other Components ##

  * On Windows, double-click the SDK Manager.exe file at the root of the Android SDK directory.

  * On Linux, open a terminal and navigate to the tools/ directory in the Android SDK, then execute: android

  * In the graphical UI of the Android SDK and AVD Manager, browse the SDK repository and select new or updated components.

  * Select at least following packages before click “Install Selected”:
    * Android SDK Tools, [revision 10](https://code.google.com/p/sinaweibo-honeycomb/source/detail?r=10)
    * Android SDK Platform-tools, [revision 3](https://code.google.com/p/sinaweibo-honeycomb/source/detail?r=3)
    * SDK Platform Android 3.0, API 11, [revision 1](https://code.google.com/p/sinaweibo-honeycomb/source/detail?r=1)

  * You can also select other packages to download and install. The Android SDK and AVD Manager will install the selected components in your SDK environment.

  * Read and accept the licenses to install the packages.


## Create an Android Virtual Device ##

  * An Android Virtual Device (AVD) is an emulator configuration that lets you model an actual device by defining hardware and software options to be emulated by the Android Emulator.

  * In Android SDK and AVD Manager, select “Virtual Devices” in the left panel, the existing  AVDs will be list in the middle panel, click “New…” to create a new AVD.

  * Input values with “Target” set to “Android 3.0 – API Level 11”.

  * Click “Create AVD” and it’ll appear in the AVD list, select and click “Start…” to launch the emulator with Honeycomb.