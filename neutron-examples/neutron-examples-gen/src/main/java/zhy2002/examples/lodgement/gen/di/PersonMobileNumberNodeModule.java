package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class PersonMobileNumberNodeModule {

    private final PersonMobileNumberNode owner;

    public PersonMobileNumberNodeModule(PersonMobileNumberNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner PersonMobileNumberNode providePersonMobileNumberNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BaseMobileNumberNode<?> provideBaseMobileNumberNode() {
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

    @Provides @ComponentScope PersonContactNode providePersonContactNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<PersonMobileNumberNode> provideRuleProvider(Provider<PersonMobileNumberNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<PersonMobileNumberNode>> provideInstanceProviderMap(
        Provider<PersonContactNodeChildProvider.PersonMobileNumberNodeRuleProvider> personMobileNumberNodeRuleProvider
    ) {
        Map<String, RuleProvider<PersonMobileNumberNode>> result = new HashMap<>();
        result.put("personMobileNumberNode", personMobileNumberNodeRuleProvider.get());
        return result;
    }
}