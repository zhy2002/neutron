package zhy2002.examples.register.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.register.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {PropertyStateNodeModule.class})
public interface PropertyStateNodeComponent {

    List<RuleProvider<PropertyStateNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setPropertyStateNodeModule(PropertyStateNodeModule module);

        PropertyStateNodeComponent build();
    }

}
