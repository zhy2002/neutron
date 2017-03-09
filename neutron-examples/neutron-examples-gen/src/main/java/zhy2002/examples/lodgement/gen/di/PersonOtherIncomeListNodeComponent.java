package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@PersonOtherIncomeListNodeScope
@Subcomponent(modules = {PersonOtherIncomeListNodeModule.class})
public interface PersonOtherIncomeListNodeComponent {

    PersonOtherIncomeListNodeRuleProvider getPersonOtherIncomeListNodeRuleProvider();
    Map<String, RuleProvider<PersonOtherIncomeListNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setPersonOtherIncomeListNodeModule(PersonOtherIncomeListNodeModule module);

        PersonOtherIncomeListNodeComponent build();
    }
}
