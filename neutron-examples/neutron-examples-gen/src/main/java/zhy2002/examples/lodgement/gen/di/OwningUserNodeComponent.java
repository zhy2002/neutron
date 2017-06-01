package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {OwningUserNodeModule.class})
public interface OwningUserNodeComponent {

    List<RuleProvider<OwningUserNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setOwningUserNodeModule(OwningUserNodeModule module);

        OwningUserNodeComponent build();
    }

}
