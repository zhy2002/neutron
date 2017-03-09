package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import dagger.MembersInjector;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.*;


interface EmployedNodeChildFactory {
    EmploymentStatusNode createEmploymentStatusNode();
    OccupationNode createOccupationNode();
    EmployerNameNode createEmployerNameNode();
    EmployerAddressNode createEmployerAddressNode();
    EmployerPhoneNode createEmployerPhoneNode();
    EmploymentStartedNode createEmploymentStartedNode();
    EmploymentEndedNode createEmploymentEndedNode();
}

@Singleton
public class EmployedNodeChildProvider {
    @Inject
    MembersInjector<EmployerNameNode> employerNameNodeInjector;
    @Inject
    MembersInjector<EmployerAddressNode> employerAddressNodeInjector;
    @Inject
    MembersInjector<OccupationNode> occupationNodeInjector;
    @Inject
    MembersInjector<EmployerPhoneNode> employerPhoneNodeInjector;
    @Inject
    MembersInjector<EmploymentStatusNode> employmentStatusNodeInjector;
    @Inject
    MembersInjector<EmploymentStartedNode> employmentStartedNodeInjector;
    @Inject
    MembersInjector<EmploymentEndedNode> employmentEndedNodeInjector;

    @Inject
    protected EmployedNodeChildProvider () {}

    protected MembersInjector<EmployerNameNode> getEmployerNameNodeInjector() {
        return this.employerNameNodeInjector;
    }

    protected MembersInjector<EmployerAddressNode> getEmployerAddressNodeInjector() {
        return this.employerAddressNodeInjector;
    }

    protected MembersInjector<OccupationNode> getOccupationNodeInjector() {
        return this.occupationNodeInjector;
    }

    protected MembersInjector<EmployerPhoneNode> getEmployerPhoneNodeInjector() {
        return this.employerPhoneNodeInjector;
    }

    protected MembersInjector<EmploymentStatusNode> getEmploymentStatusNodeInjector() {
        return this.employmentStatusNodeInjector;
    }

    protected MembersInjector<EmploymentStartedNode> getEmploymentStartedNodeInjector() {
        return this.employmentStartedNodeInjector;
    }

    protected MembersInjector<EmploymentEndedNode> getEmploymentEndedNodeInjector() {
        return this.employmentEndedNodeInjector;
    }

    protected EmploymentStatusNode newEmploymentStatusNode(
        EmployedNode parent,
        String name
    ) {
        return new EmploymentStatusNode(parent, name);
    }

    protected void configureEmploymentStatusNode(EmploymentStatusNode node) {
    }

    @EmploymentStatusNodeScope
    public static class EmploymentStatusNodeRuleProvider implements RuleProvider<EmploymentStatusNode> {

        @Inject
        public EmploymentStatusNodeRuleProvider() {

        }

        @Override
        public void initializeState(EmploymentStatusNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected OccupationNode newOccupationNode(
        EmployedNode parent,
        String name
    ) {
        return new OccupationNode(parent, name);
    }

    protected void configureOccupationNode(OccupationNode node) {
    }

    @OccupationNodeScope
    public static class OccupationNodeRuleProvider implements RuleProvider<OccupationNode> {

        @Inject
        public OccupationNodeRuleProvider() {

        }

        @Override
        public void initializeState(OccupationNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected EmployerNameNode newEmployerNameNode(
        EmployedNode parent,
        String name
    ) {
        return new EmployerNameNode(parent, name);
    }

    protected void configureEmployerNameNode(EmployerNameNode node) {
    }

    @EmployerNameNodeScope
    public static class EmployerNameNodeRuleProvider implements RuleProvider<EmployerNameNode> {

        @Inject
        public EmployerNameNodeRuleProvider() {

        }

        @Override
        public void initializeState(EmployerNameNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected EmployerAddressNode newEmployerAddressNode(
        EmployedNode parent,
        String name
    ) {
        return new EmployerAddressNode(parent, name);
    }

    protected void configureEmployerAddressNode(EmployerAddressNode node) {
    }

    @EmployerAddressNodeScope
    public static class EmployerAddressNodeRuleProvider implements RuleProvider<EmployerAddressNode> {

        @Inject
        public EmployerAddressNodeRuleProvider() {

        }

        @Override
        public void initializeState(EmployerAddressNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected EmployerPhoneNode newEmployerPhoneNode(
        EmployedNode parent,
        String name
    ) {
        return new EmployerPhoneNode(parent, name);
    }

    protected void configureEmployerPhoneNode(EmployerPhoneNode node) {
    }

    @EmployerPhoneNodeScope
    public static class EmployerPhoneNodeRuleProvider implements RuleProvider<EmployerPhoneNode> {

        @Inject
        public EmployerPhoneNodeRuleProvider() {

        }

        @Override
        public void initializeState(EmployerPhoneNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected EmploymentStartedNode newEmploymentStartedNode(
        EmployedNode parent,
        String name
    ) {
        return new EmploymentStartedNode(parent, name);
    }

    protected void configureEmploymentStartedNode(EmploymentStartedNode node) {
    }

    @EmploymentStartedNodeScope
    public static class EmploymentStartedNodeRuleProvider implements RuleProvider<EmploymentStartedNode> {

        @Inject
        public EmploymentStartedNodeRuleProvider() {

        }

        @Override
        public void initializeState(EmploymentStartedNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected EmploymentEndedNode newEmploymentEndedNode(
        EmployedNode parent,
        String name
    ) {
        return new EmploymentEndedNode(parent, name);
    }

    protected void configureEmploymentEndedNode(EmploymentEndedNode node) {
    }

    @EmploymentEndedNodeScope
    public static class EmploymentEndedNodeRuleProvider implements RuleProvider<EmploymentEndedNode> {

        @Inject
        public EmploymentEndedNodeRuleProvider() {

        }

        @Override
        public void initializeState(EmploymentEndedNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    EmployedNodeChildFactory createFactory(EmployedNode parent) {
        return new EmployedNodeChildFactoryImpl(parent);
    }

    private class EmployedNodeChildFactoryImpl implements EmployedNodeChildFactory {

        private final EmployedNode parent;
        
        private EmployedNodeChildFactoryImpl(EmployedNode parent) {
            this.parent = parent;
        }

        @Override
        public EmploymentStatusNode createEmploymentStatusNode() {
            EmploymentStatusNode node = newEmploymentStatusNode(parent, "employmentStatusNode");
            employmentStatusNodeInjector.injectMembers(node);
            configureEmploymentStatusNode(node);
            return node;
        }

        @Override
        public OccupationNode createOccupationNode() {
            OccupationNode node = newOccupationNode(parent, "occupationNode");
            occupationNodeInjector.injectMembers(node);
            configureOccupationNode(node);
            return node;
        }

        @Override
        public EmployerNameNode createEmployerNameNode() {
            EmployerNameNode node = newEmployerNameNode(parent, "employerNameNode");
            employerNameNodeInjector.injectMembers(node);
            configureEmployerNameNode(node);
            return node;
        }

        @Override
        public EmployerAddressNode createEmployerAddressNode() {
            EmployerAddressNode node = newEmployerAddressNode(parent, "employerAddressNode");
            employerAddressNodeInjector.injectMembers(node);
            configureEmployerAddressNode(node);
            return node;
        }

        @Override
        public EmployerPhoneNode createEmployerPhoneNode() {
            EmployerPhoneNode node = newEmployerPhoneNode(parent, "employerPhoneNode");
            employerPhoneNodeInjector.injectMembers(node);
            configureEmployerPhoneNode(node);
            return node;
        }

        @Override
        public EmploymentStartedNode createEmploymentStartedNode() {
            EmploymentStartedNode node = newEmploymentStartedNode(parent, "employmentStartedNode");
            employmentStartedNodeInjector.injectMembers(node);
            configureEmploymentStartedNode(node);
            return node;
        }

        @Override
        public EmploymentEndedNode createEmploymentEndedNode() {
            EmploymentEndedNode node = newEmploymentEndedNode(parent, "employmentEndedNode");
            employmentEndedNodeInjector.injectMembers(node);
            configureEmploymentEndedNode(node);
            return node;
        }

    }
}
