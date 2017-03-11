package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import dagger.MembersInjector;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.*;


interface SavingsAccountNodeChildFactory {
    SavingsTypeNode createSavingsTypeNode();
    SavingsInstitutionNameNode createSavingsInstitutionNameNode();
    SavingsBalanceNode createSavingsBalanceNode();
    SavingsBsbNoNode createSavingsBsbNoNode();
    SavingsAccountNoNode createSavingsAccountNoNode();
    SavingsAccountNameNode createSavingsAccountNameNode();
    SavingsOwnershipListNode createOwnershipListNode();
}

@Singleton
public class SavingsAccountNodeChildProvider {
    @Inject
    MembersInjector<SavingsTypeNode> savingsTypeNodeInjector;
    @Inject
    MembersInjector<SavingsInstitutionNameNode> savingsInstitutionNameNodeInjector;
    @Inject
    MembersInjector<SavingsBalanceNode> savingsBalanceNodeInjector;
    @Inject
    MembersInjector<SavingsAccountNoNode> savingsAccountNoNodeInjector;
    @Inject
    MembersInjector<SavingsAccountNameNode> savingsAccountNameNodeInjector;
    @Inject
    MembersInjector<SavingsBsbNoNode> savingsBsbNoNodeInjector;
    @Inject
    MembersInjector<SavingsOwnershipListNode> savingsOwnershipListNodeInjector;

    @Inject
    protected SavingsAccountNodeChildProvider () {}

    protected MembersInjector<SavingsTypeNode> getSavingsTypeNodeInjector() {
        return this.savingsTypeNodeInjector;
    }

    protected MembersInjector<SavingsInstitutionNameNode> getSavingsInstitutionNameNodeInjector() {
        return this.savingsInstitutionNameNodeInjector;
    }

    protected MembersInjector<SavingsBalanceNode> getSavingsBalanceNodeInjector() {
        return this.savingsBalanceNodeInjector;
    }

    protected MembersInjector<SavingsAccountNoNode> getSavingsAccountNoNodeInjector() {
        return this.savingsAccountNoNodeInjector;
    }

    protected MembersInjector<SavingsAccountNameNode> getSavingsAccountNameNodeInjector() {
        return this.savingsAccountNameNodeInjector;
    }

    protected MembersInjector<SavingsBsbNoNode> getSavingsBsbNoNodeInjector() {
        return this.savingsBsbNoNodeInjector;
    }

    protected MembersInjector<SavingsOwnershipListNode> getSavingsOwnershipListNodeInjector() {
        return this.savingsOwnershipListNodeInjector;
    }

    protected SavingsTypeNode newSavingsTypeNode(
        SavingsAccountNode parent,
        String name
    ) {
        return new SavingsTypeNode(parent, name);
    }

    protected void configureSavingsTypeNode(SavingsTypeNode node) {
    }

    @SavingsTypeNodeScope
    public static class SavingsTypeNodeRuleProvider implements RuleProvider<SavingsTypeNode> {

        @Inject
        public SavingsTypeNodeRuleProvider() {

        }

        @Override
        public void initializeState(SavingsTypeNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected SavingsInstitutionNameNode newSavingsInstitutionNameNode(
        SavingsAccountNode parent,
        String name
    ) {
        return new SavingsInstitutionNameNode(parent, name);
    }

    protected void configureSavingsInstitutionNameNode(SavingsInstitutionNameNode node) {
    }

    @SavingsInstitutionNameNodeScope
    public static class SavingsInstitutionNameNodeRuleProvider implements RuleProvider<SavingsInstitutionNameNode> {

        @Inject
        public SavingsInstitutionNameNodeRuleProvider() {

        }

        @Override
        public void initializeState(SavingsInstitutionNameNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected SavingsBalanceNode newSavingsBalanceNode(
        SavingsAccountNode parent,
        String name
    ) {
        return new SavingsBalanceNode(parent, name);
    }

    protected void configureSavingsBalanceNode(SavingsBalanceNode node) {
    }

    @SavingsBalanceNodeScope
    public static class SavingsBalanceNodeRuleProvider implements RuleProvider<SavingsBalanceNode> {

        @Inject
        public SavingsBalanceNodeRuleProvider() {

        }

        @Override
        public void initializeState(SavingsBalanceNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected SavingsBsbNoNode newSavingsBsbNoNode(
        SavingsAccountNode parent,
        String name
    ) {
        return new SavingsBsbNoNode(parent, name);
    }

    protected void configureSavingsBsbNoNode(SavingsBsbNoNode node) {
    }

    @SavingsBsbNoNodeScope
    public static class SavingsBsbNoNodeRuleProvider implements RuleProvider<SavingsBsbNoNode> {

        @Inject
        public SavingsBsbNoNodeRuleProvider() {

        }

        @Override
        public void initializeState(SavingsBsbNoNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected SavingsAccountNoNode newSavingsAccountNoNode(
        SavingsAccountNode parent,
        String name
    ) {
        return new SavingsAccountNoNode(parent, name);
    }

    protected void configureSavingsAccountNoNode(SavingsAccountNoNode node) {
    }

    @SavingsAccountNoNodeScope
    public static class SavingsAccountNoNodeRuleProvider implements RuleProvider<SavingsAccountNoNode> {

        @Inject
        public SavingsAccountNoNodeRuleProvider() {

        }

        @Override
        public void initializeState(SavingsAccountNoNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected SavingsAccountNameNode newSavingsAccountNameNode(
        SavingsAccountNode parent,
        String name
    ) {
        return new SavingsAccountNameNode(parent, name);
    }

    protected void configureSavingsAccountNameNode(SavingsAccountNameNode node) {
    }

    @SavingsAccountNameNodeScope
    public static class SavingsAccountNameNodeRuleProvider implements RuleProvider<SavingsAccountNameNode> {

        @Inject
        public SavingsAccountNameNodeRuleProvider() {

        }

        @Override
        public void initializeState(SavingsAccountNameNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected SavingsOwnershipListNode newOwnershipListNode(
        SavingsAccountNode parent,
        String name
    ) {
        return new SavingsOwnershipListNode(parent, name);
    }

    protected void configureOwnershipListNode(SavingsOwnershipListNode node) {
    }

    @SavingsOwnershipListNodeScope
    public static class OwnershipListNodeRuleProvider implements RuleProvider<SavingsOwnershipListNode> {

        @Inject
        public OwnershipListNodeRuleProvider() {

        }

        @Override
        public void initializeState(SavingsOwnershipListNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    SavingsAccountNodeChildFactory createFactory(SavingsAccountNode parent) {
        return new SavingsAccountNodeChildFactoryImpl(parent);
    }

    private class SavingsAccountNodeChildFactoryImpl implements SavingsAccountNodeChildFactory {

        private final SavingsAccountNode parent;
        
        private SavingsAccountNodeChildFactoryImpl(SavingsAccountNode parent) {
            this.parent = parent;
        }

        @Override
        public SavingsTypeNode createSavingsTypeNode() {
            SavingsTypeNode node = newSavingsTypeNode(parent, "savingsTypeNode");
            savingsTypeNodeInjector.injectMembers(node);
            configureSavingsTypeNode(node);
            return node;
        }

        @Override
        public SavingsInstitutionNameNode createSavingsInstitutionNameNode() {
            SavingsInstitutionNameNode node = newSavingsInstitutionNameNode(parent, "savingsInstitutionNameNode");
            savingsInstitutionNameNodeInjector.injectMembers(node);
            configureSavingsInstitutionNameNode(node);
            return node;
        }

        @Override
        public SavingsBalanceNode createSavingsBalanceNode() {
            SavingsBalanceNode node = newSavingsBalanceNode(parent, "savingsBalanceNode");
            savingsBalanceNodeInjector.injectMembers(node);
            configureSavingsBalanceNode(node);
            return node;
        }

        @Override
        public SavingsBsbNoNode createSavingsBsbNoNode() {
            SavingsBsbNoNode node = newSavingsBsbNoNode(parent, "savingsBsbNoNode");
            savingsBsbNoNodeInjector.injectMembers(node);
            configureSavingsBsbNoNode(node);
            return node;
        }

        @Override
        public SavingsAccountNoNode createSavingsAccountNoNode() {
            SavingsAccountNoNode node = newSavingsAccountNoNode(parent, "savingsAccountNoNode");
            savingsAccountNoNodeInjector.injectMembers(node);
            configureSavingsAccountNoNode(node);
            return node;
        }

        @Override
        public SavingsAccountNameNode createSavingsAccountNameNode() {
            SavingsAccountNameNode node = newSavingsAccountNameNode(parent, "savingsAccountNameNode");
            savingsAccountNameNodeInjector.injectMembers(node);
            configureSavingsAccountNameNode(node);
            return node;
        }

        @Override
        public SavingsOwnershipListNode createOwnershipListNode() {
            SavingsOwnershipListNode node = newOwnershipListNode(parent, "ownershipListNode");
            savingsOwnershipListNodeInjector.injectMembers(node);
            configureOwnershipListNode(node);
            return node;
        }

    }
}
