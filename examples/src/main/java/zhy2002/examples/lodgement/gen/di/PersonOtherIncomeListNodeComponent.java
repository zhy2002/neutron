package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@PersonOtherIncomeListNodeScope
@Subcomponent(modules = {PersonOtherIncomeListNodeModule.class})
public interface PersonOtherIncomeListNodeComponent {

    PersonOtherIncomeListNodeRuleProvider getPersonOtherIncomeListNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setPersonOtherIncomeListNodeModule(PersonOtherIncomeListNodeModule module);

        PersonOtherIncomeListNodeComponent build();
    }
}
