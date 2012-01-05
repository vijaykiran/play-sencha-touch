package utils;

import java.util.ArrayList;
import java.util.List;

/**
 * A wrapper to generate sencha-compatible JSON.
 */
public class SenchaResponseWrapper {
    private boolean success;
    private List items;

    public SenchaResponseWrapper(boolean success, List items) {
        this.success = success;
        this.items = items;
    }

    public SenchaResponseWrapper(boolean success, Object item) {
        this.success = success;
        this.items = new ArrayList();
        this.items.add(item);
    }


}