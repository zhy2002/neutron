package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class EmployerAddressNodeModule {

    private final EmployerAddressNode owner;

    public EmployerAddressNodeModule(EmployerAddressNode owner) {
        this.owner = owner;
    }

    @Provides @EmployerAddressNodeScope @Owner EmployerAddressNode provideEmployerAddressNode() {
        return owner;
    }

    @Provides @EmployerAddressNodeScope @Owner AddressNode<?> provideAddressNode() {
        return owner;
    }

    @Provides @EmployerAddressNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @EmployerAddressNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @EmployerAddressNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @EmployerAddressNodeScope EmployedNode provideEmployedNode() {
        return owner.getParent();
    }

    @Provides @EmployerAddressNodeScope
    RuleProvider<EmployerAddressNode> provideRuleProvider(Provider<EmployerAddressNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @EmployerAddressNodeScope
    Map<String, RuleProvider<EmployerAddressNode>> provideInstanceProviderMap(
        Provider<EmployedNodeChildProvider.EmployerAddressNodeRuleProvider> employerAddressNodeRuleProvider
    ) {
        Map<String, RuleProvider<EmployerAddressNode>> result = new HashMap<>();
        result.put("employerAddressNode", employerAddressNodeRuleProvider.get());
        return result;
    }
}