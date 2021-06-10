package dev.odd.clientdbgcom.client;

public enum F3Option {
    RELOADCHUNKS(65, "rechunk"), 
    TOGGLEHITBOXES(66, "hitbox"), 
    COPYTPLOCATION(67, "copytp"), 
    CLEARCHAT(68, "clear"),
    CYCLERENDERDISTANCE(70, "render", true), 
    TOGGLECHUNKBOUNDS(71, "chunkbounds"), 
    TOGGLEADVTOOLT(72, "advtooltip"),
    COPYLOOKATDATA(73, "copylookat", true), 
    SCOPYLOOKATDATA(73, "scopylookat"), 
    TOGGLEDEBUGPROFILE(76, "profile"), 
    TOGGLESPECTATOR(78, "spectator"),
    TOGGLEUNFOCUSPAUSE(80, "unfocus"), 
    SHOWHELP(81, "help"), 
    RELOADRESPACKS(84, "reres"),
    //SHOWGMSELECTION(293, "gmselect")
    ;

    private final int key;
    private final String command;
    private final boolean isExtra;

    private F3Option(int key, String command) {
        this.key = key;
        this.command = command;
        this.isExtra = false;
    }

    private F3Option(int key, String command, boolean extra) {
        this.key = key;
        this.command = command;
        this.isExtra = extra;
    }

    public int getKey() {
        return this.key;
    }

    public String getCommand() {
        return this.command;
    }

    public boolean hasExtra() {
        return this.isExtra;
    }
}