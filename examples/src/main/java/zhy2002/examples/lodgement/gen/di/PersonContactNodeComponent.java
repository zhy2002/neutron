package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@PersonContactNodeScope
@Subcomponent(modules = {PersonContactNodeModule.class})
public interface PersonContactNodeComponent {

    PersonContactNodeRuleProvider getPersonContactNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setPersonContactNodeModule(PersonContactNodeModule module);

        PersonContactNodeComponent build();
    }
}
