package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class PersonOtherIncomeListNodeModule {

    private final PersonOtherIncomeListNode owner;

    public PersonOtherIncomeListNodeModule(PersonOtherIncomeListNode owner) {
        this.owner = owner;
    }

    @Provides @PersonOtherIncomeListNodeScope @Owner PersonOtherIncomeListNode providePersonOtherIncomeListNode() {
        return owner;
    }

    @Provides @PersonOtherIncomeListNodeScope @Owner BaseOtherIncomeListNode<?> provideBaseOtherIncomeListNode() {
        return owner;
    }

    @Provides @PersonOtherIncomeListNodeScope @Owner ListUiNode<?,?> provideListUiNode() {
        return owner;
    }

    @Provides @PersonOtherIncomeListNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @PersonOtherIncomeListNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @PersonOtherIncomeListNodeScope PersonNode providePersonNode() {
        return owner.getParent();
    }

    @Provides @PersonOtherIncomeListNodeScope
    RuleProvider<PersonOtherIncomeListNode> provideRuleProvider(Provider<PersonOtherIncomeListNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @PersonOtherIncomeListNodeScope
    Map<String, RuleProvider<PersonOtherIncomeListNode>> provideInstanceProviderMap(
        Provider<PersonNodeChildProvider.PersonOtherIncomeListNodeRuleProvider> personOtherIncomeListNodeRuleProvider
    ) {
        Map<String, RuleProvider<PersonOtherIncomeListNode>> result = new HashMap<>();
        result.put("personOtherIncomeListNode", personOtherIncomeListNodeRuleProvider.get());
        return result;
    }
}