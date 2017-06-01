package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {PropertyPurseNodeModule.class})
public interface PropertyPurseNodeComponent {

    List<RuleProvider<PropertyPurseNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setPropertyPurseNodeModule(PropertyPurseNodeModule module);

        PropertyPurseNodeComponent build();
    }

}
