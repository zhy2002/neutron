package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;


interface RelatedPartyNodeChildFactory {
    ThirdPartyTypeNode createThirdPartyTypeNode();
    ThirdPartyDescriptionNode createThirdPartyDescriptionNode();
    ThirdPartyTitleNode createThirdPartyTitleNode();
    ThirdPartyFirstNameNode createThirdPartyFirstNameNode();
    ThirdPartyLastNameNode createThirdPartyLastNameNode();
    ThirdPartyDobNode createThirdPartyDobNode();
    ThirdPartyCompanyNameNode createThirdPartyCompanyNameNode();
    ThirdPartyAddressNode createThirdPartyAddressNode();
    ThirdPartyWorkPhoneNode createThirdPartyWorkPhoneNode();
    ThirdPartyEmailNode createThirdPartyEmailNode();
}

@Singleton
public class RelatedPartyNodeChildProvider {
    @Inject
    MembersInjector<ThirdPartyDobNode> thirdPartyDobNodeInjector;
    @Inject
    MembersInjector<ThirdPartyWorkPhoneNode> thirdPartyWorkPhoneNodeInjector;
    @Inject
    MembersInjector<ThirdPartyLastNameNode> thirdPartyLastNameNodeInjector;
    @Inject
    MembersInjector<ThirdPartyCompanyNameNode> thirdPartyCompanyNameNodeInjector;
    @Inject
    MembersInjector<ThirdPartyAddressNode> thirdPartyAddressNodeInjector;
    @Inject
    MembersInjector<ThirdPartyEmailNode> thirdPartyEmailNodeInjector;
    @Inject
    MembersInjector<ThirdPartyTypeNode> thirdPartyTypeNodeInjector;
    @Inject
    MembersInjector<ThirdPartyTitleNode> thirdPartyTitleNodeInjector;
    @Inject
    MembersInjector<ThirdPartyDescriptionNode> thirdPartyDescriptionNodeInjector;
    @Inject
    MembersInjector<ThirdPartyFirstNameNode> thirdPartyFirstNameNodeInjector;

    @Inject
    protected RelatedPartyNodeChildProvider () {}

    protected MembersInjector<ThirdPartyDobNode> getThirdPartyDobNodeInjector() {
        return this.thirdPartyDobNodeInjector;
    }

    protected MembersInjector<ThirdPartyWorkPhoneNode> getThirdPartyWorkPhoneNodeInjector() {
        return this.thirdPartyWorkPhoneNodeInjector;
    }

    protected MembersInjector<ThirdPartyLastNameNode> getThirdPartyLastNameNodeInjector() {
        return this.thirdPartyLastNameNodeInjector;
    }

    protected MembersInjector<ThirdPartyCompanyNameNode> getThirdPartyCompanyNameNodeInjector() {
        return this.thirdPartyCompanyNameNodeInjector;
    }

    protected MembersInjector<ThirdPartyAddressNode> getThirdPartyAddressNodeInjector() {
        return this.thirdPartyAddressNodeInjector;
    }

    protected MembersInjector<ThirdPartyEmailNode> getThirdPartyEmailNodeInjector() {
        return this.thirdPartyEmailNodeInjector;
    }

    protected MembersInjector<ThirdPartyTypeNode> getThirdPartyTypeNodeInjector() {
        return this.thirdPartyTypeNodeInjector;
    }

    protected MembersInjector<ThirdPartyTitleNode> getThirdPartyTitleNodeInjector() {
        return this.thirdPartyTitleNodeInjector;
    }

    protected MembersInjector<ThirdPartyDescriptionNode> getThirdPartyDescriptionNodeInjector() {
        return this.thirdPartyDescriptionNodeInjector;
    }

    protected MembersInjector<ThirdPartyFirstNameNode> getThirdPartyFirstNameNodeInjector() {
        return this.thirdPartyFirstNameNodeInjector;
    }

    protected ThirdPartyTypeNode newThirdPartyTypeNode(
        RelatedPartyNode parent,
        String name
    ) {
        return new ThirdPartyTypeNode(parent, name);
    }

    protected void configureThirdPartyTypeNode(ThirdPartyTypeNode node) {
    }

    protected ThirdPartyDescriptionNode newThirdPartyDescriptionNode(
        RelatedPartyNode parent,
        String name
    ) {
        return new ThirdPartyDescriptionNode(parent, name);
    }

    protected void configureThirdPartyDescriptionNode(ThirdPartyDescriptionNode node) {
    }

    protected ThirdPartyTitleNode newThirdPartyTitleNode(
        RelatedPartyNode parent,
        String name
    ) {
        return new ThirdPartyTitleNode(parent, name);
    }

    protected void configureThirdPartyTitleNode(ThirdPartyTitleNode node) {
    }

    protected ThirdPartyFirstNameNode newThirdPartyFirstNameNode(
        RelatedPartyNode parent,
        String name
    ) {
        return new ThirdPartyFirstNameNode(parent, name);
    }

    protected void configureThirdPartyFirstNameNode(ThirdPartyFirstNameNode node) {
    }

    protected ThirdPartyLastNameNode newThirdPartyLastNameNode(
        RelatedPartyNode parent,
        String name
    ) {
        return new ThirdPartyLastNameNode(parent, name);
    }

    protected void configureThirdPartyLastNameNode(ThirdPartyLastNameNode node) {
    }

    protected ThirdPartyDobNode newThirdPartyDobNode(
        RelatedPartyNode parent,
        String name
    ) {
        return new ThirdPartyDobNode(parent, name);
    }

    protected void configureThirdPartyDobNode(ThirdPartyDobNode node) {
    }

    protected ThirdPartyCompanyNameNode newThirdPartyCompanyNameNode(
        RelatedPartyNode parent,
        String name
    ) {
        return new ThirdPartyCompanyNameNode(parent, name);
    }

    protected void configureThirdPartyCompanyNameNode(ThirdPartyCompanyNameNode node) {
    }

    protected ThirdPartyAddressNode newThirdPartyAddressNode(
        RelatedPartyNode parent,
        String name
    ) {
        return new ThirdPartyAddressNode(parent, name);
    }

    protected void configureThirdPartyAddressNode(ThirdPartyAddressNode node) {
    }

    protected ThirdPartyWorkPhoneNode newThirdPartyWorkPhoneNode(
        RelatedPartyNode parent,
        String name
    ) {
        return new ThirdPartyWorkPhoneNode(parent, name);
    }

    protected void configureThirdPartyWorkPhoneNode(ThirdPartyWorkPhoneNode node) {
    }

    protected ThirdPartyEmailNode newThirdPartyEmailNode(
        RelatedPartyNode parent,
        String name
    ) {
        return new ThirdPartyEmailNode(parent, name);
    }

    protected void configureThirdPartyEmailNode(ThirdPartyEmailNode node) {
    }

    RelatedPartyNodeChildFactory createFactory(RelatedPartyNode parent) {
        return new RelatedPartyNodeChildFactoryImpl(parent);
    }

    private class RelatedPartyNodeChildFactoryImpl implements RelatedPartyNodeChildFactory {

        private final RelatedPartyNode parent;
        
        private RelatedPartyNodeChildFactoryImpl(RelatedPartyNode parent) {
            this.parent = parent;
        }

        @Override
        public ThirdPartyTypeNode createThirdPartyTypeNode() {
            ThirdPartyTypeNode node = newThirdPartyTypeNode(parent, "thirdPartyTypeNode");
            thirdPartyTypeNodeInjector.injectMembers(node);
            configureThirdPartyTypeNode(node);
            return node;
        }

        @Override
        public ThirdPartyDescriptionNode createThirdPartyDescriptionNode() {
            ThirdPartyDescriptionNode node = newThirdPartyDescriptionNode(parent, "thirdPartyDescriptionNode");
            thirdPartyDescriptionNodeInjector.injectMembers(node);
            configureThirdPartyDescriptionNode(node);
            return node;
        }

        @Override
        public ThirdPartyTitleNode createThirdPartyTitleNode() {
            ThirdPartyTitleNode node = newThirdPartyTitleNode(parent, "thirdPartyTitleNode");
            thirdPartyTitleNodeInjector.injectMembers(node);
            configureThirdPartyTitleNode(node);
            return node;
        }

        @Override
        public ThirdPartyFirstNameNode createThirdPartyFirstNameNode() {
            ThirdPartyFirstNameNode node = newThirdPartyFirstNameNode(parent, "thirdPartyFirstNameNode");
            thirdPartyFirstNameNodeInjector.injectMembers(node);
            configureThirdPartyFirstNameNode(node);
            return node;
        }

        @Override
        public ThirdPartyLastNameNode createThirdPartyLastNameNode() {
            ThirdPartyLastNameNode node = newThirdPartyLastNameNode(parent, "thirdPartyLastNameNode");
            thirdPartyLastNameNodeInjector.injectMembers(node);
            configureThirdPartyLastNameNode(node);
            return node;
        }

        @Override
        public ThirdPartyDobNode createThirdPartyDobNode() {
            ThirdPartyDobNode node = newThirdPartyDobNode(parent, "thirdPartyDobNode");
            thirdPartyDobNodeInjector.injectMembers(node);
            configureThirdPartyDobNode(node);
            return node;
        }

        @Override
        public ThirdPartyCompanyNameNode createThirdPartyCompanyNameNode() {
            ThirdPartyCompanyNameNode node = newThirdPartyCompanyNameNode(parent, "thirdPartyCompanyNameNode");
            thirdPartyCompanyNameNodeInjector.injectMembers(node);
            configureThirdPartyCompanyNameNode(node);
            return node;
        }

        @Override
        public ThirdPartyAddressNode createThirdPartyAddressNode() {
            ThirdPartyAddressNode node = newThirdPartyAddressNode(parent, "thirdPartyAddressNode");
            thirdPartyAddressNodeInjector.injectMembers(node);
            configureThirdPartyAddressNode(node);
            return node;
        }

        @Override
        public ThirdPartyWorkPhoneNode createThirdPartyWorkPhoneNode() {
            ThirdPartyWorkPhoneNode node = newThirdPartyWorkPhoneNode(parent, "thirdPartyWorkPhoneNode");
            thirdPartyWorkPhoneNodeInjector.injectMembers(node);
            configureThirdPartyWorkPhoneNode(node);
            return node;
        }

        @Override
        public ThirdPartyEmailNode createThirdPartyEmailNode() {
            ThirdPartyEmailNode node = newThirdPartyEmailNode(parent, "thirdPartyEmailNode");
            thirdPartyEmailNodeInjector.injectMembers(node);
            configureThirdPartyEmailNode(node);
            return node;
        }

    }
}