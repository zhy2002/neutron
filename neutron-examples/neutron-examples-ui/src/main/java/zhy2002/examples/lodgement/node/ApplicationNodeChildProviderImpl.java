package zhy2002.examples.lodgement.node;

import zhy2002.examples.lodgement.gen.node.AddressRefListNode;
import zhy2002.examples.lodgement.gen.node.ApplicationNode;
import zhy2002.examples.lodgement.gen.node.ApplicationNodeChildProvider;

import javax.inject.Inject;
import javax.inject.Singleton;

public @Singleton
class ApplicationNodeChildProviderImpl extends ApplicationNodeChildProvider {

    @Inject
    public ApplicationNodeChildProviderImpl() {
    }

    @Override
    protected AddressRefListNode newAddressRefListNode(ApplicationNode parent, String name) {
        return new AddressRefListNodeImpl(parent, name);
    }
}
