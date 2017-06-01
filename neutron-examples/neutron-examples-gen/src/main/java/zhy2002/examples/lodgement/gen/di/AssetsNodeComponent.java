package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {AssetsNodeModule.class})
public interface AssetsNodeComponent {

    List<RuleProvider<AssetsNode>> provideRuleProviders();

    SavingsAccountListNode createSavingsAccountListNode();
    MotorVehicleListNode createMotorVehicleListNode();
    OtherAssetListNode createOtherAssetListNode();

    @Subcomponent.Builder
    interface Builder {

        Builder setAssetsNodeModule(AssetsNodeModule module);

        AssetsNodeComponent build();
    }

}
