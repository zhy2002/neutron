package zhy2002.examples.register.gen;

import zhy2002.neutron.ChildNodeFactory;

public class ReceiveOffersNodeFactory implements ChildNodeFactory<ReceiveOffersNode, RegisterNode> {

    @Override
    public ReceiveOffersNode create(RegisterNode parent, String name) {
        return new ReceiveOffersNode(parent, name);
    }
}
