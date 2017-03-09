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

    @Provides @PersonTelephoneNodeScope @Owner PersonTelephoneNode providePersonTelephoneNode() {
        return owner;
    }

    @Provides @PersonTelephoneNodeScope @Owner TelephoneNode<?> provideTelephoneNode() {
        return owner;
    }

    @Provides @PersonTelephoneNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @PersonTelephoneNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @PersonTelephoneNodeScope PersonContactNode providePersonContactNode() {
        return owner.getParent();
    }

    @Provides @PersonTelephoneNodeScope
    Map<String, RuleProvider<PersonTelephoneNode>> provideInstanceProviders(
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