package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {PropertyTypeNodeModule.class})
public interface PropertyTypeNodeComponent {

    List<RuleProvider<PropertyTypeNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setPropertyTypeNodeModule(PropertyTypeNodeModule module);

        PropertyTypeNodeComponent build();
    }

}
