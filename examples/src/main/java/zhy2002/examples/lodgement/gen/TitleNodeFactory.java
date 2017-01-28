package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class TitleNodeFactory implements ChildNodeFactory<TitleNode, PersonGeneralNode> {

    @Override
    public TitleNode create(PersonGeneralNode parent, String name) {
        return new TitleNode(parent, name);
    }
}
