package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@PropertySubTypeNodeScope
@Subcomponent(modules = {PropertySubTypeNodeModule.class})
public interface PropertySubTypeNodeComponent {

    PropertySubTypeNodeRuleProvider getPropertySubTypeNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setPropertySubTypeNodeModule(PropertySubTypeNodeModule module);

        PropertySubTypeNodeComponent build();
    }
}
