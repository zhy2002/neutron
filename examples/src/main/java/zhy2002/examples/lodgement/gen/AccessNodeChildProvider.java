package zhy2002.examples.lodgement.gen;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;


interface AccessNodeChildFactory {
    AccessContactTypeNode createAccessContactTypeNode();
    AccessContactTitleNode createAccessContactTitleNode();
    AccessContactFirstNameNode createAccessContactFirstNameNode();
    AccessContactLastNameNode createAccessContactLastNameNode();
    AccessCompanyNameNode createAccessCompanyNameNode();
    AccessTelephoneNode createAccessTelephoneNode();
    AccessOtherDescriptionNode createAccessOtherDescriptionNode();
}

@Singleton
public class AccessNodeChildProvider {
    @Inject
    MembersInjector<AccessContactTypeNode> accessContactTypeNodeInjector;
    @Inject
    MembersInjector<AccessContactTitleNode> accessContactTitleNodeInjector;
    @Inject
    MembersInjector<AccessContactFirstNameNode> accessContactFirstNameNodeInjector;
    @Inject
    MembersInjector<AccessContactLastNameNode> accessContactLastNameNodeInjector;
    @Inject
    MembersInjector<AccessCompanyNameNode> accessCompanyNameNodeInjector;
    @Inject
    MembersInjector<AccessTelephoneNode> accessTelephoneNodeInjector;
    @Inject
    MembersInjector<AccessOtherDescriptionNode> accessOtherDescriptionNodeInjector;

    @Inject
    protected AccessNodeChildProvider () {}

    protected MembersInjector<AccessContactTypeNode> getAccessContactTypeNodeInjector() {
        return this.accessContactTypeNodeInjector;
    }

    protected MembersInjector<AccessContactTitleNode> getAccessContactTitleNodeInjector() {
        return this.accessContactTitleNodeInjector;
    }

    protected MembersInjector<AccessContactFirstNameNode> getAccessContactFirstNameNodeInjector() {
        return this.accessContactFirstNameNodeInjector;
    }

    protected MembersInjector<AccessContactLastNameNode> getAccessContactLastNameNodeInjector() {
        return this.accessContactLastNameNodeInjector;
    }

    protected MembersInjector<AccessCompanyNameNode> getAccessCompanyNameNodeInjector() {
        return this.accessCompanyNameNodeInjector;
    }

    protected MembersInjector<AccessTelephoneNode> getAccessTelephoneNodeInjector() {
        return this.accessTelephoneNodeInjector;
    }

    protected MembersInjector<AccessOtherDescriptionNode> getAccessOtherDescriptionNodeInjector() {
        return this.accessOtherDescriptionNodeInjector;
    }

    protected AccessContactTypeNode newAccessContactTypeNode(
        AccessNode parent,
        String name
    ) {
        return new AccessContactTypeNode(parent, name);
    }

    protected void configureAccessContactTypeNode(AccessContactTypeNode node) {
    }

    protected AccessContactTitleNode newAccessContactTitleNode(
        AccessNode parent,
        String name
    ) {
        return new AccessContactTitleNode(parent, name);
    }

    protected void configureAccessContactTitleNode(AccessContactTitleNode node) {
    }

    protected AccessContactFirstNameNode newAccessContactFirstNameNode(
        AccessNode parent,
        String name
    ) {
        return new AccessContactFirstNameNode(parent, name);
    }

    protected void configureAccessContactFirstNameNode(AccessContactFirstNameNode node) {
    }

    protected AccessContactLastNameNode newAccessContactLastNameNode(
        AccessNode parent,
        String name
    ) {
        return new AccessContactLastNameNode(parent, name);
    }

    protected void configureAccessContactLastNameNode(AccessContactLastNameNode node) {
    }

    protected AccessCompanyNameNode newAccessCompanyNameNode(
        AccessNode parent,
        String name
    ) {
        return new AccessCompanyNameNode(parent, name);
    }

    protected void configureAccessCompanyNameNode(AccessCompanyNameNode node) {
    }

    protected AccessTelephoneNode newAccessTelephoneNode(
        AccessNode parent,
        String name
    ) {
        return new AccessTelephoneNode(parent, name);
    }

    protected void configureAccessTelephoneNode(AccessTelephoneNode node) {
    }

    protected AccessOtherDescriptionNode newAccessOtherDescriptionNode(
        AccessNode parent,
        String name
    ) {
        return new AccessOtherDescriptionNode(parent, name);
    }

    protected void configureAccessOtherDescriptionNode(AccessOtherDescriptionNode node) {
    }

    AccessNodeChildFactory createFactory(AccessNode parent) {
        return new AccessNodeChildFactoryImpl(parent);
    }

    private class AccessNodeChildFactoryImpl implements AccessNodeChildFactory {

        private final AccessNode parent;
        
        private AccessNodeChildFactoryImpl(AccessNode parent) {
            this.parent = parent;
        }

        @Override
        public AccessContactTypeNode createAccessContactTypeNode() {
            AccessContactTypeNode node = newAccessContactTypeNode(parent, "accessContactTypeNode");
            accessContactTypeNodeInjector.injectMembers(node);
            configureAccessContactTypeNode(node);
            return node;
        }

        @Override
        public AccessContactTitleNode createAccessContactTitleNode() {
            AccessContactTitleNode node = newAccessContactTitleNode(parent, "accessContactTitleNode");
            accessContactTitleNodeInjector.injectMembers(node);
            configureAccessContactTitleNode(node);
            return node;
        }

        @Override
        public AccessContactFirstNameNode createAccessContactFirstNameNode() {
            AccessContactFirstNameNode node = newAccessContactFirstNameNode(parent, "accessContactFirstNameNode");
            accessContactFirstNameNodeInjector.injectMembers(node);
            configureAccessContactFirstNameNode(node);
            return node;
        }

        @Override
        public AccessContactLastNameNode createAccessContactLastNameNode() {
            AccessContactLastNameNode node = newAccessContactLastNameNode(parent, "accessContactLastNameNode");
            accessContactLastNameNodeInjector.injectMembers(node);
            configureAccessContactLastNameNode(node);
            return node;
        }

        @Override
        public AccessCompanyNameNode createAccessCompanyNameNode() {
            AccessCompanyNameNode node = newAccessCompanyNameNode(parent, "accessCompanyNameNode");
            accessCompanyNameNodeInjector.injectMembers(node);
            configureAccessCompanyNameNode(node);
            return node;
        }

        @Override
        public AccessTelephoneNode createAccessTelephoneNode() {
            AccessTelephoneNode node = newAccessTelephoneNode(parent, "accessTelephoneNode");
            accessTelephoneNodeInjector.injectMembers(node);
            configureAccessTelephoneNode(node);
            return node;
        }

        @Override
        public AccessOtherDescriptionNode createAccessOtherDescriptionNode() {
            AccessOtherDescriptionNode node = newAccessOtherDescriptionNode(parent, "accessOtherDescriptionNode");
            accessOtherDescriptionNodeInjector.injectMembers(node);
            configureAccessOtherDescriptionNode(node);
            return node;
        }

    }
}
