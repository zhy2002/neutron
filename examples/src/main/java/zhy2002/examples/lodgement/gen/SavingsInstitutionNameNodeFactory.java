package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class SavingsInstitutionNameNodeFactory implements ChildNodeFactory<SavingsInstitutionNameNode, SavingsAccountNode> {

    @Override
    public SavingsInstitutionNameNode create(SavingsAccountNode parent, String name) {
        return new SavingsInstitutionNameNode(parent, name);
    }
}
