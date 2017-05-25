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

    @Provides @DriversLicenseNodeScope @Owner DriversLicenseNode provideDriversLicenseNode() {
        return owner;
    }

    @Provides @DriversLicenseNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @DriversLicenseNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @DriversLicenseNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @DriversLicenseNodeScope PersonGeneralNode providePersonGeneralNode() {
        return owner.getParent();
    }

    @Provides @DriversLicenseNodeScope
    RuleProvider<DriversLicenseNode> provideRuleProvider(Provider<DriversLicenseNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @DriversLicenseNodeScope
    Map<String, RuleProvider<DriversLicenseNode>> provideInstanceProviderMap(
        Provider<PersonGeneralNodeChildProvider.DriversLicenseNodeRuleProvider> driversLicenseNodeRuleProvider
    ) {
        Map<String, RuleProvider<DriversLicenseNode>> result = new HashMap<>();
        result.put("driversLicenseNode", driversLicenseNodeRuleProvider.get());
        return result;
    }
}