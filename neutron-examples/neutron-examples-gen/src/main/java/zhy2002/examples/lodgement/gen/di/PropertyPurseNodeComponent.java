package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@PropertyPurseNodeScope
@Subcomponent(modules = {PropertyPurseNodeModule.class})
public interface PropertyPurseNodeComponent {

    PropertyPurseNodeRuleProvider getPropertyPurseNodeRuleProvider();
    Map<String, RuleProvider<PropertyPurseNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setPropertyPurseNodeModule(PropertyPurseNodeModule module);

        PropertyPurseNodeComponent build();
    }
}
