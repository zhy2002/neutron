package zhy2002.examples.lodgement.gen.node;
/* template name: child_factory.ftl */
import zhy2002.neutron.*;
import dagger.MembersInjector;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.*;


interface AssetsNodeChildFactory {
    SavingsAccountListNode createSavingsAccountListNode();
    MotorVehicleListNode createMotorVehicleListNode();
    OtherAssetListNode createOtherAssetListNode();
}

@Singleton
public class AssetsNodeChildProvider {
    @Inject
    MembersInjector<OtherAssetListNode> otherAssetListNodeInjector;
    @Inject
    MembersInjector<MotorVehicleListNode> motorVehicleListNodeInjector;
    @Inject
    MembersInjector<SavingsAccountListNode> savingsAccountListNodeInjector;

    @Inject
    protected AssetsNodeChildProvider () {}

    protected MembersInjector<OtherAssetListNode> getOtherAssetListNodeInjector() {
        return this.otherAssetListNodeInjector;
    }

    protected MembersInjector<MotorVehicleListNode> getMotorVehicleListNodeInjector() {
        return this.motorVehicleListNodeInjector;
    }

    protected MembersInjector<SavingsAccountListNode> getSavingsAccountListNodeInjector() {
        return this.savingsAccountListNodeInjector;
    }

    protected SavingsAccountListNode newSavingsAccountListNode(
        AssetsNode parent,
        String name
    ) {
        return new SavingsAccountListNode(parent, name);
    }

    protected void configureSavingsAccountListNode(SavingsAccountListNode node) {
    }

    @SavingsAccountListNodeScope
    public static class SavingsAccountListNodeRuleProvider implements RuleProvider<SavingsAccountListNode> {

        @Inject
        public SavingsAccountListNodeRuleProvider() {

        }

        @Override
        public void initializeState(SavingsAccountListNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected MotorVehicleListNode newMotorVehicleListNode(
        AssetsNode parent,
        String name
    ) {
        return new MotorVehicleListNode(parent, name);
    }

    protected void configureMotorVehicleListNode(MotorVehicleListNode node) {
    }

    @MotorVehicleListNodeScope
    public static class MotorVehicleListNodeRuleProvider implements RuleProvider<MotorVehicleListNode> {

        @Inject
        public MotorVehicleListNodeRuleProvider() {

        }

        @Override
        public void initializeState(MotorVehicleListNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected OtherAssetListNode newOtherAssetListNode(
        AssetsNode parent,
        String name
    ) {
        return new OtherAssetListNode(parent, name);
    }

    protected void configureOtherAssetListNode(OtherAssetListNode node) {
    }

    @OtherAssetListNodeScope
    public static class OtherAssetListNodeRuleProvider implements RuleProvider<OtherAssetListNode> {

        @Inject
        public OtherAssetListNodeRuleProvider() {

        }

        @Override
        public void initializeState(OtherAssetListNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    AssetsNodeChildFactory createFactory(AssetsNode parent) {
        return new AssetsNodeChildFactoryImpl(parent);
    }

    private class AssetsNodeChildFactoryImpl implements AssetsNodeChildFactory {

        private final AssetsNode parent;
        
        private AssetsNodeChildFactoryImpl(AssetsNode parent) {
            this.parent = parent;
        }

        @Override
        public SavingsAccountListNode createSavingsAccountListNode() {
            SavingsAccountListNode node = newSavingsAccountListNode(parent, "savingsAccountListNode");
            savingsAccountListNodeInjector.injectMembers(node);
            configureSavingsAccountListNode(node);
            return node;
        }

        @Override
        public MotorVehicleListNode createMotorVehicleListNode() {
            MotorVehicleListNode node = newMotorVehicleListNode(parent, "motorVehicleListNode");
            motorVehicleListNodeInjector.injectMembers(node);
            configureMotorVehicleListNode(node);
            return node;
        }

        @Override
        public OtherAssetListNode createOtherAssetListNode() {
            OtherAssetListNode node = newOtherAssetListNode(parent, "otherAssetListNode");
            otherAssetListNodeInjector.injectMembers(node);
            configureOtherAssetListNode(node);
            return node;
        }

    }
}
