package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.ChildNodeFactory;

public class HousingStatusNodeFactory implements ChildNodeFactory<HousingStatusNode, PersonNode> {

    @Override
    public HousingStatusNode create(PersonNode parent, String name) {
        return new HousingStatusNode(parent, name);
    }
}
