package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class PersonResponsibleLendNodeModule {

    private final PersonResponsibleLendNode owner;

    public PersonResponsibleLendNodeModule(PersonResponsibleLendNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner PersonResponsibleLendNode providePersonResponsibleLendNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BaseResponsibleLendNode<?> provideBaseResponsibleLendNode() {
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

    @Provides @ComponentScope PersonNode providePersonNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<PersonResponsibleLendNode> provideRuleProvider(Provider<PersonResponsibleLendNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<PersonResponsibleLendNode>> provideInstanceProviderMap(
        Provider<PersonNodeChildProvider.PersonResponsibleLendNodeRuleProvider> personResponsibleLendNodeRuleProvider
    ) {
        Map<String, RuleProvider<PersonResponsibleLendNode>> result = new HashMap<>();
        result.put("personResponsibleLendNode", personResponsibleLendNodeRuleProvider.get());
        return result;
    }
}