package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@AssetsNodeChildScope
@Subcomponent(modules = {AssetsNodeChildModule.class})
public interface AssetsNodeChildComponent {

    SavingsAccountListNode provideSavingsAccountListNode(@Named("savingsAccountListNode") SavingsAccountListNode impl);
    MotorVehicleListNode provideMotorVehicleListNode(@Named("motorVehicleListNode") MotorVehicleListNode impl);
    OtherAssetListNode provideOtherAssetListNode(@Named("otherAssetListNode") OtherAssetListNode impl);

    @Subcomponent.Builder
    interface Builder {

        Builder setAssetsNodeChildModule(AssetsNodeChildModule module);

        AssetsNodeChildComponent build();
    }
}
