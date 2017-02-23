package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@PersonOtherIncomePreviousYearNodeScope
@Subcomponent(modules = {PersonOtherIncomePreviousYearNodeModule.class})
public interface PersonOtherIncomePreviousYearNodeComponent {

    PersonOtherIncomePreviousYearNodeRuleProvider getPersonOtherIncomePreviousYearNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setPersonOtherIncomePreviousYearNodeModule(PersonOtherIncomePreviousYearNodeModule module);

        PersonOtherIncomePreviousYearNodeComponent build();
    }
}
