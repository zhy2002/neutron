package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class EmployerPhoneNodeModule {

    private final EmployerPhoneNode owner;

    public EmployerPhoneNodeModule(EmployerPhoneNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner EmployerPhoneNode provideEmployerPhoneNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner TelephoneNode<?> provideTelephoneNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ChildName String provideChildName() {
        return owner.getContext().getNodeIdentity().getName();
    }

    @Provides @ComponentScope EmployedNode provideEmployedNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<EmployerPhoneNode> provideRuleProvider(Provider<EmployerPhoneNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<EmployerPhoneNode>> provideInstanceProviderMap(
        Provider<EmployedNodeChildProvider.EmployerPhoneNodeRuleProvider> employerPhoneNodeRuleProvider
    ) {
        Map<String, RuleProvider<EmployerPhoneNode>> result = new HashMap<>();
        result.put("employerPhoneNode", employerPhoneNodeRuleProvider.get());
        return result;
    }
}