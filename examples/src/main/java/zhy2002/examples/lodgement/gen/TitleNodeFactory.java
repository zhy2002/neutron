package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.ChildNodeFactory;

public class TitleNodeFactory implements ChildNodeFactory<TitleNode, GeneralNode> {

    @Override
    public TitleNode create(GeneralNode parent, String name) {
        return new TitleNode(parent, name);
    }
}
