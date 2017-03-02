package zhy2002.examples.lodgement.gen.event;

import zhy2002.examples.lodgement.gen.node.PersonNode;
import zhy2002.neutron.NodeAddEvent;


public class PersonNodeAddEvent extends NodeAddEvent<PersonNode> {

    public PersonNodeAddEvent(PersonNode target) {
        super(target);
    }
}
