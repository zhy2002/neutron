package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@PersonNodeScope
@Subcomponent(modules = {PersonNodeModule.class})
public interface PersonNodeComponent {

    PersonNodeRuleProvider getPersonNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setPersonNodeModule(PersonNodeModule module);

        PersonNodeComponent build();
    }
}
