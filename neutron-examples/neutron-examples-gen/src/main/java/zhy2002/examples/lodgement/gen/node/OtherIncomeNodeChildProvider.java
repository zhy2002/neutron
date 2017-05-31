package zhy2002.examples.lodgement.gen.node;
/* template name: child_factory.ftl */
import zhy2002.neutron.*;
import dagger.MembersInjector;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.*;
import zhy2002.neutron.di.ComponentScope;


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

    @ComponentScope
    public static class OtherIncomeAddBackTypeNodeRuleProvider implements RuleProvider<OtherIncomeAddBackTypeNode> {

        @Inject
        public OtherIncomeAddBackTypeNodeRuleProvider() {

        }

        @Override
        public void initializeState(OtherIncomeAddBackTypeNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected OtherIncomeAmountNode newOtherIncomeAmountNode(
        OtherIncomeNode parent,
        String name
    ) {
        return new OtherIncomeAmountNode(parent, name);
    }

    protected void configureOtherIncomeAmountNode(OtherIncomeAmountNode node) {
    }

    @ComponentScope
    public static class OtherIncomeAmountNodeRuleProvider implements RuleProvider<OtherIncomeAmountNode> {

        @Inject
        public OtherIncomeAmountNodeRuleProvider() {

        }

        @Override
        public void initializeState(OtherIncomeAmountNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected OtherIncomeDescriptionNode newOtherIncomeDescriptionNode(
        OtherIncomeNode parent,
        String name
    ) {
        return new OtherIncomeDescriptionNode(parent, name);
    }

    protected void configureOtherIncomeDescriptionNode(OtherIncomeDescriptionNode node) {
    }

    @ComponentScope
    public static class OtherIncomeDescriptionNodeRuleProvider implements RuleProvider<OtherIncomeDescriptionNode> {

        @Inject
        public OtherIncomeDescriptionNodeRuleProvider() {

        }

        @Override
        public void initializeState(OtherIncomeDescriptionNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected OtherIncomePreviousYearNode newOtherIncomePreviousYearNode(
        OtherIncomeNode parent,
        String name
    ) {
        return new OtherIncomePreviousYearNode(parent, name);
    }

    protected void configureOtherIncomePreviousYearNode(OtherIncomePreviousYearNode node) {
    }

    @ComponentScope
    public static class OtherIncomePreviousYearNodeRuleProvider implements RuleProvider<OtherIncomePreviousYearNode> {

        @Inject
        public OtherIncomePreviousYearNodeRuleProvider() {

        }

        @Override
        public void initializeState(OtherIncomePreviousYearNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected OtherIncomeTypeNode newOtherIncomeTypeNode(
        OtherIncomeNode parent,
        String name
    ) {
        return new OtherIncomeTypeNode(parent, name);
    }

    protected void configureOtherIncomeTypeNode(OtherIncomeTypeNode node) {
    }

    @ComponentScope
    public static class OtherIncomeTypeNodeRuleProvider implements RuleProvider<OtherIncomeTypeNode> {

        @Inject
        public OtherIncomeTypeNodeRuleProvider() {

        }

        @Override
        public void initializeState(OtherIncomeTypeNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
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
