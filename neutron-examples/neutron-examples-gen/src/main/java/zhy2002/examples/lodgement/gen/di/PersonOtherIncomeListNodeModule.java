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

    @Provides @ComponentScope @Owner PersonOtherIncomeListNode providePersonOtherIncomeListNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BaseOtherIncomeListNode<?> provideBaseOtherIncomeListNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ListUiNode<?,?> provideListUiNode() {
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

    @Provides @ComponentScope PersonNode providePersonNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<PersonOtherIncomeListNode> provideRuleProvider(Provider<PersonOtherIncomeListNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<PersonOtherIncomeListNode>> provideInstanceProviderMap(
        Provider<PersonNodeChildProvider.PersonOtherIncomeListNodeRuleProvider> personOtherIncomeListNodeRuleProvider
    ) {
        Map<String, RuleProvider<PersonOtherIncomeListNode>> result = new HashMap<>();
        result.put("personOtherIncomeListNode", personOtherIncomeListNodeRuleProvider.get());
        return result;
    }
}