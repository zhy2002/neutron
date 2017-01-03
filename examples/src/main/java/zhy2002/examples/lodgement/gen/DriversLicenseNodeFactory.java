package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class DriversLicenseNodeFactory implements ChildNodeFactory<DriversLicenseNode, GeneralNode> {

    @Override
    public DriversLicenseNode create(GeneralNode parent, String name) {
        return new DriversLicenseNode(parent, name);
    }
}
