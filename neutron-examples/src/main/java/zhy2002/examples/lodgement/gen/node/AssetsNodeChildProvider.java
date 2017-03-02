package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;


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

    protected MotorVehicleListNode newMotorVehicleListNode(
        AssetsNode parent,
        String name
    ) {
        return new MotorVehicleListNode(parent, name);
    }

    protected void configureMotorVehicleListNode(MotorVehicleListNode node) {
    }

    protected OtherAssetListNode newOtherAssetListNode(
        AssetsNode parent,
        String name
    ) {
        return new OtherAssetListNode(parent, name);
    }

    protected void configureOtherAssetListNode(OtherAssetListNode node) {
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
