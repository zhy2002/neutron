package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.ChildNodeFactory;

public class DriversLicenseNodeFactory implements ChildNodeFactory<DriversLicenseNode, PersonNode> {

    @Override
    public DriversLicenseNode create(PersonNode parent, String name) {
        return new DriversLicenseNode(parent, name);
    }
}
