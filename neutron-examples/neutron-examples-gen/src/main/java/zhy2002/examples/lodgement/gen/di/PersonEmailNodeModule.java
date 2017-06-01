package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class PersonEmailNodeModule {

    private final PersonEmailNode owner;

    public PersonEmailNodeModule(PersonEmailNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner PersonEmailNode providePersonEmailNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner EmailNode<?> provideEmailNode() {
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
    RuleProvider<PersonEmailNode> provideRuleProvider(Provider<PersonEmailNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<PersonEmailNode>> provideInstanceProviderMap(
        Provider<PersonContactNodeChildProvider.PersonEmailNodeRuleProvider> personEmailNodeRuleProvider
    ) {
        Map<String, RuleProvider<PersonEmailNode>> result = new HashMap<>();
        result.put("personEmailNode", personEmailNodeRuleProvider.get());
        return result;
    }
}