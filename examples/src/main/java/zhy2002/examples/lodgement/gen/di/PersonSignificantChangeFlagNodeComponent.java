package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@PersonSignificantChangeFlagNodeScope
@Subcomponent(modules = {PersonSignificantChangeFlagNodeModule.class})
public interface PersonSignificantChangeFlagNodeComponent {

    PersonSignificantChangeFlagNodeRuleProvider getPersonSignificantChangeFlagNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setPersonSignificantChangeFlagNodeModule(PersonSignificantChangeFlagNodeModule module);

        PersonSignificantChangeFlagNodeComponent build();
    }
}
