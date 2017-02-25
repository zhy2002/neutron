package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@PersonOtherIncomeDescriptionNodeScope
@Subcomponent(modules = {PersonOtherIncomeDescriptionNodeModule.class})
public interface PersonOtherIncomeDescriptionNodeComponent {

    PersonOtherIncomeDescriptionNodeRuleProvider getPersonOtherIncomeDescriptionNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setPersonOtherIncomeDescriptionNodeModule(PersonOtherIncomeDescriptionNodeModule module);

        PersonOtherIncomeDescriptionNodeComponent build();
    }
}
