package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@PersonAddBackTypeNodeScope
@Subcomponent(modules = {PersonAddBackTypeNodeModule.class})
public interface PersonAddBackTypeNodeComponent {

    PersonAddBackTypeNodeRuleProvider getPersonAddBackTypeNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setPersonAddBackTypeNodeModule(PersonAddBackTypeNodeModule module);

        PersonAddBackTypeNodeComponent build();
    }
}
