package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@PersonTypeOfChangeNodeScope
@Subcomponent(modules = {PersonTypeOfChangeNodeModule.class})
public interface PersonTypeOfChangeNodeComponent {

    PersonTypeOfChangeNodeRuleProvider getPersonTypeOfChangeNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setPersonTypeOfChangeNodeModule(PersonTypeOfChangeNodeModule module);

        PersonTypeOfChangeNodeComponent build();
    }
}
