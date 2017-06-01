package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {PersonOtherIncomeListNodeModule.class})
public interface PersonOtherIncomeListNodeComponent extends BaseOtherIncomeListNodeComponent {

    List<RuleProvider<PersonOtherIncomeListNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setPersonOtherIncomeListNodeModule(PersonOtherIncomeListNodeModule module);

        PersonOtherIncomeListNodeComponent build();
    }

}
