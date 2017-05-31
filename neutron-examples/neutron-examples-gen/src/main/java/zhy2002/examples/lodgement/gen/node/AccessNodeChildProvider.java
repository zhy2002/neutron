package zhy2002.examples.lodgement.gen.node;
/* template name: child_factory.ftl */
import zhy2002.neutron.*;
import dagger.MembersInjector;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.*;
import zhy2002.neutron.di.ComponentScope;


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
    MembersInjector<AccessContactLastNameNode> accessContactLastNameNodeInjector;
    @Inject
    MembersInjector<AccessOtherDescriptionNode> accessOtherDescriptionNodeInjector;
    @Inject
    MembersInjector<AccessContactFirstNameNode> accessContactFirstNameNodeInjector;
    @Inject
    MembersInjector<AccessContactTypeNode> accessContactTypeNodeInjector;
    @Inject
    MembersInjector<AccessContactTitleNode> accessContactTitleNodeInjector;
    @Inject
    MembersInjector<AccessTelephoneNode> accessTelephoneNodeInjector;
    @Inject
    MembersInjector<AccessCompanyNameNode> accessCompanyNameNodeInjector;

    @Inject
    protected AccessNodeChildProvider () {}

    protected MembersInjector<AccessContactLastNameNode> getAccessContactLastNameNodeInjector() {
        return this.accessContactLastNameNodeInjector;
    }

    protected MembersInjector<AccessOtherDescriptionNode> getAccessOtherDescriptionNodeInjector() {
        return this.accessOtherDescriptionNodeInjector;
    }

    protected MembersInjector<AccessContactFirstNameNode> getAccessContactFirstNameNodeInjector() {
        return this.accessContactFirstNameNodeInjector;
    }

    protected MembersInjector<AccessContactTypeNode> getAccessContactTypeNodeInjector() {
        return this.accessContactTypeNodeInjector;
    }

    protected MembersInjector<AccessContactTitleNode> getAccessContactTitleNodeInjector() {
        return this.accessContactTitleNodeInjector;
    }

    protected MembersInjector<AccessTelephoneNode> getAccessTelephoneNodeInjector() {
        return this.accessTelephoneNodeInjector;
    }

    protected MembersInjector<AccessCompanyNameNode> getAccessCompanyNameNodeInjector() {
        return this.accessCompanyNameNodeInjector;
    }

    protected AccessContactTypeNode newAccessContactTypeNode(
        AccessNode parent,
        String name
    ) {
        return new AccessContactTypeNode(parent, name);
    }

    protected void configureAccessContactTypeNode(AccessContactTypeNode node) {
    }

    @ComponentScope
    public static class AccessContactTypeNodeRuleProvider implements RuleProvider<AccessContactTypeNode> {

        @Inject
        public AccessContactTypeNodeRuleProvider() {

        }

        @Override
        public void initializeState(AccessContactTypeNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected AccessContactTitleNode newAccessContactTitleNode(
        AccessNode parent,
        String name
    ) {
        return new AccessContactTitleNode(parent, name);
    }

    protected void configureAccessContactTitleNode(AccessContactTitleNode node) {
    }

    @ComponentScope
    public static class AccessContactTitleNodeRuleProvider implements RuleProvider<AccessContactTitleNode> {

        @Inject
        public AccessContactTitleNodeRuleProvider() {

        }

        @Override
        public void initializeState(AccessContactTitleNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected AccessContactFirstNameNode newAccessContactFirstNameNode(
        AccessNode parent,
        String name
    ) {
        return new AccessContactFirstNameNode(parent, name);
    }

    protected void configureAccessContactFirstNameNode(AccessContactFirstNameNode node) {
    }

    @ComponentScope
    public static class AccessContactFirstNameNodeRuleProvider implements RuleProvider<AccessContactFirstNameNode> {

        @Inject
        public AccessContactFirstNameNodeRuleProvider() {

        }

        @Override
        public void initializeState(AccessContactFirstNameNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected AccessContactLastNameNode newAccessContactLastNameNode(
        AccessNode parent,
        String name
    ) {
        return new AccessContactLastNameNode(parent, name);
    }

    protected void configureAccessContactLastNameNode(AccessContactLastNameNode node) {
    }

    @ComponentScope
    public static class AccessContactLastNameNodeRuleProvider implements RuleProvider<AccessContactLastNameNode> {

        @Inject
        public AccessContactLastNameNodeRuleProvider() {

        }

        @Override
        public void initializeState(AccessContactLastNameNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected AccessCompanyNameNode newAccessCompanyNameNode(
        AccessNode parent,
        String name
    ) {
        return new AccessCompanyNameNode(parent, name);
    }

    protected void configureAccessCompanyNameNode(AccessCompanyNameNode node) {
    }

    @ComponentScope
    public static class AccessCompanyNameNodeRuleProvider implements RuleProvider<AccessCompanyNameNode> {

        @Inject
        public AccessCompanyNameNodeRuleProvider() {

        }

        @Override
        public void initializeState(AccessCompanyNameNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected AccessTelephoneNode newAccessTelephoneNode(
        AccessNode parent,
        String name
    ) {
        return new AccessTelephoneNode(parent, name);
    }

    protected void configureAccessTelephoneNode(AccessTelephoneNode node) {
    }

    @ComponentScope
    public static class AccessTelephoneNodeRuleProvider implements RuleProvider<AccessTelephoneNode> {

        @Inject
        public AccessTelephoneNodeRuleProvider() {

        }

        @Override
        public void initializeState(AccessTelephoneNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected AccessOtherDescriptionNode newAccessOtherDescriptionNode(
        AccessNode parent,
        String name
    ) {
        return new AccessOtherDescriptionNode(parent, name);
    }

    protected void configureAccessOtherDescriptionNode(AccessOtherDescriptionNode node) {
    }

    @ComponentScope
    public static class AccessOtherDescriptionNodeRuleProvider implements RuleProvider<AccessOtherDescriptionNode> {

        @Inject
        public AccessOtherDescriptionNodeRuleProvider() {

        }

        @Override
        public void initializeState(AccessOtherDescriptionNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
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
