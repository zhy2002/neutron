package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
})
@AssetsNodeChildScope
public class AssetsNodeChildModule {


    @Provides
    @AssetsNodeChildScope
    @Named("savingsAccountListNode")
    SavingsAccountListNode provideSavingsAccountListNode(
        AssetsNode parent,
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
        AssetsNode parent,
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
        AssetsNode parent,
        MembersInjector<OtherAssetListNode> injector
    ) {
        OtherAssetListNode node = new OtherAssetListNode(parent, "otherAssetListNode");

        injector.injectMembers(node);
        return node;
    }

}