package zhy2002.examples.lodgement.gen.node;
/* template name: child_factory.ftl */
import zhy2002.neutron.*;
import dagger.MembersInjector;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.*;
import zhy2002.neutron.di.ComponentScope;


public class OtherAssetNodeChildProvider {


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

}
