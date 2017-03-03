package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;


interface OtherIncomeNodeChildFactory {
    OtherIncomeAddBackTypeNode createOtherIncomeAddBackTypeNode();
    OtherIncomeAmountNode createOtherIncomeAmountNode();
    OtherIncomeDescriptionNode createOtherIncomeDescriptionNode();
    OtherIncomePreviousYearNode createOtherIncomePreviousYearNode();
    OtherIncomeTypeNode createOtherIncomeTypeNode();
}

@Singleton
public class OtherIncomeNodeChildProvider {
    @Inject
    MembersInjector<OtherIncomeDescriptionNode> otherIncomeDescriptionNodeInjector;
    @Inject
    MembersInjector<OtherIncomeTypeNode> otherIncomeTypeNodeInjector;
    @Inject
    MembersInjector<OtherIncomeAmountNode> otherIncomeAmountNodeInjector;
    @Inject
    MembersInjector<OtherIncomePreviousYearNode> otherIncomePreviousYearNodeInjector;
    @Inject
    MembersInjector<OtherIncomeAddBackTypeNode> otherIncomeAddBackTypeNodeInjector;

    @Inject
    protected OtherIncomeNodeChildProvider () {}

    protected MembersInjector<OtherIncomeDescriptionNode> getOtherIncomeDescriptionNodeInjector() {
        return this.otherIncomeDescriptionNodeInjector;
    }

    protected MembersInjector<OtherIncomeTypeNode> getOtherIncomeTypeNodeInjector() {
        return this.otherIncomeTypeNodeInjector;
    }

    protected MembersInjector<OtherIncomeAmountNode> getOtherIncomeAmountNodeInjector() {
        return this.otherIncomeAmountNodeInjector;
    }

    protected MembersInjector<OtherIncomePreviousYearNode> getOtherIncomePreviousYearNodeInjector() {
        return this.otherIncomePreviousYearNodeInjector;
    }

    protected MembersInjector<OtherIncomeAddBackTypeNode> getOtherIncomeAddBackTypeNodeInjector() {
        return this.otherIncomeAddBackTypeNodeInjector;
    }

    protected OtherIncomeAddBackTypeNode newOtherIncomeAddBackTypeNode(
        OtherIncomeNode parent,
        String name
    ) {
        return new OtherIncomeAddBackTypeNode(parent, name);
    }

    protected void configureOtherIncomeAddBackTypeNode(OtherIncomeAddBackTypeNode node) {
    }

    protected OtherIncomeAmountNode newOtherIncomeAmountNode(
        OtherIncomeNode parent,
        String name
    ) {
        return new OtherIncomeAmountNode(parent, name);
    }

    protected void configureOtherIncomeAmountNode(OtherIncomeAmountNode node) {
    }

    protected OtherIncomeDescriptionNode newOtherIncomeDescriptionNode(
        OtherIncomeNode parent,
        String name
    ) {
        return new OtherIncomeDescriptionNode(parent, name);
    }

    protected void configureOtherIncomeDescriptionNode(OtherIncomeDescriptionNode node) {
    }

    protected OtherIncomePreviousYearNode newOtherIncomePreviousYearNode(
        OtherIncomeNode parent,
        String name
    ) {
        return new OtherIncomePreviousYearNode(parent, name);
    }

    protected void configureOtherIncomePreviousYearNode(OtherIncomePreviousYearNode node) {
    }

    protected OtherIncomeTypeNode newOtherIncomeTypeNode(
        OtherIncomeNode parent,
        String name
    ) {
        return new OtherIncomeTypeNode(parent, name);
    }

    protected void configureOtherIncomeTypeNode(OtherIncomeTypeNode node) {
    }

    OtherIncomeNodeChildFactory createFactory(OtherIncomeNode parent) {
        return new OtherIncomeNodeChildFactoryImpl(parent);
    }

    private class OtherIncomeNodeChildFactoryImpl implements OtherIncomeNodeChildFactory {

        private final OtherIncomeNode parent;
        
        private OtherIncomeNodeChildFactoryImpl(OtherIncomeNode parent) {
            this.parent = parent;
        }

        @Override
        public OtherIncomeAddBackTypeNode createOtherIncomeAddBackTypeNode() {
            OtherIncomeAddBackTypeNode node = newOtherIncomeAddBackTypeNode(parent, "otherIncomeAddBackTypeNode");
            otherIncomeAddBackTypeNodeInjector.injectMembers(node);
            configureOtherIncomeAddBackTypeNode(node);
            return node;
        }

        @Override
        public OtherIncomeAmountNode createOtherIncomeAmountNode() {
            OtherIncomeAmountNode node = newOtherIncomeAmountNode(parent, "otherIncomeAmountNode");
            otherIncomeAmountNodeInjector.injectMembers(node);
            configureOtherIncomeAmountNode(node);
            return node;
        }

        @Override
        public OtherIncomeDescriptionNode createOtherIncomeDescriptionNode() {
            OtherIncomeDescriptionNode node = newOtherIncomeDescriptionNode(parent, "otherIncomeDescriptionNode");
            otherIncomeDescriptionNodeInjector.injectMembers(node);
            configureOtherIncomeDescriptionNode(node);
            return node;
        }

        @Override
        public OtherIncomePreviousYearNode createOtherIncomePreviousYearNode() {
            OtherIncomePreviousYearNode node = newOtherIncomePreviousYearNode(parent, "otherIncomePreviousYearNode");
            otherIncomePreviousYearNodeInjector.injectMembers(node);
            configureOtherIncomePreviousYearNode(node);
            return node;
        }

        @Override
        public OtherIncomeTypeNode createOtherIncomeTypeNode() {
            OtherIncomeTypeNode node = newOtherIncomeTypeNode(parent, "otherIncomeTypeNode");
            otherIncomeTypeNodeInjector.injectMembers(node);
            configureOtherIncomeTypeNode(node);
            return node;
        }

    }
}