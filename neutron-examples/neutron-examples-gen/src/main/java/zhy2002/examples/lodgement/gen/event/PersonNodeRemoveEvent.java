package zhy2002.examples.lodgement.gen.event;

import zhy2002.examples.lodgement.gen.node.PersonNode;
import zhy2002.neutron.NodeRemoveEvent;


public class PersonNodeRemoveEvent extends NodeRemoveEvent<PersonNode> {
    public PersonNodeRemoveEvent(PersonNode target) {
        super(target);
    }
}