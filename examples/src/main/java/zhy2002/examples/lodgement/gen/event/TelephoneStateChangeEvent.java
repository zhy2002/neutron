package zhy2002.examples.lodgement.gen.event;

import zhy2002.neutron.*;
import zhy2002.examples.lodgement.data.*;

public class TelephoneStateChangeEvent extends StateChangeEvent<Telephone> {

    public TelephoneStateChangeEvent(UiNode<?> target, String key) {
        super(target, key);
    }
}