package zhy2002.examples.app.gen;

import zhy2002.neutron.*;

public class AppManagerNodeFactory implements ChildNodeFactory<AppManagerNode, LodgementNode> {

    @Override
    public AppManagerNode create(LodgementNode parent, String name) {
        return new AppManagerNode(parent, name);
    }
}
