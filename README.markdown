Contrast Calculator V1.1
=====

The project was created for use within the ACOE and other I&IT clusters for checking colour contrast ratios between specified colours. It supports multiple monitors, multiple colour blind settings, and use of JNA for manipulating specific windows in the windows environment.

Current Features
---
The current list of available features are as follows:
* Multi-monitor support
* Multiple colour blind settings
* Dropper tool for selecting individual on screen pixels
* Take screenshots of a single monitor, multiple monitors, or an individual program window
* Save and export results into html table or textual format
* Apply colour blind settings to screenshots or dropper tool
* Magnification tool for magnifying individual windows or smaller portions of the screen 

Known Issues
---
* When using a multi monitor setup the main monitor must be the top left most monitor (in terms of virtual coordinates)
* May have some issues on lower memory machines with many monitors
* Cannot use dropper tool to select pixels at the very edge of the screen
* Html template for exporting results currently does not use unicode character encoding

Running the Program
---

```
1. Make sure to have at least JRE 1.5 or newer. Version 1.7 is the recommended version.
2. Download the runnable Contrast Calculator.jar or the ContrastCalculator.exe from the build directory.
3. Run the program.
```

3rd Party Libraries
---

The project implements the following libraries:

* JNA for window manipulation
* WebLaF look and feel for Java swing gui

The executable version of the program was created using launch4j. The launch4j configuration file can be found in the build directory. Though it currently uses absolute paths.

Project Designer: Andrew Cumming