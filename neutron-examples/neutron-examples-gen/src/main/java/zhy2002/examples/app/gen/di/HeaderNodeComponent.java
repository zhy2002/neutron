package zhy2002.examples.app.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.app.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {HeaderNodeModule.class})
public interface HeaderNodeComponent {

    List<RuleProvider<HeaderNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setHeaderNodeModule(HeaderNodeModule module);

        HeaderNodeComponent build();
    }

}
