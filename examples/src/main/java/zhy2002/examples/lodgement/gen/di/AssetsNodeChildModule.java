package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
    SavingsAccountListNodeItemComponent.class,
    MotorVehicleListNodeItemComponent.class,
    OtherAssetListNodeItemComponent.class
})
@AssetsNodeChildScope
public class AssetsNodeChildModule {

    private final AssetsNode parent;

    public AssetsNodeChildModule(AssetsNode parent) {
        this.parent = parent;
    }


    @Provides
    @AssetsNodeChildScope
    @Named("savingsAccountListNode")
    SavingsAccountListNode provideSavingsAccountListNode(
        MembersInjector<SavingsAccountListNode> injector
    ) {
        SavingsAccountListNode node = new SavingsAccountListNode(parent, "savingsAccountListNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @AssetsNodeChildScope
    @Named("motorVehicleListNode")
    MotorVehicleListNode provideMotorVehicleListNode(
        MembersInjector<MotorVehicleListNode> injector
    ) {
        MotorVehicleListNode node = new MotorVehicleListNode(parent, "motorVehicleListNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @AssetsNodeChildScope
    @Named("otherAssetListNode")
    OtherAssetListNode provideOtherAssetListNode(
        MembersInjector<OtherAssetListNode> injector
    ) {
        OtherAssetListNode node = new OtherAssetListNode(parent, "otherAssetListNode");

        injector.injectMembers(node);
        return node;
    }

}