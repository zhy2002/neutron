package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class DriversLicenseNodeFactory implements ChildNodeFactory<DriversLicenseNode, PersonGeneralNode> {

    @Override
    public DriversLicenseNode create(PersonGeneralNode parent, String name) {
        return new DriversLicenseNode(parent, name);
    }
}
