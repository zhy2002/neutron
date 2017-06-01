package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {AccessContactLastNameNodeModule.class})
public interface AccessContactLastNameNodeComponent {

    List<RuleProvider<AccessContactLastNameNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setAccessContactLastNameNodeModule(AccessContactLastNameNodeModule module);

        AccessContactLastNameNodeComponent build();
    }

}
