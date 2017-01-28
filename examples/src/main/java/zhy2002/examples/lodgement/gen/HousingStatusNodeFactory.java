package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class HousingStatusNodeFactory implements ChildNodeFactory<HousingStatusNode, PersonGeneralNode> {

    @Override
    public HousingStatusNode create(PersonGeneralNode parent, String name) {
        return new HousingStatusNode(parent, name);
    }
}
