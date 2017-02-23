package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@PersonOtherIncomeAmountNodeScope
@Subcomponent(modules = {PersonOtherIncomeAmountNodeModule.class})
public interface PersonOtherIncomeAmountNodeComponent {

    PersonOtherIncomeAmountNodeRuleProvider getPersonOtherIncomeAmountNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setPersonOtherIncomeAmountNodeModule(PersonOtherIncomeAmountNodeModule module);

        PersonOtherIncomeAmountNodeComponent build();
    }
}
