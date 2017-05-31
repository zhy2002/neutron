package zhy2002.examples.lodgement.gen.node;
/* template name: child_factory.ftl */
import zhy2002.neutron.*;
import dagger.MembersInjector;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.*;
import zhy2002.neutron.di.ComponentScope;


interface OtherAssetNodeChildFactory {
    OtherAssetTypeNode createOtherAssetTypeNode();
    OtherAssetDescriptionNode createOtherAssetDescriptionNode();
    OtherAssetMarketValueNode createOtherAssetMarketValueNode();
    OtherAssetOwnershipListNode createOwnershipListNode();
}

@Singleton
public class OtherAssetNodeChildProvider {
    @Inject
    MembersInjector<OtherAssetOwnershipListNode> otherAssetOwnershipListNodeInjector;
    @Inject
    MembersInjector<OtherAssetDescriptionNode> otherAssetDescriptionNodeInjector;
    @Inject
    MembersInjector<OtherAssetTypeNode> otherAssetTypeNodeInjector;
    @Inject
    MembersInjector<OtherAssetMarketValueNode> otherAssetMarketValueNodeInjector;

    @Inject
    protected OtherAssetNodeChildProvider () {}

    protected MembersInjector<OtherAssetOwnershipListNode> getOtherAssetOwnershipListNodeInjector() {
        return this.otherAssetOwnershipListNodeInjector;
    }

    protected MembersInjector<OtherAssetDescriptionNode> getOtherAssetDescriptionNodeInjector() {
        return this.otherAssetDescriptionNodeInjector;
    }

    protected MembersInjector<OtherAssetTypeNode> getOtherAssetTypeNodeInjector() {
        return this.otherAssetTypeNodeInjector;
    }

    protected MembersInjector<OtherAssetMarketValueNode> getOtherAssetMarketValueNodeInjector() {
        return this.otherAssetMarketValueNodeInjector;
    }

    protected OtherAssetTypeNode newOtherAssetTypeNode(
        OtherAssetNode parent,
        String name
    ) {
        return new OtherAssetTypeNode(parent, name);
    }

    protected void configureOtherAssetTypeNode(OtherAssetTypeNode node) {
    }

    @ComponentScope
    public static class OtherAssetTypeNodeRuleProvider implements RuleProvider<OtherAssetTypeNode> {

        @Inject
        public OtherAssetTypeNodeRuleProvider() {

        }

        @Override
        public void initializeState(OtherAssetTypeNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected OtherAssetDescriptionNode newOtherAssetDescriptionNode(
        OtherAssetNode parent,
        String name
    ) {
        return new OtherAssetDescriptionNode(parent, name);
    }

    protected void configureOtherAssetDescriptionNode(OtherAssetDescriptionNode node) {
    }

    @ComponentScope
    public static class OtherAssetDescriptionNodeRuleProvider implements RuleProvider<OtherAssetDescriptionNode> {

        @Inject
        public OtherAssetDescriptionNodeRuleProvider() {

        }

        @Override
        public void initializeState(OtherAssetDescriptionNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected OtherAssetMarketValueNode newOtherAssetMarketValueNode(
        OtherAssetNode parent,
        String name
    ) {
        return new OtherAssetMarketValueNode(parent, name);
    }

    protected void configureOtherAssetMarketValueNode(OtherAssetMarketValueNode node) {
    }

    @ComponentScope
    public static class OtherAssetMarketValueNodeRuleProvider implements RuleProvider<OtherAssetMarketValueNode> {

        @Inject
        public OtherAssetMarketValueNodeRuleProvider() {

        }

        @Override
        public void initializeState(OtherAssetMarketValueNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected OtherAssetOwnershipListNode newOwnershipListNode(
        OtherAssetNode parent,
        String name
    ) {
        return new OtherAssetOwnershipListNode(parent, name);
    }

    protected void configureOwnershipListNode(OtherAssetOwnershipListNode node) {
    }

    @ComponentScope
    public static class OwnershipListNodeRuleProvider implements RuleProvider<OtherAssetOwnershipListNode> {

        @Inject
        public OwnershipListNodeRuleProvider() {

        }

        @Override
        public void initializeState(OtherAssetOwnershipListNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    OtherAssetNodeChildFactory createFactory(OtherAssetNode parent) {
        return new OtherAssetNodeChildFactoryImpl(parent);
    }

    private class OtherAssetNodeChildFactoryImpl implements OtherAssetNodeChildFactory {

        private final OtherAssetNode parent;
        
        private OtherAssetNodeChildFactoryImpl(OtherAssetNode parent) {
            this.parent = parent;
        }

        @Override
        public OtherAssetTypeNode createOtherAssetTypeNode() {
            OtherAssetTypeNode node = newOtherAssetTypeNode(parent, "otherAssetTypeNode");
            otherAssetTypeNodeInjector.injectMembers(node);
            configureOtherAssetTypeNode(node);
            return node;
        }

        @Override
        public OtherAssetDescriptionNode createOtherAssetDescriptionNode() {
            OtherAssetDescriptionNode node = newOtherAssetDescriptionNode(parent, "otherAssetDescriptionNode");
            otherAssetDescriptionNodeInjector.injectMembers(node);
            configureOtherAssetDescriptionNode(node);
            return node;
        }

        @Override
        public OtherAssetMarketValueNode createOtherAssetMarketValueNode() {
            OtherAssetMarketValueNode node = newOtherAssetMarketValueNode(parent, "otherAssetMarketValueNode");
            otherAssetMarketValueNodeInjector.injectMembers(node);
            configureOtherAssetMarketValueNode(node);
            return node;
        }

        @Override
        public OtherAssetOwnershipListNode createOwnershipListNode() {
            OtherAssetOwnershipListNode node = newOwnershipListNode(parent, "ownershipListNode");
            otherAssetOwnershipListNodeInjector.injectMembers(node);
            configureOwnershipListNode(node);
            return node;
        }

    }
}
