package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@PersonGeneralNodeScope
@Subcomponent(modules = {PersonGeneralNodeModule.class})
public interface PersonGeneralNodeComponent {

    PersonGeneralNodeRuleProvider getPersonGeneralNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setPersonGeneralNodeModule(PersonGeneralNodeModule module);

        PersonGeneralNodeComponent build();
    }
}
