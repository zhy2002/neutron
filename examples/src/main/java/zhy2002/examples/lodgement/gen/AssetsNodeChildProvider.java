package zhy2002.examples.lodgement.gen;

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
    MembersInjector<SavingsAccountListNode> savingsAccountListNodeInjector;
    @Inject
    MembersInjector<MotorVehicleListNode> motorVehicleListNodeInjector;
    @Inject
    MembersInjector<OtherAssetListNode> otherAssetListNodeInjector;

    @Inject
    protected AssetsNodeChildProvider () {}

    protected MembersInjector<SavingsAccountListNode> getSavingsAccountListNodeInjector() {
        return this.savingsAccountListNodeInjector;
    }

    protected MembersInjector<MotorVehicleListNode> getMotorVehicleListNodeInjector() {
        return this.motorVehicleListNodeInjector;
    }

    protected MembersInjector<OtherAssetListNode> getOtherAssetListNodeInjector() {
        return this.otherAssetListNodeInjector;
    }

    protected SavingsAccountListNode newSavingsAccountListNode(
        AssetsNode parent,
        String name
    ) {
        return new SavingsAccountListNode(parent, name);
    }

    protected MotorVehicleListNode newMotorVehicleListNode(
        AssetsNode parent,
        String name
    ) {
        return new MotorVehicleListNode(parent, name);
    }

    protected OtherAssetListNode newOtherAssetListNode(
        AssetsNode parent,
        String name
    ) {
        return new OtherAssetListNode(parent, name);
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
            return node;
        }

        @Override
        public MotorVehicleListNode createMotorVehicleListNode() {
            MotorVehicleListNode node = newMotorVehicleListNode(parent, "motorVehicleListNode");
            motorVehicleListNodeInjector.injectMembers(node);
            return node;
        }

        @Override
        public OtherAssetListNode createOtherAssetListNode() {
            OtherAssetListNode node = newOtherAssetListNode(parent, "otherAssetListNode");
            otherAssetListNodeInjector.injectMembers(node);
            return node;
        }

    }
}
