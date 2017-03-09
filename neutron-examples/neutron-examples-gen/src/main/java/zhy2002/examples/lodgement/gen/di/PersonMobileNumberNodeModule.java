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

    @Provides @PersonMobileNumberNodeScope @Owner PersonMobileNumberNode providePersonMobileNumberNode() {
        return owner;
    }

    @Provides @PersonMobileNumberNodeScope @Owner BaseMobileNumberNode<?> provideBaseMobileNumberNode() {
        return owner;
    }

    @Provides @PersonMobileNumberNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @PersonMobileNumberNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @PersonMobileNumberNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @PersonMobileNumberNodeScope PersonContactNode providePersonContactNode() {
        return owner.getParent();
    }

    @Provides @PersonMobileNumberNodeScope
    Map<String, RuleProvider<PersonMobileNumberNode>> provideInstanceProviders(
        Provider<PersonContactNodeChildProvider.PersonMobileNumberNodeRuleProvider> personMobileNumberNodeRuleProvider
    ) {
        Map<String, RuleProvider<PersonMobileNumberNode>> result = new HashMap<>();
        result.put("personMobileNumberNode", personMobileNumberNodeRuleProvider.get());
        return result;
    }
}