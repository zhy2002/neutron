package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@PropertyPurseNodeScope
@Subcomponent(modules = {PropertyPurseNodeModule.class})
public interface PropertyPurseNodeComponent {

    PropertyPurseNodeRuleProvider getPropertyPurseNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setPropertyPurseNodeModule(PropertyPurseNodeModule module);

        PropertyPurseNodeComponent build();
    }
}
