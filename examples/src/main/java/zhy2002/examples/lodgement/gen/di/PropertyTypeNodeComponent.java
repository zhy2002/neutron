package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@PropertyTypeNodeScope
@Subcomponent(modules = {PropertyTypeNodeModule.class})
public interface PropertyTypeNodeComponent {

    PropertyTypeNodeRuleProvider getPropertyTypeNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setPropertyTypeNodeModule(PropertyTypeNodeModule module);

        PropertyTypeNodeComponent build();
    }
}
