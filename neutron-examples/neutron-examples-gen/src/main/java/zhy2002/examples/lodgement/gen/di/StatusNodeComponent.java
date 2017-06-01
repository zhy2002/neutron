package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {StatusNodeModule.class})
public interface StatusNodeComponent {

    List<RuleProvider<StatusNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setStatusNodeModule(StatusNodeModule module);

        StatusNodeComponent build();
    }

}
