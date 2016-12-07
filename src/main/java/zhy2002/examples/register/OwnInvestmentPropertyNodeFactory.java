package zhy2002.examples.register;

import zhy2002.neutron.ChildNodeFactory;


public class OwnInvestmentPropertyNodeFactory extends ChildNodeFactory<OwnInvestmentPropertyNode, RegisterNode> {
    @Override
    public OwnInvestmentPropertyNode create(RegisterNode parent, String name) {
        return new OwnInvestmentPropertyNode(parent, name);
    }
}
