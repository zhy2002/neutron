package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import dagger.MembersInjector;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.*;


interface BaseResponsibleLendNodeChildFactory {
    ResponsibleTypeOfChangeNode createResponsibleTypeOfChangeNode();
    ResponsibleMitigationMethodNode createResponsibleMitigationMethodNode();
    ResponsibleSignificantChangeFlagNode createResponsibleSignificantChangeFlagNode();
    ResponsibleRepaymentDifficultyNode createResponsibleRepaymentDifficultyNode();
}

@Singleton
public class BaseResponsibleLendNodeChildProvider {
    @Inject
    MembersInjector<ResponsibleTypeOfChangeNode> responsibleTypeOfChangeNodeInjector;
    @Inject
    MembersInjector<ResponsibleMitigationMethodNode> responsibleMitigationMethodNodeInjector;
    @Inject
    MembersInjector<ResponsibleSignificantChangeFlagNode> responsibleSignificantChangeFlagNodeInjector;
    @Inject
    MembersInjector<ResponsibleRepaymentDifficultyNode> responsibleRepaymentDifficultyNodeInjector;

    @Inject
    protected BaseResponsibleLendNodeChildProvider () {}

    protected MembersInjector<ResponsibleTypeOfChangeNode> getResponsibleTypeOfChangeNodeInjector() {
        return this.responsibleTypeOfChangeNodeInjector;
    }

    protected MembersInjector<ResponsibleMitigationMethodNode> getResponsibleMitigationMethodNodeInjector() {
        return this.responsibleMitigationMethodNodeInjector;
    }

    protected MembersInjector<ResponsibleSignificantChangeFlagNode> getResponsibleSignificantChangeFlagNodeInjector() {
        return this.responsibleSignificantChangeFlagNodeInjector;
    }

    protected MembersInjector<ResponsibleRepaymentDifficultyNode> getResponsibleRepaymentDifficultyNodeInjector() {
        return this.responsibleRepaymentDifficultyNodeInjector;
    }

    protected ResponsibleTypeOfChangeNode newResponsibleTypeOfChangeNode(
        BaseResponsibleLendNode<?> parent,
        String name
    ) {
        return new ResponsibleTypeOfChangeNode(parent, name);
    }

    protected void configureResponsibleTypeOfChangeNode(ResponsibleTypeOfChangeNode node) {
    }

    @ResponsibleTypeOfChangeNodeScope
    public static class ResponsibleTypeOfChangeNodeRuleProvider implements RuleProvider<ResponsibleTypeOfChangeNode> {

        @Inject
        public ResponsibleTypeOfChangeNodeRuleProvider() {

        }

        @Override
        public void initializeState(ResponsibleTypeOfChangeNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected ResponsibleMitigationMethodNode newResponsibleMitigationMethodNode(
        BaseResponsibleLendNode<?> parent,
        String name
    ) {
        return new ResponsibleMitigationMethodNode(parent, name);
    }

    protected void configureResponsibleMitigationMethodNode(ResponsibleMitigationMethodNode node) {
    }

    @ResponsibleMitigationMethodNodeScope
    public static class ResponsibleMitigationMethodNodeRuleProvider implements RuleProvider<ResponsibleMitigationMethodNode> {

        @Inject
        public ResponsibleMitigationMethodNodeRuleProvider() {

        }

        @Override
        public void initializeState(ResponsibleMitigationMethodNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected ResponsibleSignificantChangeFlagNode newResponsibleSignificantChangeFlagNode(
        BaseResponsibleLendNode<?> parent,
        String name
    ) {
        return new ResponsibleSignificantChangeFlagNode(parent, name);
    }

    protected void configureResponsibleSignificantChangeFlagNode(ResponsibleSignificantChangeFlagNode node) {
    }

    @ResponsibleSignificantChangeFlagNodeScope
    public static class ResponsibleSignificantChangeFlagNodeRuleProvider implements RuleProvider<ResponsibleSignificantChangeFlagNode> {

        @Inject
        public ResponsibleSignificantChangeFlagNodeRuleProvider() {

        }

        @Override
        public void initializeState(ResponsibleSignificantChangeFlagNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected ResponsibleRepaymentDifficultyNode newResponsibleRepaymentDifficultyNode(
        BaseResponsibleLendNode<?> parent,
        String name
    ) {
        return new ResponsibleRepaymentDifficultyNode(parent, name);
    }

    protected void configureResponsibleRepaymentDifficultyNode(ResponsibleRepaymentDifficultyNode node) {
    }

    @ResponsibleRepaymentDifficultyNodeScope
    public static class ResponsibleRepaymentDifficultyNodeRuleProvider implements RuleProvider<ResponsibleRepaymentDifficultyNode> {

        @Inject
        public ResponsibleRepaymentDifficultyNodeRuleProvider() {

        }

        @Override
        public void initializeState(ResponsibleRepaymentDifficultyNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    BaseResponsibleLendNodeChildFactory createFactory(BaseResponsibleLendNode<?> parent) {
        return new BaseResponsibleLendNodeChildFactoryImpl(parent);
    }

    private class BaseResponsibleLendNodeChildFactoryImpl implements BaseResponsibleLendNodeChildFactory {

        private final BaseResponsibleLendNode<?> parent;
        
        private BaseResponsibleLendNodeChildFactoryImpl(BaseResponsibleLendNode<?> parent) {
            this.parent = parent;
        }

        @Override
        public ResponsibleTypeOfChangeNode createResponsibleTypeOfChangeNode() {
            ResponsibleTypeOfChangeNode node = newResponsibleTypeOfChangeNode(parent, "responsibleTypeOfChangeNode");
            responsibleTypeOfChangeNodeInjector.injectMembers(node);
            configureResponsibleTypeOfChangeNode(node);
            return node;
        }

        @Override
        public ResponsibleMitigationMethodNode createResponsibleMitigationMethodNode() {
            ResponsibleMitigationMethodNode node = newResponsibleMitigationMethodNode(parent, "responsibleMitigationMethodNode");
            responsibleMitigationMethodNodeInjector.injectMembers(node);
            configureResponsibleMitigationMethodNode(node);
            return node;
        }

        @Override
        public ResponsibleSignificantChangeFlagNode createResponsibleSignificantChangeFlagNode() {
            ResponsibleSignificantChangeFlagNode node = newResponsibleSignificantChangeFlagNode(parent, "responsibleSignificantChangeFlagNode");
            responsibleSignificantChangeFlagNodeInjector.injectMembers(node);
            configureResponsibleSignificantChangeFlagNode(node);
            return node;
        }

        @Override
        public ResponsibleRepaymentDifficultyNode createResponsibleRepaymentDifficultyNode() {
            ResponsibleRepaymentDifficultyNode node = newResponsibleRepaymentDifficultyNode(parent, "responsibleRepaymentDifficultyNode");
            responsibleRepaymentDifficultyNodeInjector.injectMembers(node);
            configureResponsibleRepaymentDifficultyNode(node);
            return node;
        }

    }
}
