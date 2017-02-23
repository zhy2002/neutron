package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@PersonOtherIncomeTypeNodeScope
@Subcomponent(modules = {PersonOtherIncomeTypeNodeModule.class})
public interface PersonOtherIncomeTypeNodeComponent {

    PersonOtherIncomeTypeNodeRuleProvider getPersonOtherIncomeTypeNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setPersonOtherIncomeTypeNodeModule(PersonOtherIncomeTypeNodeModule module);

        PersonOtherIncomeTypeNodeComponent build();
    }
}
