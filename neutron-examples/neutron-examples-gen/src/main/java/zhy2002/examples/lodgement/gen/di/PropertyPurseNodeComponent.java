package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {PropertyPurseNodeModule.class})
public interface PropertyPurseNodeComponent {

    RuleProvider<PropertyPurseNode> getPropertyPurseNodeRuleProvider();
    Map<String, RuleProvider<PropertyPurseNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setPropertyPurseNodeModule(PropertyPurseNodeModule module);

        PropertyPurseNodeComponent build();
    }
}
