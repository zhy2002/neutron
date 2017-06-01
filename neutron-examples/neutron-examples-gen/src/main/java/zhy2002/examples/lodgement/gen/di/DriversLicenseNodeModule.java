package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class DriversLicenseNodeModule {

    private final DriversLicenseNode owner;

    public DriversLicenseNodeModule(DriversLicenseNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner DriversLicenseNode provideDriversLicenseNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ChildName String provideChildName() {
        return owner.getContext().getNameOfNodeBeingCreated();
    }

    @Provides @ComponentScope PersonGeneralNode providePersonGeneralNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<DriversLicenseNode> provideRuleProvider(Provider<DriversLicenseNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<DriversLicenseNode>> provideInstanceProviderMap(
        Provider<PersonGeneralNodeChildProvider.DriversLicenseNodeRuleProvider> driversLicenseNodeRuleProvider
    ) {
        Map<String, RuleProvider<DriversLicenseNode>> result = new HashMap<>();
        result.put("driversLicenseNode", driversLicenseNodeRuleProvider.get());
        return result;
    }
}