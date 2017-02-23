package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@PersonOtherIncomeNodeScope
@Subcomponent(modules = {PersonOtherIncomeNodeModule.class})
public interface PersonOtherIncomeNodeComponent {

    PersonOtherIncomeNodeRuleProvider getPersonOtherIncomeNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setPersonOtherIncomeNodeModule(PersonOtherIncomeNodeModule module);

        PersonOtherIncomeNodeComponent build();
    }
}
