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

    @Provides @ComponentScope @Owner EmployerAddressNode provideEmployerAddressNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner AddressNode<?> provideAddressNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ChildName String provideChildName() {
        return owner.getContext().getNameOfNodeBeingCreated();
    }

    @Provides @ComponentScope EmployedNode provideEmployedNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<EmployerAddressNode> provideRuleProvider(Provider<EmployerAddressNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<EmployerAddressNode>> provideInstanceProviderMap(
        Provider<EmployedNodeChildProvider.EmployerAddressNodeRuleProvider> employerAddressNodeRuleProvider
    ) {
        Map<String, RuleProvider<EmployerAddressNode>> result = new HashMap<>();
        result.put("employerAddressNode", employerAddressNodeRuleProvider.get());
        return result;
    }
}