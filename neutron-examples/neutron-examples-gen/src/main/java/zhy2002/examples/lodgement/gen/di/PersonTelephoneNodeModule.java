package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class PersonTelephoneNodeModule {

    private final PersonTelephoneNode owner;

    public PersonTelephoneNodeModule(PersonTelephoneNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner PersonTelephoneNode providePersonTelephoneNode() {
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

    @Provides @ComponentScope PersonContactNode providePersonContactNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<PersonTelephoneNode> provideRuleProvider(Provider<PersonTelephoneNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<PersonTelephoneNode>> provideInstanceProviderMap(
        Provider<PersonContactNodeChildProvider.HomePhoneNodeRuleProvider> homePhoneNodeRuleProvider
        ,Provider<PersonContactNodeChildProvider.WorkPhoneNodeRuleProvider> workPhoneNodeRuleProvider
        ,Provider<PersonContactNodeChildProvider.FaxNumberNodeRuleProvider> faxNumberNodeRuleProvider
    ) {
        Map<String, RuleProvider<PersonTelephoneNode>> result = new HashMap<>();
        result.put("homePhoneNode", homePhoneNodeRuleProvider.get());
        result.put("workPhoneNode", workPhoneNodeRuleProvider.get());
        result.put("faxNumberNode", faxNumberNodeRuleProvider.get());
        return result;
    }
}