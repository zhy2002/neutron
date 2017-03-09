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

    @Provides @EmployerPhoneNodeScope @Owner EmployerPhoneNode provideEmployerPhoneNode() {
        return owner;
    }

    @Provides @EmployerPhoneNodeScope @Owner TelephoneNode<?> provideTelephoneNode() {
        return owner;
    }

    @Provides @EmployerPhoneNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @EmployerPhoneNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @EmployerPhoneNodeScope EmployedNode provideEmployedNode() {
        return owner.getParent();
    }

    @Provides @EmployerPhoneNodeScope
    Map<String, RuleProvider<EmployerPhoneNode>> provideInstanceProviders(
        Provider<EmployedNodeChildProvider.EmployerPhoneNodeRuleProvider> employerPhoneNodeRuleProvider
    ) {
        Map<String, RuleProvider<EmployerPhoneNode>> result = new HashMap<>();
        result.put("employerPhoneNode", employerPhoneNodeRuleProvider.get());
        return result;
    }
}