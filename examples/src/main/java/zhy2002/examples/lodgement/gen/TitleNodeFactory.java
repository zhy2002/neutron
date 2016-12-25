package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.ChildNodeFactory;

public class TitleNodeFactory implements ChildNodeFactory<TitleNode, PersonNode> {

    @Override
    public TitleNode create(PersonNode parent, String name) {
        return new TitleNode(parent, name);
    }
}
