package de.gkasi.settings;

/**
 * It provides Program Commands which is declared as Constants
 */
public class AppCommands {
    //region 1. Constants
    public static final int CMD_VIEW=1;
    public static final int CMD_ADD=2;
    public static final int CMD_DELETE=3;
    public static final int CMD_UPDATE=4;
    public static final int CMD_EXIT=0;
    //endregion

    //region 2. Constructor

    /**
     * Private Constructor
     * to prevent object instantiation from outside of the class.
     * this class only provides private constants
     */
    private AppCommands() {

    }

    //endregion

}
