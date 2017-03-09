package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import dagger.MembersInjector;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.*;


interface RetiredEmploymentNodeChildFactory {
    RetiredOnBenefitFlagNode createRetiredOnBenefitFlagNode();
    RetiredSinceNode createRetiredSinceNode();
}

@Singleton
public class RetiredEmploymentNodeChildProvider {
    @Inject
    MembersInjector<RetiredOnBenefitFlagNode> retiredOnBenefitFlagNodeInjector;
    @Inject
    MembersInjector<RetiredSinceNode> retiredSinceNodeInjector;

    @Inject
    protected RetiredEmploymentNodeChildProvider () {}

    protected MembersInjector<RetiredOnBenefitFlagNode> getRetiredOnBenefitFlagNodeInjector() {
        return this.retiredOnBenefitFlagNodeInjector;
    }

    protected MembersInjector<RetiredSinceNode> getRetiredSinceNodeInjector() {
        return this.retiredSinceNodeInjector;
    }

    protected RetiredOnBenefitFlagNode newRetiredOnBenefitFlagNode(
        RetiredEmploymentNode parent,
        String name
    ) {
        return new RetiredOnBenefitFlagNode(parent, name);
    }

    protected void configureRetiredOnBenefitFlagNode(RetiredOnBenefitFlagNode node) {
    }

    @RetiredOnBenefitFlagNodeScope
    public static class RetiredOnBenefitFlagNodeRuleProvider implements RuleProvider<RetiredOnBenefitFlagNode> {

        @Inject
        public RetiredOnBenefitFlagNodeRuleProvider() {

        }

        @Override
        public void initializeState(RetiredOnBenefitFlagNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected RetiredSinceNode newRetiredSinceNode(
        RetiredEmploymentNode parent,
        String name
    ) {
        return new RetiredSinceNode(parent, name);
    }

    protected void configureRetiredSinceNode(RetiredSinceNode node) {
    }

    @RetiredSinceNodeScope
    public static class RetiredSinceNodeRuleProvider implements RuleProvider<RetiredSinceNode> {

        @Inject
        public RetiredSinceNodeRuleProvider() {

        }

        @Override
        public void initializeState(RetiredSinceNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    RetiredEmploymentNodeChildFactory createFactory(RetiredEmploymentNode parent) {
        return new RetiredEmploymentNodeChildFactoryImpl(parent);
    }

    private class RetiredEmploymentNodeChildFactoryImpl implements RetiredEmploymentNodeChildFactory {

        private final RetiredEmploymentNode parent;
        
        private RetiredEmploymentNodeChildFactoryImpl(RetiredEmploymentNode parent) {
            this.parent = parent;
        }

        @Override
        public RetiredOnBenefitFlagNode createRetiredOnBenefitFlagNode() {
            RetiredOnBenefitFlagNode node = newRetiredOnBenefitFlagNode(parent, "retiredOnBenefitFlagNode");
            retiredOnBenefitFlagNodeInjector.injectMembers(node);
            configureRetiredOnBenefitFlagNode(node);
            return node;
        }

        @Override
        public RetiredSinceNode createRetiredSinceNode() {
            RetiredSinceNode node = newRetiredSinceNode(parent, "retiredSinceNode");
            retiredSinceNodeInjector.injectMembers(node);
            configureRetiredSinceNode(node);
            return node;
        }

    }
}
